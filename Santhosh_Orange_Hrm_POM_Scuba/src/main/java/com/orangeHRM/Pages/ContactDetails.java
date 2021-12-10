package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
 * @author vysya
 *
 */
public class ContactDetails {
	
	
	WebDriver driver;
	
	By btnEdit = By.id("btnSave");
	By Adresss1 = By.name("contact[street1]");
	By Address2 = By.name("contact[street2]");
	By Country = By.tagName("select");
	By workMail = By.className("formInputText");
	By btnSave = By.id("btnSave");
	By EmergencyDetailsTab = By.xpath("//a[contains(text(),'Emergency Contacts')]");
	
	public ContactDetails(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void btnedit()
	{
		driver.findElement(btnEdit).click();
	}
	
	public void btnSave()
	{
		driver.findElement(Adresss1).sendKeys("Vizag");
		driver.findElement(Address2).sendKeys("Near Bus stop");
		driver.findElement(Country).click();
		driver.findElement(workMail).sendKeys("Vysyarajusanthoashraj123@gmail.com");
		driver.findElement(btnSave).click();
		
	}
	
  public  EmergencyDetails btnEmergencyDetails()
  {
	  driver.findElement(EmergencyDetailsTab).click();
	  return new EmergencyDetails(driver);
  }

}
