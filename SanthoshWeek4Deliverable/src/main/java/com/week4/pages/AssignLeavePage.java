package com.week4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AssignLeavePage {
	
	WebDriver driver;
	
	@FindBy(id ="assignleave_txtEmployee_empName")
	@CacheLookup
	WebElement EmployeeName;
	
	@FindBy(xpath="//option[text()='CAN - Vacation']")
	@CacheLookup
	WebElement LeaveType;
	
	@FindBy(xpath ="//a[text()='6']")
	@CacheLookup
	WebElement fromdate;
	
	@FindBy(xpath ="//a[text()='20']")
	@CacheLookup
	WebElement toDate;
	
	@FindBy(id ="assignleave_txtComment")
	@CacheLookup
	WebElement comment;
	

	@FindBy(id ="assignBtn")
	@CacheLookup
	WebElement Assignbtn;
	
	public   AssignLeavePage(WebDriver driver){
		 this.driver = driver;
	}
	
	
	public void assignleaveAction()
	{
		EmployeeName.click();
		LeaveType.click();
		fromdate.click();
		toDate.click();
		comment.sendKeys("Applying for leave");
		Assignbtn.click();
		
		
	}

}
