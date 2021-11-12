package com.ApertaWebApp_Automate.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ApertaWebApp_Automate.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	public void setpassword(String Wpass) {
		
		
		try {
			
			LoginPage.password.sendKeys(readconfig.getWpassword());
			LoginPage.loginbutton.click();
				 logger.info("The Password is entered");
				 if (!driver.getPageSource().equals(wrongmsg)) {
					 logger.error("The password is wrong. The error message is displayed correctly");
					logger.info("Trying with the correct password");
				 }
		}
		
		finally {
			LoginPage.password1.sendKeys(readconfig.getpassword());
			 logger.info("The Password is entered");
			 LoginPage.loginbutton1.click();
			 logger.info("Submit button is clicked");
			logger.info("Validating the title of the launchpage.....");
		}
	}
	
	public void titlevalidation() {
		
	if (driver.getTitle().equals(aptitle)) 
	{
		Assert.assertTrue(true);
		logger.info("---------------<Launchpad is opened successfully>-----------------");
		logger.info("Aperta Tile is present--->LANDED ON RIGHT PAGE------>");
		logger.info("Login successfull");
		
	} else {
		Assert.assertFalse(false);
		logger.error("Aperta Tile is not present--->LANDED ON WRONG PAGE------>");

	}
	}
	
	private void Enterusername() {
		PageFactory.initElements(driver,LoginPage.class);
		LoginPage.setusername.sendKeys(readconfig.getusername());
		logger.info("The Username is entered");
		
	}

	@Test (priority = 1)
	public void LoginTest() throws InterruptedException
	{
		PageFactory.initElements(driver,LoginPage.class);
        logger.info("The Aperta URL is opened-------------->TIME OF EXECUTION= "+ date);
        Enterusername();
		setpassword(readconfig.getWpassword());
		titlevalidation();
	}
}
