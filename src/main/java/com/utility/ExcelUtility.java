package com.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExcelUtility {
	
	    public static Object[][] getExcelData(String filepath, String sheetName) {
		Object[][] data = null;
		
		try
		{
		FileInputStream file = new FileInputStream(filepath);
		try (Workbook book = new XSSFWorkbook (file)) {
			Sheet sheet = book.getSheet (sheetName);
			int totalRows = sheet.getLastRowNum();
			int totalColumns = sheet.getRow(0).getLastCellNum(); 
			data= new Object[totalRows][totalColumns];
			for (int i = 1; i <= totalRows; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < totalColumns; j++) {
					Cell cell = row.getCell(j);
					data[i-1][j] = (cell == null) ? "": cell.toString(); 
					System.out.println(data);
					}
					}
		}  
		}catch(Exception e) {
				e.printStackTrace();

		}
		return data;
	    }
}
