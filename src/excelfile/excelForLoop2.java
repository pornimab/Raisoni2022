package excelfile;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelForLoop2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile = new File("C:\\26march22\\excel file\\Book2.xlsx");
		
		// we are checking all nthe types of methods (string, boolean, numerical)
		
		Workbook book = WorkbookFactory.create(myfile);
		
		Sheet MSheet = book.getSheet("Sheet1");
		Row MRow = MSheet.getRow(2);
		Cell MCell = MRow.getCell(2);
		System.out.println(MCell.getCellType());
		
		System.out.println("========================");
		// code for reading whole data from excelsheet
		
		Sheet QSheet = book.getSheet("Sheet2");
		for(int i=0;i<=2;i++) //outer loop for --rows
			
		{
			for(int k=0;k<=3;k++) //inner for loop -----for columns
			{
				String create = QSheet.getRow(i).getCell(k).getStringCellValue();
				
				System.out.print(create+" "); //+" "  -----------for seperation of word
			}
			
			System.out.println();  // for outer for loop
		}
		
		
	}

}
