package com.udc.model.converter;

import com.opencsv.CSVReader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class XLSXObject extends AbstractStream {

  private static final String TYPE = "XLSX";
  private static final String SHEET = "SHEET";
  private static final String CELL = "cell";

  public List<DataObject>  readFromFilePath(String path){
    List<DataObject> sheetDataList = new LinkedList<>();

    try {
      File excelFile = new File(path);
      FileInputStream fis = new FileInputStream(excelFile);
      XSSFWorkbook workbook = new XSSFWorkbook(fis);
      for (int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++) {
        XSSFSheet sheet = workbook.getSheetAt(sheetIndex);

        TreeMap<String, TreeMap<String, String>> sheetMap = new TreeMap<>();
        // we iterate on rows
        Iterator<Row> rowIt = sheet.iterator();
        int rowIndex = 0;
        while (rowIt.hasNext()) {
          Row row = rowIt.next();
          TreeMap<String, String> rowMap = new TreeMap<>();
          // iterate on cells for the current row
          Iterator<Cell> cellIterator = row.cellIterator();
          int celIndex = 0;
          while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            rowMap.put(CELL + celIndex, cell.toString());
            celIndex++;
          }
          sheetMap.put(TYPE + rowIndex, rowMap);
          rowIndex++;
        }
        sheetDataList.add(new DataObject(SHEET + sheetIndex, sheetMap));
      }
      //workbook.close();
      fis.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return sheetDataList;
  }

  public void saveToFilePath(String plath){

  }

}
