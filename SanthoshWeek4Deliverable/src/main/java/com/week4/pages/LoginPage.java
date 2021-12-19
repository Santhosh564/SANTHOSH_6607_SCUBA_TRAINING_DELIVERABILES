package com.week4.pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * @author vysya
 *
 */

public class LoginPage {
	
	DashBoardPage dashbrdObj;

	WebDriver driver;

	//Login Page Elements

	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement username;

	@FindBy(id="txtPassword" )
	@CacheLookup
	WebElement password;

	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement loginbtn ;  
	
	
 
	//constructor to intialize the class variable i.e., driver
	public LoginPage(WebDriver driver){
		 this.driver = driver;
	}


	//Actions in login page
	public  DashBoardPage loginaction( )
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbtn.click();
		return dashbrdObj;
		
		 

		 
		 
	}

}
