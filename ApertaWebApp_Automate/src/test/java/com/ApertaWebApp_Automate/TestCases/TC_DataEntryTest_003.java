package com.ApertaWebApp_Automate.TestCases;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.DataEntryPage;

public class TC_DataEntryTest_003 extends BaseClass {
    public static void DCBentrypass() {
  		
		PageFactory.initElements(driver,DataEntryPage.class);
		DataEntryPage.dentry.click();
		
	}
	
	public static void DataEntrypagevalid() {
		PageFactory.initElements(driver,DataEntryPage.class);

		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(2));
		
		logger.info("---------------DataEntry is opened successfully-----------------");
		logger.info("Validating the title of the DataEntry.....");
		
		if (driver.getTitle().equals(detitle)) 
		{
			Assert.assertTrue(true);
			logger.info("Aperta DataEntryTile is present--->LANDED ON RIGHT PAGE------>");
			
		} else {
			Assert.assertFalse(false);
			logger.error("Aperta Tile is not present--->LANDED ON WRONG PAGE------>");

		}	
		
	}
	
   public void dcbamentry(String string) {
	
	   PageFactory.initElements(driver,DataEntryPage.class);

		
		logger.info("---------------Validating the DCB item images and entering the amount-----------------");
		
		int i;
		for (i = 1; i<4; i++) {
		try {
			
			Boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", DataEntryPage.img);
            if (result==true) {
				
				logger.info("The Image_" +i+ " DCB title is displayed");
		
				
			} else {

				logger.error("The Image_" +i+ " DCB title is not displayed");
			
			}
			
			DataEntryPage.amtry.sendKeys(String.valueOf(string));
			logger.info(" Enter the Amount "+i );
			logger.info("Amount "+i+ " is entered successfully");
			DataEntryPage.amtry.sendKeys(Keys.ENTER);
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{

			Boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", DataEntryPage.img);
			  if (result==true) {
					
					logger.info("The Image_" +i+ " DCB title is displayed");
			
					
				} else {

					logger.error("The Image_" +i+ " DCB title is not displayed");
	
				}
			DataEntryPage.amtry.sendKeys(String.valueOf(string));
			logger.info(" Enter the Amount "+i );
			logger.info("Amount "+i+ " is entered successfully");
			DataEntryPage.amtry.sendKeys(Keys.ENTER);
		}			}
		
}
	
	
   @Test (priority = 3)
	public void DCBdataentry() throws InterruptedException 
	{
     	PageFactory.initElements(driver,DataEntryPage.class);
     	DCBentrypass();
     	DataEntrypagevalid();
     	dcbamentry(String.valueOf(dcbamount));
  

	}

}
