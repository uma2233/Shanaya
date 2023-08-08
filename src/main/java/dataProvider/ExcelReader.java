package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static Object[][] getDataFromSheet(String sheetName){
		Object[][] arr = null;
		try {
			File src = new File("C:\\Users\\singh\\eclipse-workspace\\HybridFramework\\testdata1\\testdata.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("login");
			int rows = sheet.getPhysicalNumberOfRows();
			int columns = sheet.getRow(0).getPhysicalNumberOfCells();
			arr = new Object[rows][columns];
			for(int i =0;i<rows;i++) {
				for(int j=0; j<columns;j++) {
					arr[i][j] = wb.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
					
				}}}catch(FileNotFoundException e) {
					System.out.println("could not found file" + e.getMessage());
				}catch(IOException e) {
					System.out.println("could not found file" + e.getMessage());
				}
				return arr;
			
	}
	}

