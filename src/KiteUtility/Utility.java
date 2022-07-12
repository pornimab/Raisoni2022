package KiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Utility {
  
  public static String readDataFromExcel1(int row, int cell) throws EncryptedDocumentException, IOException 
  {
	  File myfile= new File("C:\\26march22\\excel file\\Book1.xlsx"); 
	  Sheet NewSheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	  
	  String value = NewSheet.getRow(row).getCell(cell).getStringCellValue();
	  return value;
  }
}


