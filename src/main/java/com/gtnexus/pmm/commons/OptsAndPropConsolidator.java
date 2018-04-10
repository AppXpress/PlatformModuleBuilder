package com.gtnexus.pmm.commons;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.gtnexus.pmm.cli.option.CommandOption;
import com.gtnexus.pmm.cli.prompt.Prompt;
import com.gtnexus.pmm.cli.prompt.SimplePrompt;
import com.gtnexus.pmm.commons.properties.PMProperties;

/**
 * Consolidates stored properties file from User, with flags passed from CLI.
 * <p>
 * Flags passed from the CLI take precedence over what is stored in the
 * properties file. If neither is present for a mandatory ExtractorOption, then
 * the user is prompted for input.
 *
 * @author jjdonov
 */
public class OptsAndPropConsolidator {

    private final Map<CommandOption, String> userArgs;
    private final Set<CommandOption> optSet;
    private final PMProperties properties;
    private final SimplePrompt asker;

    /**
     * 
     * @param userArgs
     *            Arguments passed from the CLI.
     * @param optSet
     * @param properties
     *            Properties file read from user's AppXpress directory.
     */
    public OptsAndPropConsolidator(Map<CommandOption, String> userArgs, Set<CommandOption> optSet, PMProperties properties) {
	this.userArgs = userArgs;
	this.optSet = optSet;
	this.properties = properties;
	this.asker = new SimplePrompt(System.in, System.out);
    }

    /**
     * @param userArgs
     *            Arguments passed from the CLI.
     * @param properties
     *            Properties file read from user's AppXpress directory.
     * @param inputStream
     *            CLICommandOptionhe input stream that this consolidator should read from.
     * @param printStream
     *            CLICommandOptionhe printStream that this consolidator should write to.
     */
    public OptsAndPropConsolidator(Map<CommandOption, String> userArgs, Set<CommandOption> optSet, PMProperties properties, InputStream inputStream, PrintStream printStream) {
	this.userArgs = userArgs;
	this.optSet = optSet;
	this.properties = properties;
	this.asker = new SimplePrompt(inputStream, printStream);
    }

    /**
     * @return the map of consolidated ExtractorOptions and their values.
     */
    public Map<CommandOption, String> consolidate() {
	final Map<CommandOption, String> optMap = new HashMap<>();
	for (CommandOption opt : optSet) {
	    if (!opt.shouldBeOmitted()) {
		String val = consolidateSingle(opt);
		optMap.put(opt, val);
	    }
	}
	return optMap;
    }

    /**
     * 
     * @param option
     *            the option we are consolidating
     * @return the consolidated result
     */
    private String consolidateSingle(CommandOption option) {
	String input = null;
	String propVal = null;
	if (option.isStoreableProperty()) {
	    propVal = properties.getProperty(option.getLongName());
	}
	if (userArgs.containsKey(option)) {
	    input = userArgs.get(option);
	    storeIfAppropriate(option, input);
	    return input;
	} else if (propVal != null && !propVal.isEmpty()) {
	    return propVal;
	} else if (option.isAppXpressMandatory()) {
	    input = getParameterFromUser(option);
	    storeIfAppropriate(option, input);
	    return input;
	} else {
	    return option.getDefaultValue();
	}
    }

    private void storeIfAppropriate(CommandOption option, String input) {
	if (option.isStoreableProperty()) {
	    properties.put(option.getLongName(), input);
	}
    }

    /**
     * @param option
     *            CLICommandOptionhe ExtractorOption to be query the user for.
     * @return CLICommandOptionhe value entered by the user.
     */
    private String getParameterFromUser(CommandOption option) {
	String val = asker.prompt(getMessage(option));
	while (!option.isValid(val)) {
	    val = asker.prompt(Prompt.INVALID_INPUT);
	}
	return val;
    }
    
    private String getMessage(CommandOption option) {
	Class<?> type = option.getType();
	String name = option.getLongName();
	if (type.equals(Integer.class)) {
	    return ("Please enter the number of " + name + "(s): ");
	} else if (type.equals(String.class)) {
	    return ("Please enter " + name + ": ");
	} else if (type.equals(Boolean.class)) {
	    return ("Do you want " + name + "? [y/n]: ");
	}
	throw new IllegalArgumentException("Option type" + type.toString() + " is unsupported");
    }

}