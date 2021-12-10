package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
 * @author vysya
 *
 */
public class EmergencyDetails {
	
	WebDriver driver;
	 
	 
	
	By btnAddContact = By.id("btnAddContact");
	By Name      = By.id("emgcontacts_name");
	By RelationShip = By.id("emgcontacts_relationship");
	By Mobile = By.id("emgcontacts_mobilePhone");
	By btnSave = By.id("btnSaveEContact");
	
	public EmergencyDetails(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public  void btnAdd()
	{
		driver.findElement(btnAddContact).click();
		 
	}
	
	public   void  btnSave()
	{
		driver.findElement(Name).sendKeys("Vysyaraju");
		driver.findElement(RelationShip).sendKeys("Brother");
		driver.findElement(Mobile).sendKeys("12345678989");
		driver.findElement(btnSave).click();
		 
		
		
	}

}
