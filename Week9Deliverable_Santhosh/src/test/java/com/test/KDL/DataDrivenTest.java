package com.test.KDL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	@BeforeTest
	public void initialization () {

		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepikab\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void dataLoginTest() throws IOException {
       try {
		File src = new File(System.getProperty("user.dir") + "\\src\\test\\java\\com\\test\\keyword\\Data.xlsx");

		FileInputStream fis = new FileInputStream(src);

		workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			cell = sheet.getRow(i).getCell(0);
			cell.setCellType(CellType.STRING);
			driver.findElement(By.xpath("//input[@id='txtUsername']")).clear();
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(cell.getStringCellValue());
			cell = sheet.getRow(i).getCell(1);
			cell.setCellType(CellType.STRING);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).clear();
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
            Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@id='welcome']")).click();
            Thread.sleep(10000);
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			Thread.sleep(10000);
			//driver.close();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
