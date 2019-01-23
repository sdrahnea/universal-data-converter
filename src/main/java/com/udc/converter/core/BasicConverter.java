package com.udc.converter.core;

public interface BasicConverter {

  public boolean canConvert();
  public Object convert(String inputPath, String outputPath, RuleConverter ruleConverter);

}
