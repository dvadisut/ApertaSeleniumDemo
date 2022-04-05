package com.ApertaWebApp_Automate.PageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.tinygroup.template.parser.grammer.TinyTemplateParser.If_directiveContext;

import com.ApertaWebApp_Automate.TestCases.BaseClass;


public class WebSupervisorPage extends BaseClass {


	@FindAll( {
		@FindBy(xpath = "//*[@id=\"SBDashboard\"]/span"),
		@FindBy(xpath = "//*[@id=\"DashSession\"]"),
		@FindBy(xpath = "//*[@id=\"DashDate\"]")
	} )
	public static List<WebElement> supervisorTiles;
	
}

			
			
		
		
		
		
		
		
	

	/*public void supdashtiles() {
		
		WebElement sdash=driver.findElement(By.xpath("//*[@id=\"SBDashboard\"]/span")); 
		WebElement sdsession=driver.findElement(By.xpath("//*[@id=\"DashSession\"]"));
		WebElement sddate=driver.findElement(By.xpath("//*[@id=\"DashDate\"]"));
		//*[@id=\"DashDate\"]
		//*[@id=\"DashArrivals\"]
		WebElement sdarrival=driver.findElement(By.xpath("//*[@id=\"DashArrivals\"]"));
		//*[@id=\"DashDepartures\"]
		WebElement sddeparture=driver.findElement(By.xpath("//*[@id=\"DashDepartures\"]"));
		//*[@id=\"DashProgress\"]
		WebElement sdprogress=driver.findElement(By.xpath("//*[@id=\"DashProgress\"]"));
		//*[@id=\"DashICR\"]
		WebElement sdicr=driver.findElement(By.xpath("//*[@id=\"DashICR\"]"));
		//*[@id=\"DashDCB\"]
		WebElement sddcb=driver.findElement(By.xpath("//*[@id=\"DashDCB\"]"));
		//*[@id=\"DashMC\"]
		WebElement sdmc=driver.findElement(By.xpath("//*[@id=\"DashMC\"]"));
		//*[@id=\"DashDup\"]
		WebElement sdup=driver.findElement(By.xpath("//*[@id=\"DashDup\"]"));
		//*[@id=\"DashTypeTotals\"]
		WebElement sdws=driver.findElement(By.xpath("//*[@id=\"DashTypeTotals\"]"));
		//*[@id=\"DashCHTotals\"]
		WebElement sdin=driver.findElement(By.xpath("//*[@id=\"DashCHTotals\"]"));
		//*[@id=\"DashSites\"]
		WebElement sdsites=driver.findElement(By.xpath("//*[@id=\"DashSites\"]"));
		//*[@id=\"DashReturns\"]
		WebElement sdreturns=driver.findElement(By.xpath("//*[@id=\"DashReturns\"]"));
		//*[@id=\"DashReports\"]
		WebElement sdreports=driver.findElement(By.xpath("//*[@id=\"DashReports\"]"));
		//*[@id=\"DashAttention\"]
		WebElement sdattention=driver.findElement(By.xpath("//*[@id=\"DashAttention\"]"));
		
		
	}*/





