package com.google;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PhysicalRow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\prsadana\\eclipse-workspace\\CGSelenium\\ExcelData\\Data1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		Sheet sheet1 = workbook.getSheet("Testdata");
		
		// rows calculates from 0
		int firstrow = sheet.getFirstRowNum();
		int lastrow = sheet.getLastRowNum();
//		System.out.println(firstrow + " "+ lastrow);
		
		// cells in column starts from 1, seperate for all rows
		int firstcol = sheet.getRow(0).getFirstCellNum();
		int lastcol = sheet.getRow(0).getLastCellNum();
//		System.out.println(firstcol+" "+lastcol);
		
		int firstcol1 = sheet.getRow(1).getFirstCellNum();
		int lastcol1 = sheet.getRow(1).getLastCellNum();
//		System.out.println(firstcol1+" "+lastcol1);
		
		// above row col , used for looping and conditions to check conditions satisfying
		
		// physical row & col
		int totalr = sheet.getRow(0).getPhysicalNumberOfCells();
//		System.out.println(totalr);
		
		for(int i=firstrow;i<=lastrow;i++) {
			int currFirstCol = sheet.getRow(i).getFirstCellNum();
			int currLastCol = sheet.getRow(i).getLastCellNum();
			for(int j=currFirstCol;j<currLastCol;j++) {
				System.out.print(sheet.getRow(i).getCell(j) + " ");
			}
			System.out.println();
		}
	}

}

//package com.parameter;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//
//public class ExcelReader {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		File file = new File("C:\\Users\\prsadana\\eclipse-workspace\\Sprint_Implementation\\src\\test\\resources\\Exceldata\\TestData.xlsx");
//		FileInputStream fis = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(fis);
//		Sheet sheet = workbook.getSheetAt(0);
//	
//		
//		// rows calculates from 0
//		int firstrow = sheet.getFirstRowNum();
//		int lastrow = sheet.getLastRowNum();
//		System.out.println(firstrow + " "+ lastrow);
//		
//		// cells in column starts from 1, seperate for all rows
//		int firstcol = sheet.getRow(0).getFirstCellNum();
//		int lastcol = sheet.getRow(0).getLastCellNum();
//		System.out.println(firstcol+" "+lastcol);
//		
//		
//		// above row col , used for looping and conditions to check conditions satisfying
//		
//		// physical row & col
//		int totalr = sheet.getRow(0).getPhysicalNumberOfCells();
//		System.out.println(totalr);
//		
//		int rowCount = sheet.getPhysicalNumberOfRows();
//		System.out.println("physical no. of rows : " + rowCount);
//		
//		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
//		System.out.println("physical no. of col : " + colCount);
//		
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(1);
////		System.out.println(cell.getStringCellValue());
//		System.out.println(cell.getCellType());
//		
////		for(int i=firstrow;i<=lastrow;i++) {
////			int currFirstCol = sheet.getRow(i).getFirstCellNum();
////			int currLastCol = sheet.getRow(i).getLastCellNum();
////			for(int j=currFirstCol;j<currLastCol;j++) {
////				System.out.print(sheet.getRow(i).getCell(j) + " ");
////			}
////			System.out.println();
////		}
//	}
//		
//
//}
//
