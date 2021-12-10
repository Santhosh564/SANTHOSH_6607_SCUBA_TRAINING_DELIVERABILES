package com.orangeHRM.Tests;
import com.orangeHRM.Pages.HomePage;
import com.orangeHRM.Pages.LoginPage;
import com.orangeHRM.Pages.PersonalDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author vysya
 *
 */
public class LoginTest {
	
	
	LoginPage loginpage;
	HomePage homepage;
	
	WebDriver driver;
	
	 @Test(priority =1)
	  public void VerifyLogin() throws InterruptedException {
		  
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		   loginpage = new LoginPage(driver);
		  
		  
         //calling actions of loginPage
		 homepage =  loginpage.clickOnLogin();
		  Thread.sleep(3000);
		  //driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
		  Thread.sleep(2000);
		  
	 }	
	 

}



