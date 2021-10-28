package com.ApertaWebApp_Automate.TestCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.WebSupervisorPage;

public class TC_SupervisorTest_005 extends BaseClass {
WebDriver driver=null;
	
	public TC_SupervisorTest_005(WebDriver driver)
	{
	    this.driver=driver;   
		
	}
@Test
	public void superv() {
	
		WebSupervisorPage sup=new WebSupervisorPage(driver);
		sup.opensup();
		ArrayList<String> wid1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid1.get(1));
		
		if (driver.getTitle().equals(suptitle)) 
		{
			Assert.assertTrue(true);
			logger.info("Aperta Tile is present--->LANDED ON RIGHT PAGE------>");
			
		} else {
			Assert.assertFalse(false);
			logger.error("Aperta Tile is not present--->LANDED ON WRONG PAGE------>");

		}
		
		sup.suplefttitle(); 
	}
}
