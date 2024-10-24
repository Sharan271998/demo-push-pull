package com.interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class SupportClass {
	
	
	public static void WriteCell(String value) throws InvalidFormatException, IOException {
		File file = new File("D:\\software\\java\\New folder\\Interview1\\excel\\trail1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.createSheet("deepak");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(2);
		cell.setCellValue(value);
		FileOutputStream ops = new FileOutputStream(file);
		workbook.write(ops);
		
		
	}
}
