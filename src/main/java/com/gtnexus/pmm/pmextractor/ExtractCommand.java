package com.gtnexus.pmm.pmextractor;

import com.google.common.base.Preconditions;
import com.gtnexus.pmm.AppXpressException;
import com.gtnexus.pmm.commons.command.Command;
import com.gtnexus.pmm.context.ContextFactory;
import com.gtnexus.pmm.context.PmmContext;

public class ExtractCommand implements Command {

    private String[] args;

    public ExtractCommand(String... args) {
	Preconditions.checkNotNull(args);
	this.args = args;
    }

    @Override
    public void execute() throws AppXpressException {
	PlatformModuleExtractor extractor = new PlatformModuleExtractor();
	PmmContext context;
	try {
	    context = ContextFactory.createContext(extractor, args);
	    extractor.extract(context);
	} catch (AppXpressException e) {
	    throw new AppXpressException("extract has failed.", e);
	}
    }

}