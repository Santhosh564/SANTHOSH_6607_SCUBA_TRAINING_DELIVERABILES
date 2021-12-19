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

public class DashBoardPage {
	
	WebDriver driver;
	TimeSheetPage timeshtObj;
	AssignLeavePage assignObj;
	
	@FindBy(xpath ="//b[text()='Dashboard']")
	@CacheLookup
	WebElement dashboardtab;
	
	@FindBy(xpath = "//span[text()='My Timesheet']")
	@CacheLookup
	WebElement timsheetTab;
	
	@FindBy(xpath="//span[contains(text(),'Assign Leave')]")
	@CacheLookup
	WebElement assignLeavebtn;
	
	public  DashBoardPage(WebDriver driver){
		 this.driver = driver;
	}
	
	public  TimeSheetPage clickontimeSheetTab()
	{
		timsheetTab.click();
		return  timeshtObj;
	}
	
	public  AssignLeavePage clickonAssignLeave()
	{
		assignLeavebtn.click();
		return assignObj;
	}
}


	
	 


