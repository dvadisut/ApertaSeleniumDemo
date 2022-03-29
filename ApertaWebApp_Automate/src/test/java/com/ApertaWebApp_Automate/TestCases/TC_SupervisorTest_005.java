package com.ApertaWebApp_Automate.TestCases;

import java.security.PublicKey;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.WebBalancerPage;
import com.ApertaWebApp_Automate.PageObjects.WebSupervisorPage;
import com.aventstack.extentreports.Status;

public class TC_SupervisorTest_005 extends BaseClass {

	
	public void opensup() {
		PageFactory.initElements(driver,WebSupervisorPage.class);
		testcase=extent.createTest("WebSupervisor Tile Test").assignCategory("Aperta WebSupervisor Test").assignDevice("Chrome");
		testcase.log(Status.PASS, "WebSupervisor Page displayed-Success");
		ArrayList<String> wid2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid2.get(0));
		driver.findElement(By.xpath("//*[@id=\"dropDivApertaWS\"]")).click();
		logger.info("---------------Web Supervisor is opened successfully-----------------");
		
	}
	
	public void superv() {
	
		PageFactory.initElements(driver,WebSupervisorPage.class);
		testcase=extent.createTest("WebSupervisor Tile Validation Test").assignCategory("Aperta WebSupervisor Test").assignDevice("Chrome");
		ArrayList<String> wid1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid1.get(1));
		
		if (driver.getTitle().equals(suptitle)) 
		{
			Assert.assertTrue(true);
			logger.info("Aperta Tile is present--->LANDED ON RIGHT PAGE------>");
			testcase.log(Status.INFO, "WebSupervisor Title Validation-Success");
			
		} else {
			Assert.assertFalse(false);
			logger.error("Aperta Tile is not present--->LANDED ON WRONG PAGE------>");
			testcase.log(Status.INFO, "WebSupervisor Title Validation-Failure");

		}
		
	}
	
	public void SuperTileValidation() {
		PageFactory.initElements(driver,WebSupervisorPage.class);
		testcase=extent.createTest("WebSupervisor DashTile Validation Test").assignCategory("Aperta WebSupervisor Test").assignDevice("Chrome");
		WebSupervisorPage.SBDashboard.isDisplayed();
		logger.info("The Dashboard is displayed successfully");
		testcase.log(Status.PASS, "Dashboard Title Displayed-Success");
	}

	@Test
   public void superTest() {
		testcase=extent.createTest("Aperta WebSupervisor Test").assignCategory("Aperta WebSupervisor Test").assignDevice("Chrome");
		opensup();
		superv();
	   
   }
}
