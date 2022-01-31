package com.ApertaWebApp_Automate.utilities;

import org.testng.TestListenerAdapter;

import com.ApertaWebApp_Automate.TestCases.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting1 extends BaseClass {

	public static ExtentTest testcase;
	public static void exreport() {
		/*ExtentReports extent = new ExtentReports();
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("Report.html");
		extent.attachReporter(sparkreporter);
		ExtentTest testcase;
		//testcase=extent.createTest("MyFirstTest")
		  //.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		//extent.flush();
		testcase=extent.createTest("Aperta Login Test");
		testcase=extent.createTest("Aperta  Test");*/
		
		ExtentReports extent = new ExtentReports();
		
		//ExtentTest testcase;
		
		//ExtentSparkReporter sparkreporter = new ExtentSparkReporter("Report.html");
		//extent.attachReporter(sparkreporter);
		extent.setSystemInfo("Windows Server", "2019");
		extent.setSystemInfo("Web Browser", "Chrome");
		//sparkreporter.config().setReportName("Aperta Web Application Testing");
		//sparkreporter.config().setTheme(Theme.DARK);
		//extent.flush();


	}

}
