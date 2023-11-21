package com.BaseMethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class ExcelDataPre {
	FileInputStream fis;
	Workbook workbook;
		
	@DataProvider(name ="data")
	private  Object[][] getExcelData() throws IOException {
		
		File file = new File("C:\\Users\\Public\\Jdk\\TestNG\\Excel\\DataDriven.xlsx");
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("Sheet1");

		int lastrowNum = sheet.getLastRowNum();
		int lastcellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Row:"+lastrowNum);
		System.out.println("Column:"+lastcellNum);
		
		Object[][] data = new Object[lastrowNum][lastcellNum];
		
		for (int i = 1; i<=lastrowNum; i++) {
			for (int j= 0; j<lastcellNum; j++) {
				Cell cell2 = sheet.getRow(i).getCell(j);
				DataFormatter dataformat = new DataFormatter();
				data[i-1][j]=dataformat.formatCellValue(cell2);
			}
		}
		return data;
}
}
