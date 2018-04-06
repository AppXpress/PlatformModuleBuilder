package com.gtnexus.pmm.cli.option.options;

import com.gtnexus.pmm.cli.asker.ValidityProvider;
import com.gtnexus.pmm.cli.option.CommandOption;
import com.gtnexus.pmm.cli.option.OptionMessageProvider;

public class ModuleOption implements CommandOption {

    private final OptionMessageProvider msgProvider = new OptionMessageProvider();
    private final ValidityProvider validityProvider = new ValidityProvider();

    @Override
    public String getLongName() {
	return "module";
    }

    @Override
    public String getFlag() {
	return "m";
    }

    @Override
    public Class<?> getType() {
	return String.class;
    }

    @Override
    public String getDescription() {
	return "The name of the module";
    }

    @Override
    public boolean hasArg() {
	return true;
    }

    @Override
    public boolean isHelpFlag() {
	return false;
    }

    @Override
    public String getMessage() {
	return msgProvider.getMessage(this.getType(), this.getLongName());
    }

    @Override
    public boolean isAppXpressMandatory() {
	return true;
    }

    @Override
    public boolean shouldBeOmitted() {
	return false;
    }

    @Override
    public boolean isValid(String val) {
	return validityProvider.isValid(val, this.getType());
    }

    @Override
    public String getDefaultValue() {
	return null;
    }

    @Override
    public boolean isStoreableProperty() {
	return false;
    }

}
