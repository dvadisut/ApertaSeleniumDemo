package com.ApertaWebApp_Automate.TestCases;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	@Test (priority = 1)
	public void LoginTest() throws InterruptedException
	{
		//PageFactory.initElements(driver, LoginPage.class);
    	LoginPage t=new LoginPage(driver);
        //driver.get(baseURL);
		
		
        logger.info("The Aperta URL is opened-------------->TIME OF EXECUTION= "+ date);
        
		t.setusername(username);
		logger.info("The Username is entered");
		
		t.setpassword(Wpassword);
		
		if (driver.getTitle().equals(aptitle)) 
		{
			Assert.assertTrue(true);
			logger.info("---------------Launchpad is opened successfully-----------------");
			logger.info("Aperta Tile is present--->LANDED ON RIGHT PAGE------>");
			logger.info("Login successfull");
			
		} else {
			Assert.assertFalse(false);
			logger.error("Aperta Tile is not present--->LANDED ON WRONG PAGE------>");

		}
		
		//TC_DCBTest_002 lp= new TC_DCBTest_002(driver);
		//lp.DCB();
	}
}
