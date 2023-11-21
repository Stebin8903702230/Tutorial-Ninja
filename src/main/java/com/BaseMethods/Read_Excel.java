package com.BaseMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Read_Excel extends BaseClass{
	FileInputStream fis;
	XSSFWorkbook workbook;
	Object data[];

	// Read Data from Excel
	@DataProvider(name="data")
		public Object[]  Read_Excel() throws IOException {
		data = new Object[4];
			File file = new File("C:\\Users\\Public\\Jdk\\TestNG\\Excel\\DataDriven.xlsx");
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			XSSFRow row0 = sheet.getRow(0);
			XSSFRow row1 = sheet.getRow(1);
			XSSFRow row2 = sheet.getRow(2);
			XSSFRow row3 = sheet.getRow(3);

			XSSFCell cell0 = row0.getCell(0);
			XSSFCell cell1 = row1.getCell(0);
			XSSFCell cell2 = row2.getCell(0);
			XSSFCell cell3 = row3.getCell(0);
			
			data[0] = cell0;
			data[1] = cell1;
			data[2] = cell2;
			data[3] = cell3;
			
			System.out.println(cell0);
			System.out.println(cell1);
			System.out.println(cell2);
			System.out.println(cell3);
			
			return data;
			}
		


//			Excel.input_Data();
//			Excel.Excel_To_WebData();
//			Excel.read_MultipleData();
//			Excel.WebData_To_Excel();
			
		}

//		private Object[] read_Data() {
//				return data;			
//		}



//Read Multiple Data from Excel
	/*			public void  read_MultipleData() throws IOException {
					File file = new File("C:\\Users\\Public\\Jdk\\TestNG\\Excel\\DataDriven.xlsx");
					fis = new FileInputStream(file);
					workbook = new XSSFWorkbook(fis);
					XSSFSheet sheet = workbook.getSheet("Sheet1");

					int row = sheet.getLastRowNum();
					int cell = sheet.getRow(row).getLastCellNum();
//					System.out.println(cell);
					
					for (int r = 0; r<=row; r++) {
						XSSFRow row2 = sheet.getRow(r);
						for (int c= 0; c<cell; c++) {
							XSSFCell cell2 = row2.getCell(c);
							
							switch (cell2.getCellType()) {
							case STRING: System.out.print(cell2.getStringCellValue());
							break;
							case NUMERIC: System.out.print(cell2.getNumericCellValue());
							break;
							}
							System.out.print("\t\t");
						}
						System.out.println("\t\t");
					}
				}			*/	