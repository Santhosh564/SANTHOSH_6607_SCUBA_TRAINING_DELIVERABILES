package com.tests.first;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchGoogle{
	public static void main(String[] args) throws InterruptedException{
		
		// WebDriverManager.firefoxdriver().setup(); 
		// WebDriver driver= new FirefoxDriver();
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		
		//WebDriverManager.iedriver().setup();
		//WebDriver driver= new InternetExplorerDriver();
		
		driver.get("http://www.google.com/");    
		driver.manage().window().maximize();
		Thread.sleep(5000);  // Let the user actually see something!     
		WebElement searchBox = driver.findElement(By.name("q")); 
		searchBox.sendKeys("Narasannapeta Srikakulam");     
		searchBox.submit();    
		Thread.sleep(5000);  // Let the user actually see something!     
		driver.quit();  
}
}
