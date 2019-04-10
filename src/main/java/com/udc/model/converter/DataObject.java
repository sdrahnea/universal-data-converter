package com.udc.model.converter;

import java.util.*;

public class DataObject {

  private TreeMap<String, TreeMap<String, String>> data = new TreeMap<>();
  private String root;
  private int size;

  public DataObject(String root){
    this.root = root;
    this.data.put(root, new TreeMap<>());
  }

  public DataObject(String root, TreeMap<String, TreeMap<String, String>> data){
    this.root = root;
    this.data = data;
  }

  public void addElement(String key, TreeMap<String, String> child){
    this.data.put(key, child);
  }

  public TreeMap<String, TreeMap<String, String>> getData(){
    return data;
  }

  public TreeMap<String, String> getData(int keyIndex){
    return data.get(root + keyIndex);
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
