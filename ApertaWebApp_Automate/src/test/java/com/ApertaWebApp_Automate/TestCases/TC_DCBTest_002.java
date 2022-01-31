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
import com.aventstack.extentreports.Status;
import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.Static;

public class TC_DCBTest_002 extends BaseClass{
	
	
	public void dcbopen() {
		
		PageFactory.initElements(driver,DCBPage.class);
		testcase=extent.createTest("Aperta DCB TitleAccessable Test ").assignCategory("Aperta DCB Test");
		DCBPage.dcbtitle.click();
		logger.info("---------------<DCB is opened successfully>-----------------");
		testcase.log(Status.PASS, "---------------DCB is opened successfully-----------------");
	}
	
	
	public void dcbtitlevalidation() {
		PageFactory.initElements(driver,DCBPage.class);
		testcase=extent.createTest("Aperta DCB TitleValidation Test ").assignCategory("Aperta DCB Test");
       logger.info("Validating the title of the DCB Web App.....");
		
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(1));
		
		if (driver.getTitle().equals(dcbtitle)) 
		{
			Assert.assertTrue(true);
			logger.info("ApertaDCB Tile is present--->LANDED ON RIGHT PAGE------>");
			testcase.log(Status.PASS, "DCB Tile Is Validation-Success");
			
		} else {
			Assert.assertFalse(false);
			logger.error("ApertaDCB Tile is not present--->LANDED ON WRONG PAGE------>");
			testcase.log(Status.PASS, "DCB Tile Is Validation-Failure");

		}
		
	}
	
	 
	public static void dcbdate() {
    	PageFactory.initElements(driver,DCBPage.class);
    	testcase=extent.createTest("Aperta DCB CalendarAccessable Test ").assignCategory("Aperta DCB Test");
    	DCBPage.dcbcalselect.click();
		logger.info("DCB calender is clicked successfully");
		testcase.log(Status.PASS, "DCB calender is clicked successfully");
		
	}
    
	 
    public static void dcbselect() {
    	PageFactory.initElements(driver,DCBPage.class);
    	testcase=extent.createTest("Aperta DCB Calendar Test ").assignCategory("Aperta DCB Test");
    	while (true) {
    		selectedmonth=DCBPage.selectedmonth.getText();
	    	selectedyear=DCBPage.selectedyear.getText();
		    Selected_month_year = selectedmonth + " " + selectedyear;
		  
		    logger.info("Selected month and year: " +Selected_month_year);
		    logger.info("Targeted month and year: " +target_month_year);

	    	if (target_month_year.equals(Selected_month_year))
		    {
	    		
	    		logger.info("Month and year found");
	    		testcase.log(Status.PASS, "DCB Date Found");
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
		      testcase=extent.createTest("Aperta DCB DateSelection Test ").assignCategory("Aperta DCB Test");
		      testcase.log(Status.PASS, "DCB DateSelect done");
		      break;
		  }
		}
	}	  		 
    
	@Test (priority = 2)
	public void DCB() throws InterruptedException 
	{
		
     	PageFactory.initElements(driver,DCBPage.class);
     	testcase=extent.createTest("Aperta DCB Test").assignCategory("Aperta DCB Test");
     	dcbopen();
    	dcbtitlevalidation();
    	dcbdate();
    	dcbselect();
    	dateselect();
	}
	
}

