package com.week4.tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
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


/**
 * @author vysya
 *
 */
public class LoginTest {
	
	LoginPage loginObj;
	DashBoardPage dashbrdObj;
	WebDriver driver;
	
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	
	@BeforeMethod
	public void setup()
	{
		extent = ExtentReports.getReports();
		BrowersHelp.StartBrowser("chrome","https://opensource-demo.orangehrmlive.com");
		test.log(Status.INFO, "Chrome browser Started");		
		loginObj =  PageFactory.initElements(driver,  LoginPage.class);	
		test.log(Status.PASS, "navigated to home page");
		 
		
	}
	
	@Test
	public void testLoginAction() throws IOException
	{
	dashbrdObj = 	loginObj.loginaction( );
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "OrangeHRM";
	AssertJUnit.assertEquals(ActualTitle, ExpectedTitle);
	WebUtils.takeSnapshot(driver, "target/screenshots/TimeSheetLogintest2.png"); 
	
	}
	
	
	
	 @AfterMethod
	 public void teardown()
	 {
		 driver.quit();
		 extent.flush();
	 }

}



