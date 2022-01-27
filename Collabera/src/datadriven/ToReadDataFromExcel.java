package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testResources/testdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String data1 = workbook.getSheet("Sheet1").getRow(0).getCell(1).toString();
		String data2 = workbook.getSheet("Sheet1").getRow(0).getCell(2).toString();
		LocalDateTime data3 = workbook.getSheet("Sheet1").getRow(0).getCell(3).getLocalDateTimeCellValue();
		System.out.println(data + " "+data1+ " " +data2+ " "+data3);
		
		
		
		
	}

}
