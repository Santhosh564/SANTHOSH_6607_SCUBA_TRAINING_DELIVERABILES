package com.bdd.CucumberTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
 

public class OrangeHrmLoginTest {
	
	public WebDriver driver;
	public WebElement element;
	@Test(priority =1)
	@Given("user launch the browser")
	public void user_launch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    }
	@Test(priority =2)
	@And("enterd application url")
	public void enterd_application_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}
    
	@Test(priority =3)
	@When("user enters username password")
	public void user_enters_username_password() {
	     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	     }

	@Test(priority =4)
	@When("Click on button")
	public void click_on_button() {
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Test(priority =5)
	@Then("user should navigated to home page")
	public void user_should_navigated_to_home_page() {
    String expectedtitle = "OrangeHrm";
	String actualtitle = 	driver.getTitle();
	 Assert.assertEquals(expectedtitle, expectedtitle);
	   
	}


}
