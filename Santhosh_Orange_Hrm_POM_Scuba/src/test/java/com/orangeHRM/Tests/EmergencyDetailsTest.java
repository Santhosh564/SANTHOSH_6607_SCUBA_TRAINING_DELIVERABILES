 package com.orangeHRM.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.Pages.ContactDetails;
import com.orangeHRM.Pages.EmergencyDetails;
import com.orangeHRM.Pages.HomePage;
import com.orangeHRM.Pages.LoginPage;
import com.orangeHRM.Pages.PersonalDetails;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * @author vysya
 *
 */

public class   EmergencyDetailsTest {
	
	LoginPage loginpage;
	HomePage homepage;
	PersonalDetails personaldetails;
	ContactDetails contactdetails;
    EmergencyDetails emergencydetails; 
	 
 
	
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
		   
		   contactdetails = new ContactDetails(driver);
		   
		   emergencydetails = new EmergencyDetails(driver);
		  
		  homepage =  loginpage.clickOnLogin();
		  personaldetails =  homepage.clickonMyInfoTab();
		  personaldetails.btnEdit();
		  contactdetails =  personaldetails.btncontactDetails();
		  contactdetails.btnedit();
		  contactdetails.btnSave();
		emergencydetails =   contactdetails.btnEmergencyDetails();
		  
		 
		  Thread.sleep(3000);
	}
	
	 @Test(priority =1)
	 public void verifybtnAdd()
	 {
		 
	   
		 emergencydetails.btnAdd();
		  
	 }	
	 
	 @Test(priority =2)
	 public void verifybtnsave()
	 {
		  emergencydetails.btnSave();
	 }
}
	 
	 