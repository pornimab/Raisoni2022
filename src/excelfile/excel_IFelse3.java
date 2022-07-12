package excelfile;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_IFelse3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile = new File("C:\\26march22\\excel file\\Book2.xlsx");
		
		
		
	Sheet DSheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		
	int totalnumberofrows = DSheet.getLastRowNum();  //will give total number of counts
	
	int rowcount = totalnumberofrows;
	System.out.println("total number of rows are "+rowcount);
		
    int totalnumberofcell = DSheet.getLastRowNum();
    int cellcount = totalnumberofcell;
    System.out.println("total number of cell are "+cellcount);
	System.out.println("========================");
    
    for(int p = 0;p<=rowcount;p++) //  outer for loop---------------- for rows
    {
    	for(int s = 0;s<=cellcount;s++)  // inner for loop ----------------for columns/cell
    	{
    	Cell value = DSheet.getRow(p).getCell(s);
    	CellType datatype = value.getCellType();
    	
    	if(datatype==CellType.STRING)
    	{
    		String create = value.getStringCellValue();
    		System.out.println(create+" ");  //+" "  -----------for seperation of word
    	}
    	
    	else if(datatype==CellType.NUMERIC)
    	{
    		double create = value.getNumericCellValue();
    		System.out.println(create+" ");  //+" "  -----------for seperation of word
    		
    	}
    	
    	else if(datatype==CellType.BOOLEAN)
    	{
    		boolean create = value.getBooleanCellValue();
    		System.out.println(create+" ");  //+" "  -----------for seperation of word
    	}
    	
    	else if(datatype==CellType.BLANK)
    	{
    		System.out.print(" ");
    	}
    	}
    }

	}

}
