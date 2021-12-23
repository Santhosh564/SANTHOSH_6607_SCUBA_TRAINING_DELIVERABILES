package com.week5.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScripExeTest {
	public WebDriver driver;
	
	
	@Test
	public void JavaScriptExeTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('txtUsername').value='Admin';");
		js.executeScript("document.getElementById('txtPassword').value='admin123';");
		js.executeScript("document.getElementById('btnLogin').click();");
		js.executeScript("alert('enter correct login credentials to continue');");
		driver.close();
		
	}

}
