package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDifferentDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testResources/testdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Row row = workbook.getSheet("Sheet2").getRow(0);
		String data1 = row.getCell(0).getStringCellValue();
		LocalDateTime data2 = row.getCell(1).getLocalDateTimeCellValue();
		double data3 = row.getCell(2).getNumericCellValue();
		Date data4 = row.getCell(3).getDateCellValue();
		boolean data5 = row.getCell(4).getBooleanCellValue();
		System.out.println(data1+ " " +data2+ " " +data3+ " " +data4+ " "+data5);
		
 
	}

}
