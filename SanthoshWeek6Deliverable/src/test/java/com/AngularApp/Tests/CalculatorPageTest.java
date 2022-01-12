package com.AngularApp.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AngularApp.pages.CalculatorPage;
 

	public class CalculatorPageTest {
		
		CalculatorPage calPage;
		
		@BeforeTest
		public void setup(){
			calPage = new CalculatorPage();
		}
		
		
		@Test(priority=1)
		public void sumTest(){
			String res = calPage.doSum("4453", "6607");
			Assert.assertEquals(res, "11060");
		}
		
		@Test(priority=2)
		public void subTest(){
			String res = calPage.doSub("100", "80");
			Assert.assertEquals(res, "20");
		}
		
		@Test(priority=3)
		public void divTest(){
			String res = calPage.doDiv("20", "2");
			Assert.assertEquals(res, "10");
		}
		
		

	}
	

