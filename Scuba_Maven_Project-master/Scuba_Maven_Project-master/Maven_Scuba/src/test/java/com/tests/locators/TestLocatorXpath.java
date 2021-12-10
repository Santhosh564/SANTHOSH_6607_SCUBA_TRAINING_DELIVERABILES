package com.tests.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class TestLocatorXpath {
	public static void  TestLocatorXpathMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		

		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
		Thread.sleep(5000);
		driver.quit();


}
}
