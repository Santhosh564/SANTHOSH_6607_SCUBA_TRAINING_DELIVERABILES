package com.week4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.bcel.internal.generic.Select;

public class TimeSheetPage {
	
	WebDriver driver;
	Select s  ;
	
	@FindBy(id = "btnEdit")
	@CacheLookup
	WebElement editbtn;
	
	@FindBy(id = "initialRows_0_toDelete")
	@CacheLookup
	WebElement timesheetCheck;
	
	@FindBy(id = "initialRows_0_projectName")
	@CacheLookup
	WebElement textbox;
	
	//@FindBy(id = "initialRows_0_projectActivityName")
	//WebElement dropdown;
	
	@FindBy(xpath = "//option[text()='Feature Development']")
	@CacheLookup
    WebElement dropdown;
	
	
	@FindBy(id = "initialRows_0_0")
	@CacheLookup
	WebElement day1;
	
	@FindBy(id = "initialRows_0_1")
	@CacheLookup
	WebElement  day2;
	
	@FindBy(id = "initialRows_0_2")
	@CacheLookup
	WebElement day3;
	
	@FindBy(id = "initialRows_0_3")
	@CacheLookup
	WebElement day4;
	
	@FindBy(id = "initialRows_0_4")
	@CacheLookup
	WebElement day5;
	
	@FindBy(id = "initialRows_0_5")
	@CacheLookup
	WebElement day6;
	
	@FindBy(id = "initialRows_0_6")
	@CacheLookup
	WebElement day7;
	
	@FindBy(id = "submitSave")
	@CacheLookup
	WebElement  btnSave;
	
	
	
	
	public  TimeSheetPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void editaction()
	{
		editbtn.click();
	}

	public void save()
	{
		timesheetCheck.click();
		textbox.sendKeys("ACME Ltd - ACME Ltd");
		dropdown.click();
		day1.sendKeys("8");
		day2.sendKeys( "8");
		day3.sendKeys("8");
		day4.sendKeys("8");
		day5.sendKeys("8");
		day6.sendKeys("8");
		day7.sendKeys("8");
		btnSave.click();
		
        
	}
}
