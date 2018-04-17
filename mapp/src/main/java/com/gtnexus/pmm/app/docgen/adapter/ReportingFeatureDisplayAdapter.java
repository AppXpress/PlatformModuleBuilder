package com.gtnexus.pmm.app.docgen.adapter;

import java.util.Map;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.gtnexus.pmm.app.platform.module.model.design.ReportingFeature;

public class ReportingFeatureDisplayAdapter extends DisplayAdapter<ReportingFeature> {
    private static final Function<ReportingFeature, String> IS_ENABLED_FN = new PrimitiveDisplayFunction<ReportingFeature>() {
	@Override
	public String applyToNonNull(ReportingFeature rf) {
	    return Boolean.toString(rf.isEnabled());
	}
    };

    private static final Map<String, Function<ReportingFeature, String>> adapterMap = new ImmutableMap.Builder<String, Function<ReportingFeature, String>>()
	    .put("Enabled", IS_ENABLED_FN).build();

    public ReportingFeatureDisplayAdapter() {
	super(adapterMap);
    }

}