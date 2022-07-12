package excelfile;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// create excel sheet and pass the path along with name and extension in File Object
		
		File myfile= new File("C:\\26march22\\excel file\\Book1.xlsx");
		
				// Using WorkBookFactory class read excel sheet
				// how to read String value

		String name =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				System.out.println(name);
				
				// how to read char value
				
		String mychar =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
						System.out.println(mychar);
						
				//how to read boolean value
		boolean myValue =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
						System.out.println(myValue);
						
	    double value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(4).getCell(0).getNumericCellValue();
						System.out.println(value);
						
						
	}

}
