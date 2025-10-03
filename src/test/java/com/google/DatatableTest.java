package com.google;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatatableTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file = new File("C:\\Users\\prsadana\\eclipse-workspace\\CGSelenium\\ExcelData\\Data1.xlsx");
		/*
		FileOutputStream fos = new FileOutputStream(file);
		
		// create workbook
		Workbook work1 = new XSSFWorkbook();
//		XSSFWorkbook work1 = new XSSFWorkbook();
		
		// create sheet
		Sheet sheet = work1.createSheet();
		
		// create row
		sheet.createRow(0);
		
		// create cell & set the value
		sheet.getRow(0).createCell(0).setCellValue("Welcome");
		sheet.getRow(0).createCell(1).setCellValue(2000);
		
		// create another sheet & row
		Sheet sheet1 = work1.createSheet("Testdata");
		sheet1.createRow(0);
		sheet1.getRow(0).createCell(0).setCellValue("CG");
		
		sheet1.createRow(1);
		sheet1.getRow(1).createCell(0).setCellValue(false);
		
		work1.write(fos);
		work1.close();
		*/
		
		// InputStream
		File file = new File("C:\\Users\\prsadana\\eclipse-workspace\\CGSelenium\\ExcelData\\Data1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		Sheet sheet1 = workbook.getSheet("Testdata");
		
		// 1st way
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
		// 2nd way
		String cell1 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cell1);
		
		Number cell2 = sheet.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(cell2);
		
		workbook.close();
		fis.close();
		
		
	}

}
