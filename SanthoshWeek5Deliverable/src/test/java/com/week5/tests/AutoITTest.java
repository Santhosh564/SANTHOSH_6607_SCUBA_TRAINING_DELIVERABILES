package com.week5.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITTest {
	
	public WebDriver driver;
	
	@Test
	public void uploadFunction() throws InterruptedException, IOException
	{
		//uploading a file in website 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://tus.io/demo.html");
		driver.findElement(By.xpath("//input[@type='file' and @id = 'js-file-input']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\vysya\\eclipse-workspace\\Maven_Projects\\Week5Deliverable\\AutoITexeScritp\\UploadScript.exe");
		Thread.sleep(3000);
	}
}
