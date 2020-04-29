package com.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateExtentRepor {
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest test;
	public static void main(String[] args) {
//		String str = "C:\\Users\\JK02258\\Desktop\\Jyothi\\Open Banking\\MyCertTest - Copy.p12";
//		System.out.println(str);
		
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\Suresh Mylam\\eclipse-workspace\\TestNG_Listners\\Reports\\TestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		test= extent.createTest("TEst123");
		test.pass("pass");
		test.fail("fail");
		test.info("info");
		extent.flush();
		System.out.println("Done");

	}

}
