package com.week4.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.week4.helper.BrowersHelp;
import com.week4.helper.ExtentReports;
import com.week4.helper.WebUtils;
import com.week4.pages.DashBoardPage;
import com.week4.pages.LoginPage;
import com.week4.pages.TimeSheetPage;

public class TmeSheetPageTest {



	LoginPage loginObj;
	DashBoardPage dashbrdObj;
	TimeSheetPage timeshtObj;
	WebDriver driver;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;

	@BeforeMethod
	public void setup()
	{  

		BrowersHelp.StartBrowser("chrome","https://opensource-demo.orangehrmlive.com");
		loginObj =  PageFactory.initElements(driver,  LoginPage.class);
		dashbrdObj = PageFactory.initElements(driver,   DashBoardPage.class);
		timeshtObj = PageFactory.initElements(driver,   TimeSheetPage.class);
		dashbrdObj = loginObj.loginaction();
		timeshtObj = dashbrdObj.clickontimeSheetTab();

	}


	@Test
	public void testSaveBtn() throws IOException {
		timeshtObj.editaction();
		WebUtils.takeSnapshot(driver, "target/screenshots/TimeSheetTest.png");
		test.log(Status.INFO, "Page Navigated to timesheet page");
	     WebElement actualvalue1  = driver.findElement(By.xpath("////h2[text()='Status: Submitted']"));	 
		String actualvalue = 	 actualvalue1.getText();
		String expectedvalue = "Status: Submitted";
		Assert.assertEquals(actualvalue, expectedvalue);
		test.log(Status.PASS ,"TestPassed");
		
		
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
		extent.flush();
		
	}

}
