package com.udc.converter.core;

import com.udc.converter.core.engine.RuleConverter;
import com.udc.model.converter.CSVObject;
import com.udc.model.converter.DataObject;
import org.apache.poi.ss.usermodel.*;
import java.io.FileOutputStream;
import java.util.TreeMap;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CSV2XLSX implements BasicConverter {

  private String inputFileType;
  private String outputFileType;

  @Override
  public boolean canConvert() {
    return false;
  }

  @Override
  public Object convert(String inputPath, String outputPath, RuleConverter ruleConverter) {
    try {

      CSVObject csvObject = new CSVObject();
      DataObject dataObject = csvObject.readFromFilePath(inputPath);

      Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file
            /* CreationHelper helps us create instances of various things like DataFormat,
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
      CreationHelper createHelper = workbook.getCreationHelper();
      Sheet sheet = workbook.createSheet("Result");
      for (int rowIndex = 0; rowIndex < dataObject.getSize(); rowIndex++) {
        Row row = sheet.createRow(rowIndex);
        TreeMap<String, String> rowMap = dataObject.getData(rowIndex);
        for(int cellIndex = 0; cellIndex < rowMap.size(); cellIndex++){
          row.createCell(cellIndex).setCellValue(rowMap.get("cell" + cellIndex));
        }
      }

      // Write the output to a file
      FileOutputStream fileOut = new FileOutputStream(outputPath);
      workbook.write(fileOut);
      fileOut.close();

      // Closing the workbook
      //workbook.close();

    } catch (Exception ex) {
    }
    return null;
  }

}
