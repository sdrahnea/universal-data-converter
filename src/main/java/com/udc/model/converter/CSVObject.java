package com.udc.model.converter;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.TreeMap;

public class CSVObject extends AbstractStream {

  private static final String TYPE = "CSV";
  private static final String CELL = "cell";

  public DataObject readFromFilePath(String path){
    CSVReader reader = null;
    DataObject dataObject = new DataObject(TYPE);
    int index = 0;
    try {

      reader = new CSVReader(new FileReader(path));
      String[] line;
      while ((line = reader.readNext()) != null) {
        TreeMap<String, String> row = new TreeMap<>();
        int celIndex = 0;
        for (String celValue : line) {
          row.put(CELL + celIndex, celValue);
          celIndex++;
        }
        dataObject.addElement(TYPE + index, row);
        index++;
      }

      dataObject.setSize(index);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return dataObject;
  }

  public void saveToFilePath(String plath){

  }

}
