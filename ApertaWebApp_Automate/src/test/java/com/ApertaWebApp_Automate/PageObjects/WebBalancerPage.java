package com.ApertaWebApp_Automate.PageObjects;



import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ApertaWebApp_Automate.TestCases.BaseClass;

public class WebBalancerPage extends BaseClass {
	
	WebDriver driver=null;
		
		public WebBalancerPage(WebDriver driver)
		{
		    this.driver=driver;
			
		}
		
		public void checker() {
			
			ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(wid.get(1));
			WebElement chck=driver.findElement(By.cssSelector("#ABSDiv > ul:nth-child(2) > li:nth-child(8)")); //click on the checker entry pass
			chck.click();
		}
		
		public void Webbala() {
			logger.info("---------------Validating the Items in Checker Pass-----------------");
				for (int i = 1; i < 5; i++) {
					try {
						
						WebElement wbal=driver.findElement(By.xpath("//*[@id=\"helpMCapprove\"]"));
						WebElement balimg=driver.findElement(By.xpath("//*[@id=\"DrawArea\"]/img"));
						boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", balimg);
						
						if (result==true) {
							
							logger.info("The Image_" +i+ " WebBalancer is displayed");
							
					
							
						} else {

							logger.error("The Image_" +i+ " WebBalancer is not displayed");
						
						}
						
			            wbal.click();
						logger.info(" Item "+i+ " is approved successfully" );
						
						
					}
					catch(org.openqa.selenium.StaleElementReferenceException ex)
					{
						WebElement wbal=driver.findElement(By.xpath("//*[@id=\"helpMCapprove\"]"));
						WebElement balimg=driver.findElement(By.xpath("//*[@id=\"DrawArea\"]/img"));
						boolean result = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", balimg);
						  if (result==true) {
								
								logger.info("The Image_" +i+ " WebBalancer is displayed");
						
								
							} else {

								logger.error("The Image_" +i+ " WebBalancer is not displayed");
				
							}
						  wbal.click();
							logger.info(" Item "+i+ " is approved successfully" );
				
			}
			
					
			
				}
			}
		public void close() {
			
			WebElement close=driver.findElement(By.xpath("//*[@id=\"helpclose\"]"));
			close.click();
			logger.info("The Batch is closed successfully");
			
		}
		}
	




