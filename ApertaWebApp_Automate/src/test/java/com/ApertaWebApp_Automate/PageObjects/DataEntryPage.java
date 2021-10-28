package com.ApertaWebApp_Automate.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import com.ApertaWebApp_Automate.TestCases.BaseClass;

public class DataEntryPage extends BaseClass {
WebDriver driver=null;
	
	public DataEntryPage(WebDriver driver)
	{
	    this.driver=driver;   
		
	}
	
	public void dataentry() {
		
		WebElement dentry=driver.findElement(By.cssSelector("#ABSDiv > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1)")); //click on the amount entry pass
		dentry.click();
		
	}
	
		
	public void dcbamentry(int amount) {
		
		logger.info("---------------Validating the DCB item images and entering the amount-----------------");
		
		int i;
		for (i = 1; i<4; i++) {
		try {
			
			WebElement amtry=driver.findElement(By.xpath("//*[@id=\"input1\"]"));
			WebElement img=driver.findElement(By.xpath("//*[@id=\"ApertaTile1\"]/div[1]/figure/div[2]/div/img"));
			Boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", img);
            if (result==true) {
				
				logger.info("The Image_" +i+ " DCB title is displayed");
		
				
			} else {

				logger.error("The Image_" +i+ " DCB title is not displayed");
			
			}
			
			amtry.sendKeys(String.valueOf(amount));
			logger.info(" Enter the Amount "+i );
			logger.info("Amount "+i+ " is entered successfully");
			amtry.sendKeys(Keys.ENTER);
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebElement amtry=driver.findElement(By.xpath("//*[@id=\"input1\"]"));
			WebElement img=driver.findElement(By.xpath("//*[@id=\"ApertaTile1\"]/div[1]/figure/div[2]/div/img"));
			Boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", img);
			  if (result==true) {
					
					logger.info("The Image_" +i+ " DCB title is displayed");
			
					
				} else {

					logger.error("The Image_" +i+ " DCB title is not displayed");
	
				}
			amtry.sendKeys(String.valueOf(amount));
			logger.info(" Enter the Amount "+i );
			logger.info("Amount "+i+ " is entered successfully");
			amtry.sendKeys(Keys.ENTER);
		}			
		}
	}
}

