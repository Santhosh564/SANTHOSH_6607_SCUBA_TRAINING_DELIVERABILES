package com.testNG.parallelClasses;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelClass2 {
	
	public WebDriver driver;
	

	  @Parameters("browser")
	  @BeforeClass
	  public void beforeTest(String browser) {
	  if(browser.equalsIgnoreCase("firefox")) {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();	  

	  }else if (browser.equalsIgnoreCase("chrome")) { 
          WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
     
	  }else if (browser.equalsIgnoreCase("edge")) { 
          WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		
	  }else if (browser.equalsIgnoreCase("IE")) { 
          WebDriverManager.iedriver().setup();
		  driver = new InternetExplorerDriver();	  
	  }

	  driver.get("https://opensource-demo.orangehrmlive.com/"); 

	  }

	  @Test 
	  public void login() throws InterruptedException {

		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		     driver.findElement(By.id("btnLogin")).click();

		}  

	  @AfterClass
	  public void afterTest() {

			driver.quit();

		}

	}

