package com.test.KDL;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class KeywordTest {
	
	@Test
	public void testLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepikab\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		ExcelReadData file = new ExcelReadData();
		ReadObjects object = new ReadObjects();
		Properties allObjects = object.getObjectRepository();
		UIImplementation operation = new UIImplementation(webdriver);
		Sheet guru99Sheet = file.readExcel(System.getProperty("user.dir") + "\\src\\test\\java\\com\\test\\keyword","KeywordTestCase2.xlsx","KeywordFrameworks");
		int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();
		for (int i = 1; i < rowCount + 1; i++) {
			Row row = guru99Sheet.getRow(i);
			if (row.getCell(0) == null) {
				System.out.println(
						row.getCell(1) + "----" + row.getCell(2) + "----" + row.getCell(3) + "----" + row.getCell(4));
				try {
					operation.perform(allObjects,
							row.getCell(1) == null ? "Not a Valid KeyWord" : row.getCell(1).toString(),
							row.getCell(2) == null ? null : row.getCell(2).toString(),
							row.getCell(3) == null ? null : row.getCell(3).toString(),
							row.getCell(4) == null ? null : row.getCell(4).toString());
				} catch (Exception e) {
					System.out.println(i);
					System.out.println(e);
					break;
				}
			} else {
				System.out.println("New Testcase->" + row.getCell(0) + " Started");
			}
		}
	}
	       	    
	
}
