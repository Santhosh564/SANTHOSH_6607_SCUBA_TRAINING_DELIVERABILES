package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * @author vysya
 *
 */
public class PersonalDetails {
	
	static  WebDriver driver;
	
	By editBtn = 	By.id("btnSave");
	By firsrName = 	By.id("personal_txtEmpFirstName");
	By middleName = 	By.id("personal_txtEmpMiddleName");
	By lastName = 	By.id("personal_txtEmpLastName");
	By employeeID = By.id("personal_txtEmployeeId");
	By dateOfBirth = 	By.id("personal_txtLicExpDate");
	By gender =  	By.id("personal_optGender_1");
	By nationality = 	By.id("personal_cmbNation");
	By saveBtn =  	By.id("btnSave");
	By contactDetailstab = By.xpath("//a[contains(text(),'Contact Details')]");
	
	public PersonalDetails(WebDriver driver)
	{
	
		this.driver = driver;
	}
	
 

	public void  btnEdit()
	{
		driver.findElement(editBtn).click();
		
	}
	
	public void btnSave()
	{
		driver.findElement(firsrName).sendKeys("Santhosh");
		driver.findElement(middleName).sendKeys("Raj");
		driver.findElement(lastName).sendKeys("Vysyaraju");
		driver.findElement(employeeID).sendKeys("6607");
		driver.findElement(dateOfBirth).click();
		driver.findElement(gender).click();
		driver.findElement(nationality).click();
		driver.findElement(saveBtn).click();
   }
	
	public  ContactDetails btncontactDetails()
	{
		driver.findElement(contactDetailstab).click();
		return new ContactDetails(driver);
		
	}
	
	

}
