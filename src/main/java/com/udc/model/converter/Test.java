package com.udc.model.converter;

import com.udc.converter.core.CSV2XLSX;

import java.util.List;

public class Test {

  private static final String CSV_PATH = "/Users/sdrahnea/Documents/my-projects/universal-data-convertor/src/main/resources/sample-file/csv-sample.csv";
  private static final String XLSX_PATH = "/Users/sdrahnea/Documents/my-projects/universal-data-convertor/src/main/resources/sample-file/xlsx-sample.xlsx";
  private static final String JSON_PATH = "/Users/sdrahnea/Documents/my-projects/universal-data-convertor/src/main/resources/sample-file/json-sample.json";

  public final static void main (String... arg){
    //CSVObject csvObject = new CSVObject();
    ///CSV2XLSX csv2XLS = new CSV2XLSX();
    //csv2XLS.convert(CSV_PATH, XLSX_PATH, null);

    JSONDataObject jsonDataObject = new JSONDataObject();
    jsonDataObject.readFromFilePath(JSON_PATH);

  }

}
