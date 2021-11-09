package com.ApertaWebApp_Automate.TestCases;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.DCBPage;

public class TC_DCBTest_002 extends BaseClass{
	
	public void dcbopen() {
		
		PageFactory.initElements(driver,DCBPage.class);
		DCBPage.dcbtitle.click();
		logger.info("---------------DCB is opened successfully-----------------");
	}
	
	public void dcbtitlevalidation() {
		
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
		
	}
	
	public static void dcbdate() {
    	PageFactory.initElements(driver,DCBPage.class);
    	DCBPage.dcbdate.click();
		logger.info("DCB date is selected successfully");
		
	}
    
    public static void dcbselect() {
    	PageFactory.initElements(driver,DCBPage.class);
    	DCBPage.dcbselect.click();
    	
    }
	@Test
	public void DCB() throws InterruptedException 
	{
     	PageFactory.initElements(driver,DCBPage.class);
    	dcbopen();
    	dcbtitlevalidation();
    	dcbdate();
    	dcbselect();
		
	}
	
}
