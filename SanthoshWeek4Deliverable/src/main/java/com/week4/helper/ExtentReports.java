package com.week4.helper;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class  ExtentReports {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	
	public static ExtentReports getReports() {
		
		if (extent==null) {
			extent = new ExtentReports();
			
			spark = new ExtentSparkReporter("target/RegressionReport.html");
			spark.config().setReportName(" Regression Run 1.0");
			spark.config().setTheme(Theme.DARK);
			spark.config().setEncoding("utf-8");
			 
		}
		
		return extent;
	}

}