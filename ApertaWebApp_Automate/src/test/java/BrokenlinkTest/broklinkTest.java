package BrokenlinkTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class broklinkTest {
	
	
	
	@Test

	public void methodbroketest() throws MalformedURLException, IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumbase.io/demo_page");
		
		List <WebElement> li=driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> it=li.iterator();
		
		while(it.hasNext()) {
		
			String url=it.next().getAttribute("href");
		
		
		
		
			
			System.out.println(url);
			
			
			
			try {
			  HttpURLConnection ht= (HttpURLConnection)(new URL(url).openConnection());
			  
			  ht.setRequestMethod("HEAD");
			  
			  ht.connect();
			  
			  int responsecode=ht.getResponseCode();
			  
			  if(responsecode>=400) {
			  
			  System.out.println("Link broken");
			  
			  } else {
			  
			  System.out.println("Link okay"); }}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			 
			
		}
		
	}}

