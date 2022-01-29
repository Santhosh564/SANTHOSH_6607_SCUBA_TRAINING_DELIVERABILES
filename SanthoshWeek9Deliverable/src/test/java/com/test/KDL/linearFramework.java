package com.test.KDL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linearFramework {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");	
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium 4.0");
		driver.close(); 

}
}
