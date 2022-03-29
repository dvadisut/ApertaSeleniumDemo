package com.ApertaWebApp_Automate.TestCases;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.DataEntryPage;
import com.aventstack.extentreports.Status;

public class TC_DataEntryTest_003 extends BaseClass {
    public static void DCBentrypass() {
  		
		PageFactory.initElements(driver,DataEntryPage.class);
		DataEntryPage.dentry.click();
		testcase=extent.createTest("Dcb Title Test").assignCategory("Aperta DataEntry Test").assignDevice("Chrome");
		testcase.log(Status.PASS, "DCB Web Page displayed-Success");
	}
	
	public static void DataEntrypagevalid() {
		PageFactory.initElements(driver,DataEntryPage.class);
		testcase=extent.createTest("DataEntry Tile Validation Test").assignCategory("Aperta DataEntry Test").assignDevice("Chrome");
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(2));
		
		logger.info("---------------DataEntry is opened successfully-----------------");
		logger.info("Validating the title of the DataEntry.....");
		
		if (driver.getTitle().equals(detitle)) 
		{
			Assert.assertTrue(true);
			logger.info("Aperta DataEntryTile is present--->LANDED ON RIGHT PAGE------>");
			testcase.log(Status.INFO, "DCB Title Validation-Success");
			
		} else {
			Assert.assertFalse(false);
			logger.error("Aperta Tile is not present--->LANDED ON WRONG PAGE------>");
			testcase.log(Status.INFO, "DCB Title Validation-Failure");

		}	
		
	}
	
   public void dcbamentry(String string) {
	
	   PageFactory.initElements(driver,DataEntryPage.class);
	   testcase=extent.createTest("DCB Amount Entry Test").assignCategory("Aperta DataEntry Test").assignDevice("Chrome");
		
		logger.info("---------------Validating the DCB item images and entering the amount-----------------");
		
		int i;
		for (i = 1; i<4; i++) {
		try {
			
			Boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", DataEntryPage.img);
            if (result==true) {
				
				logger.info("The Image_" +i+ " DCB title is displayed");
				testcase.log(Status.PASS, "DCB Image_" +i+ " Title Displayed-Success");
		
				
			} else {

				logger.error("The Image_" +i+ " DCB title is not displayed");
				testcase.log(Status.FAIL, "DCB Image_" +i+ " Title Displayed-Failure");
			
			}
			
			DataEntryPage.amtry.sendKeys(String.valueOf(string));
			logger.info(" Enter the Amount "+i );
			logger.info("Amount "+i+ " is entered successfully");
			testcase.log(Status.PASS, "DCB Amount_" +i+ " Entered-Success");
			DataEntryPage.amtry.sendKeys(Keys.ENTER);
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{

			Boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", DataEntryPage.img);
			  if (result==true) {
					
					logger.info("The Image_" +i+ " DCB title is displayed");
					testcase.log(Status.PASS, "DCB Image_" +i+ " Title Displayed-Success");
			
					
				} else {

					logger.error("The Image_" +i+ " DCB title is not displayed");
					testcase.log(Status.FAIL, "DCB Image_" +i+ " Title Displayed-Failure");
	
				}
			DataEntryPage.amtry.sendKeys(String.valueOf(string));
			logger.info(" Enter the Amount "+i );
			logger.info("Amount "+i+ " is entered successfully");
			testcase.log(Status.PASS, "DCB Amount_" +i+ " Entered-Success");
			DataEntryPage.amtry.sendKeys(Keys.ENTER);
		}			}
		
}
	
	
   @Test (priority = 3)
	public void DCBdataentry() throws InterruptedException 
	{
	    testcase=extent.createTest("Aperta DataEntry Test").assignCategory("Aperta DataEntry Test").assignDevice("Chrome");
     	PageFactory.initElements(driver,DataEntryPage.class);
     	DCBentrypass();
     	DataEntrypagevalid();
     	dcbamentry(String.valueOf(dcbamount));
  

	}

}
