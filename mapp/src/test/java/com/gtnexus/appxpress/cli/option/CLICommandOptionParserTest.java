package com.gtnexus.appxpress.cli.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.google.common.collect.ImmutableSet;
import com.gtnexus.appxpress.pmextractor.cli.DummyOption;
import com.gtnexus.pmm.api.v100.cli.option.CommandOption;
import com.gtnexus.pmm.api.v100.cli.option.CommandOptionParser;
import com.gtnexus.pmm.api.v100.command.SubCommandException;

public class CLICommandOptionParserTest {

    private final Set<CommandOption> optSet = new ImmutableSet.Builder<CommandOption>().add(DummyOption.DUMMY).build();
    private final CommandOptionParser parser = CommandOptionParser.createParser(optSet);

    @Test
    public void testParse() throws Exception {
	Map<CommandOption, String> parsedOpts = parser.parse(new String[] {"-Dummy"});
	assertTrue(parsedOpts.containsKey(DummyOption.DUMMY));
    }

    @Test(expected = SubCommandException.class)
    public void testParseWithInvalidOpt() throws Exception {
	parser.parse(new String[] {"-invalidOpt"});
    }

    @Test
    public void testGetCliOptionSet() throws Exception {
	assertEquals(EnumSet.allOf(DummyOption.class), parser.getCliOptionSet());
    }

}