package com.ApertaWebApp_Automate.TestCases;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ApertaWebApp_Automate.PageObjects.WebBalancerPage;
import com.aventstack.extentreports.Status;

public class TC_WebBalancerTest_004 extends BaseClass {
	
	public static void checker() {
		PageFactory.initElements(driver,WebBalancerPage.class);
		testcase=extent.createTest("Dcb-WebBalancer Title Test").assignCategory("Aperta WebBalancer Test").assignDevice("Chrome");
		testcase.log(Status.PASS, "DCB Web Page displayed-Success");
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(1));
		WebBalancerPage.chckpass.click();
	}
	
	public static void WBvalid() {
		PageFactory.initElements(driver,WebBalancerPage.class);
		testcase=extent.createTest("DCB-WebBalancer Tile Validation Test").assignCategory("Aperta WebBalancer Test").assignDevice("Chrome");
		ArrayList<String> WBwid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(WBwid.get(2));
		logger.info("---------------Web Balancer is opened successfully-----------------");
		
		if (driver.getTitle().equals(baltitle)) 
		{
			Assert.assertTrue(true);
			
			logger.info("Aperta Web Balancer Tile is present--->LANDED ON RIGHT PAGE------>");
			testcase.log(Status.INFO, "DCB-WebBalancer Title Validation-Success");
			
		} 
		
		else {
			Assert.assertFalse(false);
			logger.error("Aperta Web Balancer Tile is not present--->LANDED ON WRONG PAGE------>");
			testcase.log(Status.INFO, "DCB-WebBalancer Title Validation-Failure");

		}
	}
	
	public static void DCBClose() {
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(1));
		driver.close();
		
	}
	public static void Webbalapprove() {
		PageFactory.initElements(driver,WebBalancerPage.class);
		testcase=extent.createTest("DCB-WebBalancer approve Test").assignCategory("Aperta WebBalancer Test").assignDevice("Chrome");
		logger.info("---------------Validating the Items in Checker Pass-----------------");
			for (int i = 1; i < 5; i++) {
				try {
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", WebBalancerPage.WBimg);
					
					if (result==true) {
						
						logger.info("The Image_" +i+ " WebBalancer is displayed");
						testcase.log(Status.PASS, "DCB-WebBalancer Image_" +i+ " Title Displayed-Success");
				
						
					} else {

						logger.error("The Image_" +i+ " WebBalancer is not displayed");
						testcase.log(Status.FAIL, "DCB-WebBalancer Image_" +i+ " Title Displayed-Failure");
					
					}
					
					WebBalancerPage.WBapprove.click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					logger.info(" Item "+i+ " is approved successfully" );
					
					
				}
				catch(org.openqa.selenium.StaleElementReferenceException ex)
				{
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", WebBalancerPage.WBimg);
					  if (result==true) {
							
							logger.info("The Image_" +i+ " WebBalancer is displayed");
							testcase.log(Status.PASS, "DCB-WebBalancer Image_" +i+ " Title Displayed-Success");
					
							
						} else {

							logger.error("The Image_" +i+ " WebBalancer is not displayed");
							testcase.log(Status.FAIL, "DCB-WebBalancer Image_" +i+ " Title Displayed-Failure");
			
						}
					  WebBalancerPage.WBapprove.click();
					  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						logger.info(" Item "+i+ " is approved successfully" );
						testcase.log(Status.PASS, "DCB-WebBalancer item_" +i+ " approve-Success");
			
		}
			}
	}
			
	
	public static void WBclose() {
		PageFactory.initElements(driver,WebBalancerPage.class);
		testcase=extent.createTest("Batch Close Test").assignCategory("Aperta WebBalancer Test").assignDevice("Chrome");
		WebBalancerPage.WBclose.click();
		logger.info("The Batch is closed successfully");
		testcase.log(Status.PASS, "DCB-WebBalancer Closed- Success");
	}

	@Test (priority = 4)
	public void WBtest() {
		testcase=extent.createTest("Aperta WebBalancer Test").assignCategory("Aperta WebBalancer Test").assignDevice("Chrome");
		PageFactory.initElements(driver,WebBalancerPage.class);
		checker();
		WBvalid();
		Webbalapprove();
		WBclose();
		DCBClose();
		
		
	}

}
	
