package com.ApertaWebApp_Automate.utilities;

//Listener class used to generate Extent reports

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter
{
	public ExtentSparkReporter Reporter;
	public ExtentReports extent;
	//public ExtentTest logger;
	public ExtentTest testcase;
	
		
	public void onStart(ITestContext testContext)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="Test-Report-"+timeStamp+".html";
		
		Reporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/Aperta-Reports/"+repName);//specify location of the report
		try {
			Reporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		extent=new ExtentReports();
		
		extent.attachReporter(Reporter);
		extent.setSystemInfo("Project","Bank Of America-Phillipines");
		extent.setSystemInfo("Windows Server","2019");
		extent.setSystemInfo("Web Broswer","Chrome");
		
		
		Reporter.config().setDocumentTitle("Aperta Test Report"); // Tile of report
		Reporter.config().setReportName("Aperta Web Application Testing"); // name of the report
		//Reporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
		Reporter.config().setTheme(Theme.DARK);
	}
	
	
	public void onTestSuccess(ITestResult tr)
	{
		testcase=extent.createTest(tr.getName()).assignCategory("Aperta Web Test"); // create new entry in th report
		//testcase.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); // send the passed information to the report with GREEN color highlighted
        //testcase.log(Status.PASS, "test");	

	}
	
	public void onTestFailure(ITestResult tr)
	{
		testcase=extent.createTest(tr.getName()).assignCategory("Aperta Web Test"); // create new entry in th report
		//testcase.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); // send the passed information to the report with GREEN color highlighted
		
		}

	public void onTestSkipped(ITestResult tr)
	{
		testcase=extent.createTest(tr.getName()).assignCategory("Aperta Web Test"); // create new entry in th report
		//testcase.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
}