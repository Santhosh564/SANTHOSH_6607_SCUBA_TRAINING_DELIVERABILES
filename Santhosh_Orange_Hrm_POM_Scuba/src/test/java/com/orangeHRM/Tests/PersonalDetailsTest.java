package com.orangeHRM.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.Pages.ContactDetails;
import com.orangeHRM.Pages.HomePage;
import com.orangeHRM.Pages.LoginPage;
import com.orangeHRM.Pages.PersonalDetails;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author vysya
 *
 */
public class  PersonalDetailsTest {
	
	LoginPage loginpage;
	HomePage homepage;
	PersonalDetails personaldetails;
	ContactDetails contactdetails;
	
	WebDriver driver;
	
	@BeforeClass
	public void setupForHomePage() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		   loginpage = new LoginPage(driver);
		   homepage = new HomePage(driver);
		   personaldetails = new PersonalDetails(driver);
		  homepage =  loginpage.clickOnLogin();
		  personaldetails =  homepage.clickonMyInfoTab();
		//  personaldetails = new PersonalDetails(driver);
		  Thread.sleep(3000);
	}
	
	 @Test(priority =1)
	  public void   verifyeditbtn() throws InterruptedException {
		 
	    personaldetails.btnEdit();
		 
		  
	 }	
	 
	 @Test(priority =2)
	 public void verifybtnsave()
	 {
		contactdetails =  personaldetails.btncontactDetails();
	 }
	 
	 

}
 