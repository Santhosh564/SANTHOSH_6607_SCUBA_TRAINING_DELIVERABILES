package com.week5.tests;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTest {

	public WebDriver driver;
    public int i,j;

	@Test(priority =1)
	public void testWebTableGetMaxPrevClose()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List columns =   driver.findElements(By.xpath("//table[@class = 'dataTable']/thead/tr/th"));
		int columnCount = columns.size();
		List Rows =   driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr"));
		int RowCount = Rows.size();
		System.out.println("Columns count is "+columnCount+" Row count is "+RowCount);
		//To calculate maximum value in one column i.e prev close
		//Xpath = //table[@class = 'dataTable']/thead/tr/th[3]/following::tr/td[3]
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i =1;i<=RowCount;i++)
		{
			String prevClose = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[3]")).getText();
			Double  DprevClose = Double.parseDouble(prevClose);
			int intPrice = DprevClose.intValue();
			array.add(intPrice);		 
		}
		// Collections.sort(array);
		Collections.sort(array);
		System.out.println(array.get(0));
		System.out.println(array.get(array.size()-1));
	}

	@Test(priority =2)
	public void testWebTableGetMaxCurrentPrice()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List columns =   driver.findElements(By.xpath("//table[@class = 'dataTable']/thead/tr/th"));
		int columnCount = columns.size();
		List Rows =   driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr"));
		int RowCount1 = Rows.size();
		System.out.println("Columns count is "+columnCount+" Row count is "+RowCount1);
		//To calculate maximum value in one column i.e prev close
		//Xpath = //table[@class = 'dataTable']/thead/tr/th[3]/following::tr/td[4]
		 
			ArrayList<Integer> array1 = new ArrayList<Integer>();
		for( j =1;j<=RowCount1;j++)
		{
			String price = driver.findElement(By.xpath("//table[@class ='dataTable']/tbody/tr["+j+"]/td[4]")).getText();
			Double  DPrice = Double.parseDouble(price);
			int intPrice = DPrice.intValue();
			array1.add(intPrice);		 
		}
		// Collections.sort(array);
		Collections.sort(array1);
		System.out.println(array1.get(0));
	} 




}
