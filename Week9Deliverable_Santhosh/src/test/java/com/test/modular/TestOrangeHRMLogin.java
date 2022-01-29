package com.test.modular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tests.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOrangeHRMLogin {
	@Test
	public void VerifyValidLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage login=new LoginPage(driver);
		login.loginToOrangeHRM("Admin", "admin123");
		driver.quit();

	}
}
