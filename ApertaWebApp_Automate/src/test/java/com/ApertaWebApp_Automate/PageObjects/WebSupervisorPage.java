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


	/*
	
	public void suplefttitle() {
		ArrayList<String> wid1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid1.get(1));
		    WebElement sdate=driver.findElement(By.xpath("//*[@id=\"SBDate\"]/span"));	
		    boolean sd= sdate.isDisplayed();
		    String s1=String.valueOf(sd);
			WebElement stime=driver.findElement(By.xpath("//*[@id=\"SideBarList\"]/li[2]/span")); 
			 boolean st= stime.isDisplayed();
			    String s2=String.valueOf(st);
			WebElement ssession=driver.findElement(By.xpath("//*[@id=\"SBSession\"]/span"));
			WebElement sicl=driver.findElement(By.xpath("//*[@id=\"SBFiles\"]/span")); 
			WebElement stot=driver.findElement(By.xpath("//*[@id=\"SBTotals\"]/span"));
			WebElement ssite=driver.findElement(By.xpath("//*[@id=\"SBSites\"]/span")); 
			WebElement sreturn=driver.findElement(By.xpath("//*[@id=\"SBReturns\"]/span")); 
			WebElement sreport=driver.findElement(By.xpath("//*[@id=\"SBReports\"]/span")); 
			WebElement statics=driver.findElement(By.xpath("//*[@id=\"SBStats\"]/span")); 
			WebElement stasks=driver.findElement(By.xpath("//*[@id=\"SBTasks\"]/span")); 
			WebElement steam=driver.findElement(By.xpath("//*[@id=\"SBTeam\"]/span")); 
			WebElement sattention=driver.findElement(By.xpath("//*[@id=\"SBAttention\"]/span")); 
			WebElement salerts=driver.findElement(By.xpath("//*[@id=\"SBAlerts\"]/span")); 
			WebElement sdoc=driver.findElement(By.xpath("//*[@id=\"SBDocs\"]/span")); 
			WebElement smore=driver.findElement(By.xpath("//*[@id=\"SideBarList\"]/li[21]/span")); 
			WebElement sfilter=driver.findElement(By.xpath("//*[@id=\"SideBarList\"]/li[22]")); 
			WebElement sicls=driver.findElement(By.xpath("//*[@id=\"SideBarList\"]/li[23]/span")); 
			WebElement sallsite=driver.findElement(By.xpath("//*[@id=\"SideBarList\"]/li[24]/span")); 
			WebElement scurren=driver.findElement(By.xpath("//*[@id=\"SideBarList\"]/li[25]/span")); 
			WebElement susername=driver.findElement(By.xpath("//*[@id=\"SideBarList\"]/li[28]/span"));
			
	String[] ele= {s1,s2};
	
	for (int i = 0; i < ele.length; i++) {
		
	}
	
	
	
	}
			
			
		
		
		
		
		
		
	
	
	public void supdashtiles() {
		
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
	
	
	@FindBy(xpath = "//*[@id=\"SBDashboard\"]/span")
	public static WebElement SBDashboard;
	@FindBy(xpath = "//*[@id=\"DashSession\"]")
	public static WebElement DashSession;
	@FindBy(xpath = "//*[@id=\"DashDate\"]")
	public static WebElement DashDate;
	public static List<WebElement> supervisorTiles = driver.findElements(By.xpath("//*"));
	public static WebElement element;
}

