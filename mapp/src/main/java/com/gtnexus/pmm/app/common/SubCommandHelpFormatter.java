package com.gtnexus.pmm.app.common;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;

import com.gtnexus.pmm.api.v100.cli.option.CommandOptionTransformers;
import com.gtnexus.pmm.api.v100.command.SubCommand;

public class SubCommandHelpFormatter {

    private final SubCommand cmd;

    public SubCommandHelpFormatter(SubCommand cmd) {
	this.cmd = cmd;
    }

    public void displayHelp() {
	HelpFormatter helpFormatter = new HelpFormatter();
	Options opts = CommandOptionTransformers.transformToOptions(cmd.getOptions());
	helpFormatter.printHelp(cmd.getName(), cmd.getHelpHeader(), opts, cmd.getHelpFooter());
	return;
    }

}