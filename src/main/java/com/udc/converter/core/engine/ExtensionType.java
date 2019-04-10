package com.udc.converter.core.engine;

public enum  ExtensionType {

  XLS("excel")
  , CSV("csv")
  , JSON("json")
  , XML("xml")
  ;

  ExtensionType(String description){
    this.description = description;
  }

  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
