/**
 * 
 */
package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Santhosh_Raj_Vysyaraju
 *This page includes locators for login and methods associated with it.
 */
public class LoginPage {
	WebDriver driver;
	By username=By.id("txtUsername");
	By password=By.name("txtPassword");
	By loginButton=By.xpath("//input[@name='Submit']");
	By forgotYourNames=By.xpath("//a[contains(text(),'Forgot your password?')]");

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void loginToOrangeHRM(String userid,String pass)
	{
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();

	}



}
