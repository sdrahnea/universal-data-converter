package com.udc.model.converter;

import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class JSONDataObject extends AbstractStream {

  public DataObject readFromFilePath(String path){
    try {
      JsonReader jsonReader = new JsonReader(new FileReader(path));
      if (isJsonArray(jsonReader)) {
        jsonReader.beginArray();
      } else {
        jsonReader.beginObject();
      }
      while (jsonReader.hasNext()) {
        String name = jsonReader.nextName();
        System.out.println(name);
      }

    } catch(Exception ex) {
      System.out.println("" + ex);
    }
    return null;
  }

  public void saveToFilePath(String plath){

  }

  private boolean isJsonArray(JsonReader jsonReader) throws IOException {
    try {
      jsonReader.beginObject();
      return false;
    } catch (IllegalStateException ex){}
    return true;
  }

}
