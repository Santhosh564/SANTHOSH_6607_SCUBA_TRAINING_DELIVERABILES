package com.testNG.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	static String URL = "http://192.168.188.1:5527";


	public static void main(String[] args) throws InterruptedException, MalformedURLException{

		// static String URL = "http://192.168.56.1:5555";
		DesiredCapabilities caps = new DesiredCapabilities();

		try {
			WebDriver driver;
			caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "10");
			caps.setCapability("browser", "chrome");
			//caps.setCapability("browser", "firefox");
			driver = new RemoteWebDriver(new URL(URL), caps);
			driver.get("https://opensource-demo.orangehrmlive.com/"); 
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(10000);
			driver.close();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
