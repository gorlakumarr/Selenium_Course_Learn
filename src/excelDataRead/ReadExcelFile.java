package excelDataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.testng.annotations.DataProvider;

public class ReadExcelFile {

	@Test(dataProvider = "DataSource")
	public void readFile(String set1, String set2, String set3, String set4, String set5, String set6, String set7,
			String set8, String set9, String set10, String set11, String set12, String set13, String set14, String set15

	) {
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		System.out.println(set4);
		System.out.println(set5);
		System.out.println(set6);
		System.out.println(set7);
		System.out.println(set8);
		System.out.println(set9);
		System.out.println(set10);
		System.out.println(set11);
		System.out.println(set12);
		System.out.println(set13);
		System.out.println(set14);
		System.out.println(set15);

	}

	@DataProvider(name = "DataSource")
	public Object[][] dataExcel() throws InvalidFormatException, IOException {

		// read excel file
		File file = new File("./TestData/TestData.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

		// get sheet no
		XSSFSheet sheet = workbook.getSheetAt(0);

		// get row
		int noofrows = sheet.getLastRowNum();
		int noofcolumns = sheet.getRow(0).getLastCellNum();

		Object[][] obj = new Object[noofrows][noofcolumns];

		for (int i = 1; i <= noofrows; i++) {

			XSSFRow row1 = sheet.getRow(i);

			for (int j = 0; j < noofcolumns; j++) {

				XSSFCell coloumn = row1.getCell(j);
				String Data = coloumn.getStringCellValue();
				obj[i - 1][j] = Data;
			}

		}
		workbook.close();
		return obj;
	}
}
