package com.ApertaWebApp_Automate.TestCases;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.DCBPage;
import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.Static;

public class TC_DCBTest_002 extends BaseClass{
	
	public void dcbopen() {
		
		PageFactory.initElements(driver,DCBPage.class);
		DCBPage.dcbtitle.click();
		logger.info("---------------<DCB is opened successfully>-----------------");
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
    	DCBPage.dcbcalselect.click();
		logger.info("DCB calender is clicked successfully");
		
	}
    
    public static void dcbselect() {
    	PageFactory.initElements(driver,DCBPage.class);
    	while (true) {
    		selectedmonth=DCBPage.selectedmonth.getText();
	    	selectedyear=DCBPage.selectedyear.getText();
		    Selected_month_year = selectedmonth + " " + selectedyear;
		  
		    logger.info("Selected month and year: " +Selected_month_year);
		    logger.info("Targeted month and year: " +target_month_year);

	    	if (target_month_year.equals(Selected_month_year))
		    {
	    		
	    		logger.info("Month and year found");
	    		break;
		    	
			} 
		    
	    	
	    	else  {
	    		
	    	DCBPage.skip_year_month.click();
	    	logger.info("date not found---->checking for other date");
	    	
		    }
		    	}
		    }    	
	    	
	public static void dateselect() {
		 PageFactory.initElements(driver,DCBPage.class);
		 for (WebElement cell: DCBPage.columns){
		    if (cell.getText().equals(targetdate)){
		      cell.findElement(By.linkText(targetdate)).click();
		      logger.info("DCB date: " +targetdate + " " +target_month_year + " is selected successfully");
		       break;
		  }
		}
	}	  		 
    
	@Test
	public void DCB() throws InterruptedException 
	{
     	PageFactory.initElements(driver,DCBPage.class);
    	dcbopen();
    	dcbtitlevalidation();
    	dcbdate();
    	dcbselect();
    	dateselect();
	}
	
}

