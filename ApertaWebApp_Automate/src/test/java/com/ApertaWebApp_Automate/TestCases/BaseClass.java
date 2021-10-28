package com.ApertaWebApp_Automate.TestCases;



import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.ApertaWebApp_Automate.utilities.ReadConfig;

public class BaseClass{

	ReadConfig readconfig=new ReadConfig(); 
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public String Wpassword=readconfig.getWpassword();
	public String wrongmsg=readconfig.getwrongmsg();
	public String detitle=readconfig.getdetitle(); 
	public String aptitle=readconfig.getaptitle();
	public String dcbtitle=readconfig.getdcbtitle();
	public String baltitle=readconfig.getbaltitle();
	public String suptitle=readconfig.getsuptitle();
	public WebDriver driver;
	public static Logger logger;
	Date date=new Date();
	
	
	

	@BeforeClass
	public void setup()
	{
	
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath()); 
		ChromeOptions handlingSSL = new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);
		driver= new ChromeDriver(handlingSSL);
	    driver.manage().window().maximize();
		logger = Logger.getLogger("BaseClass.class");
		PropertyConfigurator.configure("Log4j.properties");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
}

