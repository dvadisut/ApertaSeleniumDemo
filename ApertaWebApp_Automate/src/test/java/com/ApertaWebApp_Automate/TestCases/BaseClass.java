package com.ApertaWebApp_Automate.TestCases;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ApertaWebApp_Automate.utilities.ReadConfig;
import com.ApertaWebApp_Automate.utilities.Reporting1;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class BaseClass {

	static ReadConfig readconfig=new ReadConfig(); 
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public String Wpassword=readconfig.getWpassword();
	public String wrongmsg=readconfig.getwrongmsg();
	public static String detitle=readconfig.getdetitle(); 
	public String aptitle=readconfig.getaptitle();
	public static String dcbtitle=readconfig.getdcbtitle();
	public static String baltitle=readconfig.getbaltitle();
	public String suptitle=readconfig.getsuptitle();
	public static WebDriver driver;
	public static Logger logger;
	public static String targetdate=readconfig.targetdate();
	public static String selectedmonth; 
	public static String selectedyear;
	public static String Selected_month_year;
	public static String target_month_year = readconfig.targetmonth() + " " + readconfig.targetyear();
	public static String dcbamount=readconfig.dcbamount();
	
	public ExtentSparkReporter Reporter;
	public static ExtentReports extent;
	public static ExtentTest testcase;
	public static String Author =readconfig.author();

	@BeforeSuite
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath()); 
		ChromeOptions handlingSSL = new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);
		driver= new ChromeDriver(handlingSSL);
	    driver.manage().window().maximize();
	    driver.get(baseURL);
		logger = Logger.getLogger("BaseClass.class");
		PropertyConfigurator.configure("Log4j.properties");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
			String repName="Test-Report.html";
			
			Reporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/Aperta-Reports/"+repName).viewConfigurer().viewOrder().as(new ViewName[] {ViewName.CATEGORY,ViewName.DASHBOARD,ViewName.TEST}).apply();//specify location of the report
			try {
				Reporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			extent=new ExtentReports();
			
			extent.attachReporter(Reporter);
			extent.setSystemInfo("Project","Bank Of America-Phillipines");
			extent.setSystemInfo("Windows Server","2019");
			extent.setSystemInfo("Web Broswer","Chrome");
			
			
			Reporter.config().setDocumentTitle("Aperta Test Report"); // Tile of report
			Reporter.config().setReportName("Aperta Web Application Testing"); // name of the report
			//Reporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
			Reporter.config().setTheme(Theme.DARK);
			
			
		}
		
	@AfterSuite
	public void close()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
		extent.flush();
		
	}
}

