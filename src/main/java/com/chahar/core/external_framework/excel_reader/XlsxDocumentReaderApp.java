package com.chahar.core.external_framework.excel_reader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HSSF (Horrible SpreadSheet Format) – reads and writes Microsoft Excel (XLS) format files. provided by poi-3.7.jar
 *
 *
 * XSSF (XML SpreadSheet Format) – reads and writes Office Open XML (XLSX) format files. provided by poi-ooxml-3.7.jar
 *
 * **/

public class XlsxDocumentReaderApp {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String targetFilePath = "C:\\Users\\yschahar\\Desktop\\processing1\\PackRatio-2.xlsx";

        FileInputStream excelFileStream = new FileInputStream(new File(targetFilePath));

        // Finds the workbook instance for XLSX file:
        XSSFWorkbook myWorkBook = new XSSFWorkbook (excelFileStream);

        // Return first sheet from the XLSX workbook, will have only one sheet.
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);

        // Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = mySheet.iterator();

        Map<Integer,String>[] records = (Map<Integer,String>[]) new HashMap<?,?> [mySheet.getPhysicalNumberOfRows()];
        int rowIndex = 0;// Traversing over each row of XLSX file
        while (rowIterator.hasNext()){
            Row row = rowIterator.next();

            Map<Integer,String> rowRecord = new HashMap<>();

            for(int cellIndex = 0;cellIndex<row.getPhysicalNumberOfCells();cellIndex++){
                rowRecord.put(cellIndex, getCellData(row.getCell(cellIndex)));
            }
            records[rowIndex++] = rowRecord;

            System.out.println(rowRecord);
        }

        System.out.println(records);

    }

    public static String getCellData(Cell cell){
        String data = null;
        if(Cell.CELL_TYPE_NUMERIC == cell.getCellType()){
            data = "" + cell.getNumericCellValue();
        }else if(Cell.CELL_TYPE_STRING== cell.getCellType()){
            data = cell.getStringCellValue();
        }else{
            System.out.println("null found.");
        }


        return data;
    }

}
