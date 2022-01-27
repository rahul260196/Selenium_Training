package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author rahul
 *
 */

public class ExcelLib {
	
	static String  excelPath ="./testResources/testdata.xlsx";
	
	/**
	 * This method is used to read the data from excel file
	 * @param sheetName provide the sheet name where you have the test data
	 * @param rowNum provide the row no where you have the test data
	 * @param cellNum provide the cell no  from where you want to read
	 * @return it returns the data in that respective sheet,row,cell in the form of string
	 */
	public static String readStringdata(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook= WorkbookFactory.create(fis);
		}catch(IOException e ) {
			e.printStackTrace();
		}
		return workbook.getSheet("Sheet1").getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}

}
