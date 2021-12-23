package com.week5.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassTest {
	public WebDriver driver;

	public void  RobotKeyBoardEventsTest() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/keyboard-events/");
		driver.manage().window().maximize();
		WebElement webElement = driver.findElement(By.id("browseFile"));		
		webElement.sendKeys(Keys.ENTER);
		Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_SHIFT);
         robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_PERIOD);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_ENTER);  
        Thread.sleep(1000);
        webElement = driver.findElement(By.id("uploadButton"));
        webElement.click();				 
		WebDriverWait wait = new WebDriverWait(driver, 10);		 
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());	       	 
        myAlert.accept();
        driver.close();
	}
	
	public void  RobotMouseEventsHandling() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/keyboard-events/");
		driver.manage().window().maximize();
		WebElement webElement = driver.findElement(By.id("browseFile"));
		webElement.sendKeys("ENTER");
		Robot robot = new Robot();
		Dimension i = driver.manage().window().getSize(); 
		System.out.println("Dimension x and y :"+i.getWidth()+" "+i.getHeight()); 
		//3. Get the height and width of the screen 
		int x = (i.getWidth()/4)+20; 
		int y = (i.getHeight()/10)+50; 
		robot.mouseMove(x,y); 
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		System.out.println("Browse button clicked");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Closed the windows popup");
		Thread.sleep(1000);
		driver.close();
	}

}
	

