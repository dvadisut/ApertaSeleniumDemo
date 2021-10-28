package com.ApertaWebApp_Automate.TestCases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.DataEntryPage;

public class TC_DataEntryTest_003 extends BaseClass {
	
	WebDriver driver=null;

	public TC_DataEntryTest_003(WebDriver driver) //driver intilization 
	{
		 this.driver=driver;

}
	@Test (priority = 3)
	public void DataEntryp() {
		
		DataEntryPage de= new DataEntryPage(driver);
		
		de.dataentry();

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
	
		
		de.dcbamentry(10000);
		TC_WebBalancerTest_004 ck= new TC_WebBalancerTest_004(driver);
		ck.wbal();
		
		
	}
}
