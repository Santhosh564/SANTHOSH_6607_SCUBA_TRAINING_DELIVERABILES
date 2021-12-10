package com.orangeHRM.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.Pages.HomePage;
import com.orangeHRM.Pages.LoginPage;
import com.orangeHRM.Pages.PersonalDetails;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author vysya
 *
 */
public class HomePageTest {
	
	LoginPage loginpage;
	HomePage homepage;
	PersonalDetails personaldetails;
	
	WebDriver driver;
	
	@BeforeMethod
	public void setupForHomePage() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		   loginpage = new LoginPage(driver);
		   homepage = new HomePage(driver);
		  homepage =  loginpage.clickOnLogin();
		  Thread.sleep(3000);
	}
	
	 @Test(priority =1)
	  public void  VerifyclickonMyinfo() throws InterruptedException {
		 
		// homepage = new HomePage(driver);
		personaldetails =  homepage.clickonMyInfoTab();
		  
	 }	
	 

}
