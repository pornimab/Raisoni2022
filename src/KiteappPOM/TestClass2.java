package KiteappPOM;

import java.io.File;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestClass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 

	}


File myfile = new File("C:\\26march22\\excel file\\Book2.xlsx");



Sheet DSheet = WorkbookFactory.create(myfile).getSheet("sheet2");
}
