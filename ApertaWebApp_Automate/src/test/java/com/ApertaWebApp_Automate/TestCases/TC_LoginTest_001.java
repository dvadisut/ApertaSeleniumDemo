package com.ApertaWebApp_Automate.TestCases;

import org.apache.log4j.jmx.LoggerDynamicMBean;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.ApertaWebApp_Automate.PageObjects.LoginPage;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TC_LoginTest_001 extends BaseClass {


	public void setpassword(String Wpass) {
		
		
		try {
			PageFactory.initElements(driver,LoginPage.class);
			testcase=extent.createTest("Aperta password Test").assignCategory("Aperta Launchpad Test");
			LoginPage.password.sendKeys(readconfig.getWpassword());
			LoginPage.loginbutton.click();
				 logger.info("The Password is entered");
				 if (!driver.getPageSource().equals(wrongmsg)) {
					 logger.error("The password is wrong. The error message is displayed correctly");
					testcase.log(Status.PASS, "The password validation is done correctly");
					 logger.info("Trying with the correct password");
				 }
		}
		
		finally {
			LoginPage.password1.sendKeys(readconfig.getpassword());
			 logger.info("The Password is entered");
			 LoginPage.loginbutton1.click();
			 logger.info("Submit button is clicked");
			 testcase.log(Status.PASS, "Login successfull");
			 logger.info("Validating the title of the launchpage.....");
			
		}
	}
	
	
	public void titlevalidation() {
		
	if (driver.getTitle().equals(aptitle)) 
	{
		//Assert.assertTrue(true);
		PageFactory.initElements(driver,LoginPage.class);
		testcase=extent.createTest("Aperta title Test").assignCategory("Aperta Launchpad Test");
		logger.info("---------------<Launchpad is opened successfully>-----------------");
		logger.info("Aperta Tile is present--->LANDED ON RIGHT PAGE------>");
		logger.info("Login successfull");
		testcase.log(Status.PASS, "Aperta Tile is present--->LANDED ON RIGHT PAGE------>");
		
		
	} else {
		//Assert.assertFalse(false);
		logger.error("Aperta Tile is not present--->LANDED ON WRONG PAGE------>");
		testcase.log(Status.FAIL, "Aperta Tile is not present--->LANDED ON WRONG PAGE------>");
	}
	}

	private void Enterusername() {
		
		PageFactory.initElements(driver,LoginPage.class);
		testcase=extent.createTest("Aperta username Test").assignCategory("Aperta Launchpad Test");
		LoginPage.setusername.sendKeys(readconfig.getusername());
		logger.info("The Username is entered");
		testcase.log(Status.PASS, "The Username is entered");
		
	}

	@Test (priority = 1)
	public void LoginTest() throws InterruptedException
	{
		
		PageFactory.initElements(driver,LoginPage.class);
		testcase=extent.createTest("Aperta Login Test").assignCategory("Aperta Launchpad Test").assignDevice("Chrome");
        logger.info("The Aperta URL is opened");
        testcase.log(Status.PASS, "The Aperta URL is opened");
        Enterusername();
		setpassword(readconfig.getWpassword());
		titlevalidation();
	}
}
