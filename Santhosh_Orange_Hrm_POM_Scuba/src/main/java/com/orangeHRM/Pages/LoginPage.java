package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * @author vysya
 *
 */

public class LoginPage {
	 
	WebDriver driver;
	
//Login Page Elements	
By username = 	By.id("txtUsername");
By password = By.id("txtPassword");
By loginbtn = By.id("btnLogin");

//constructor to intialize the class variable i.e., driver
public LoginPage(WebDriver driver)
{
	this.driver = driver;
}

 //Actions in login page
 
public  HomePage clickOnLogin()
{
	driver.findElement(username).sendKeys("Admin");
	driver.findElement(password).sendKeys("admin123");
	driver.findElement(loginbtn).click();
	 return new HomePage(driver);
	
}

}
