package com.ApertaWebApp_Automate.TestCases;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ApertaWebApp_Automate.PageObjects.WebBalancerPage;
import com.ApertaWebApp_Automate.PageObjects.WebSupervisorPage;
import com.aventstack.extentreports.Status;

public class TC_SupervisorTest_005 extends BaseClass {

	
	public void opensup() {
		PageFactory.initElements(driver,WebSupervisorPage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testcase=extent.createTest("WebSupervisor Tile Test").assignCategory("Aperta WebSupervisor Test").assignDevice("Chrome");
		testcase.log(Status.PASS, "WebSupervisor Page displayed-Success");
		ArrayList<String> wid2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid2.get(0));
		driver.findElement(By.xpath("//*[@id=\"dropDivApertaWS\"]")).click();
		logger.info("---------------Web Supervisor is opened successfully-----------------");
		
	}
	
	public void superv() {
	
		PageFactory.initElements(driver,WebSupervisorPage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testcase=extent.createTest("WebSupervisor Tile Validation Test").assignCategory("Aperta WebSupervisor Test").assignDevice("Chrome");
		ArrayList<String> wid1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid1.get(1));
		String suptil =driver.getTitle();
		System.out.println("the tile " +suptil);
		if (suptil.equals(suptitle)) 
		{
			
			logger.info("Aperta Tile is present--->LANDED ON RIGHT PAGE------>");
			testcase.log(Status.INFO, "WebSupervisor Title Validation-Success");
			
		} else {
			
			logger.error("Aperta Tile is not present--->LANDED ON WRONG PAGE------>");
			testcase.log(Status.FAIL, "WebSupervisor Title Validation-Failure");

		}
		
	}
	
	public void SuperTileValidation() {
		PageFactory.initElements(driver,WebSupervisorPage.class);
		testcase=extent.createTest("WebSupervisor DashTile Validation Test").assignCategory("Aperta WebSupervisor Test").assignDevice("Chrome");
		System.out.println("inside sup valid");
		//String[] SupervisorTiles= {"SBDashboard","DashSession","DashDate"};
		//List<WebElement> supervisorTiles = driver.findElements(By.xpath("//*"));
		//List<WebElement> supervisorTiles = driver.findElements(By.cssSelector("*"));
		//List<String> all_elements=new ArrayList<String>();
		
		//for(WebElement element : supervisorTiles) {
		
		for (int i = 0; i < 3; i++) {
			//System.out.println("inside for loop valid");
			//all_elements.add(WebSupervisorPage.supervisorTiles.getText());
			
			//System.out.println(WebSupervisorPage.supervisorTiles.getText());
			//logger.info("The "+supervisorTiles.get(i).isDisplayed()+" is displayed successfully");
		    //List<String> all_elements=new ArrayList<String>();
			if (WebSupervisorPage.supervisorTiles.get(i).isDisplayed()) {
				System.out.println("inside if loop valid");
				Assert.assertTrue(true);
				logger.info("The "+WebSupervisorPage.supervisorTiles.get(i).getText()+" is displayed successfully");
				testcase.log(Status.PASS, "The "+WebSupervisorPage.supervisorTiles.get(i).getText()+" Title Displayed-Success");
				
			} else {
				Assert.assertFalse(false);
				logger.info("The "+WebSupervisorPage.supervisorTiles.get(i).getText()+" is not displayed");
				testcase.log(Status.FAIL, "The "+WebSupervisorPage.supervisorTiles.get(i).getText()+" Title Displayed-Failure");
			}
			}
	}
	
		
			
		
			
			
			/*if (element.isDisplayed()) {
				Assert.assertTrue(true);
				String supertitle=element.getText();
				logger.info("The "+supertitle+" is displayed successfully");
				testcase.log(Status.PASS, "The "+supertitle+" Dashboard Title Displayed-Success");
				
			} else {
				Assert.assertFalse(false);
				String supertitle=element.getText();
				logger.info("The "+supertitle+" is not displayed");
				testcase.log(Status.FAIL, "The "+supertitle+" Dashboard Title Displayed-Failure");

			}}*/
	
	@Test(priority = 5)
   public void superTest() {
		testcase=extent.createTest("Aperta WebSupervisor Test").assignCategory("Aperta WebSupervisor Test").assignDevice("Chrome");
		opensup();
		superv();
		SuperTileValidation();
	   
   }
}
