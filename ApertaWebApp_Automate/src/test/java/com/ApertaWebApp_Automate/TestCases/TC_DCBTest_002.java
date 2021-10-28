package com.ApertaWebApp_Automate.TestCases;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.DCBPage;

public class TC_DCBTest_002 extends BaseClass{
	
	
	public TC_DCBTest_002(WebDriver driver) {
		 this.driver=driver;
	}
	@Test (priority = 2)
	public void DCB() throws InterruptedException 
	{
	
		DCBPage p= new DCBPage(driver);
		p.dcbtitle();
		logger.info("---------------DCB is opened successfully-----------------");
		logger.info("Validating the title of the DCB Web App.....");
		
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(1));
		
		if (driver.getTitle().equals(dcbtitle)) 
		{
			Assert.assertTrue(true);
			logger.info("ApertaDCB Tile is present--->LANDED ON RIGHT PAGE------>");
			
		} else {
			Assert.assertFalse(false);
			logger.error("ApertaDCB Tile is not present--->LANDED ON WRONG PAGE------>");

		}
		p.dcbdate();
		logger.info("DCB date is selected successfully");
		TC_DataEntryTest_003 jk= new TC_DataEntryTest_003(driver);
		jk.DataEntryp();
	}
	
}
