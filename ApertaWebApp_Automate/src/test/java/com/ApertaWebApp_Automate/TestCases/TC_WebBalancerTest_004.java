package com.ApertaWebApp_Automate.TestCases;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.WebBalancerPage;

public class TC_WebBalancerTest_004 extends BaseClass {
	
WebDriver driver=null;
	
	public TC_WebBalancerTest_004(WebDriver driver)
	{
	    this.driver=driver;   
		
	}
	@Test (priority = 4)
	public void wbal() {
		
		WebBalancerPage de= new WebBalancerPage(driver);
		de.checker();
		
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(2));
		logger.info("---------------Web Balancer is opened successfully-----------------");
		
		if (driver.getTitle().equals(baltitle)) 
		{
			Assert.assertTrue(true);
			
			logger.info("Aperta Web Balancer Tile is present--->LANDED ON RIGHT PAGE------>");
			
		} 
		
		else {
			Assert.assertFalse(false);
			logger.error("Aperta Web Balancer Tile is not present--->LANDED ON WRONG PAGE------>");

		}
		de.Webbala();
		de.close();
		ArrayList<String> wid1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid1.get(1));
		driver.close();
		TC_SupervisorTest_005 spv=new TC_SupervisorTest_005(driver);
		spv.superv();
		
	}
						}
	
