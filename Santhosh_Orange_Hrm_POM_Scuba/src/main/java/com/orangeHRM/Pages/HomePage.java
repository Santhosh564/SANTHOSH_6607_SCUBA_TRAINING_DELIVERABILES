package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
 * @author vysya
 *
 */

public class HomePage {
	
	WebDriver driver;
	By  myInfoTab = 	By.xpath("//b[contains(text(),'My Info')]");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public  PersonalDetails clickonMyInfoTab()
	{
		driver.findElement(myInfoTab).click();
		return new PersonalDetails(driver);
		
		
	}

}
