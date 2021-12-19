package com.week4.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.week4.helper.BrowersHelp;
import com.week4.helper.ExtentReports;
import com.week4.pages.DashBoardPage;
import com.week4.pages.LoginPage;
import com.week4.pages.TimeSheetPage;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author vysya
 *
 */
public class DashBoardPageTest {
	
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
		dashbrdObj =PageFactory.initElements(driver,  DashBoardPage.class);  
		 
		loginObj.loginaction( );
			
	}
	
	
	@Test
	public void testclickontimeSheetTab()
	{
		timeshtObj = dashbrdObj.clickontimeSheetTab();
	}

	 @AfterMethod
	 public void teardown()
	 {
		 driver.quit();
	 }

}
