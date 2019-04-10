package com.udc.converter.core;

import com.udc.converter.core.engine.RuleConverter;

public interface BasicConverter {

  public boolean canConvert();
  public Object convert(String inputPath, String outputPath, RuleConverter ruleConverter);

}
