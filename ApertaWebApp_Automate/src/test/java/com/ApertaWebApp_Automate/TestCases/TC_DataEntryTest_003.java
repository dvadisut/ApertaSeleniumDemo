package com.ApertaWebApp_Automate.TestCases;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.DCBPage;
import com.ApertaWebApp_Automate.PageObjects.DataEntryPage;

public class TC_DataEntryTest_003 extends BaseClass {
	
	/*WebDriver driver=null;

	public TC_DataEntryTest_003(WebDriver driver) //driver intilization 
	{
		 this.driver=driver;

}*/
	@Test (priority = 3)
	
	
	
    public static void DCBentrypass() {
  		
		PageFactory.initElements(driver,DataEntryPage.class);
		//WebElement dentry=driver.findElement(By.cssSelector("#ABSDiv > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1)")); //click on the amount entry pass
		DataEntryPage.dentry.click();
		
	}
	
	public static void DataEntrypagevalid() {
		PageFactory.initElements(driver,DataEntryPage.class);
		
		//DataEntryPage de= new DataEntryPage(driver);
		
		//de.dataentry();

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
		
		/*de.dcbamentry(10000);
		TC_WebBalancerTest_004 ck= new TC_WebBalancerTest_004(driver);
		ck.wbal();*/
		
		
		
	}
	
   public void dcbamentry(String string) {
	PageFactory.initElements(driver,DataEntryPage.class);

		
		logger.info("---------------Validating the DCB item images and entering the amount-----------------");
		
		int i;
		for (i = 1; i<4; i++) {
		try {
			
			//WebElement amtry=driver.findElement(By.xpath("//*[@id=\"input1\"]"));
			//WebElement img=driver.findElement(By.xpath("//*[@id=\"ApertaTile1\"]/div[1]/figure/div[2]/div/img"));
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
			//WebElement amtry=driver.findElement(By.xpath("//*[@id=\"input1\"]"));
			//WebElement img=driver.findElement(By.xpath("//*[@id=\"ApertaTile1\"]/div[1]/figure/div[2]/div/img"));
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
	
	

	public void DCBdataentry() throws InterruptedException 
	{
     	PageFactory.initElements(driver,DataEntryPage.class);
     	DCBentrypass();
     	DataEntrypagevalid();
     	dcbamentry(String.valueOf(dcbamount));
  

	}

}
