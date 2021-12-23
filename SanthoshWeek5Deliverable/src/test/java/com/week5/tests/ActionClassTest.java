package com.week5.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassTest {
	
	public WebDriver driver;
	 
	@Test
	public void ActionTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btn = driver.findElement(By.id("btnLogin"));
		actions.sendKeys(username, "Admin");
		actions.sendKeys(password, "admin123");
		Thread.sleep(3000);
		btn.click();
		driver.quit();
	 
	}
	
	@Test(priority = 1)
	public void keyboardAndMouseActions()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btn = driver.findElement(By.id("btnLogin"));
		Actions actions = new Actions(driver);
		actions.keyDown(username, "Admin").build().perform();
		actions.keyDown(password, "admin123").build().perform();
		actions.click(btn);
		
		
	}
	
  @Test
  public void dragAndDrop()
  {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		 //Elements are present inside the frame so we are first switching to frame ty=o capture
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		WebElement source = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/img"));
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
  }

}
