package com.udc.model.converter;

import java.io.Serializable;

public abstract class AbstractStream<T> implements Serializable {

  private T data;

  public abstract T readFromFilePath(final String path);

  public abstract void saveToFilePath(final String plath);

}
