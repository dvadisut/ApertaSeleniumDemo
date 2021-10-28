package com.ApertaWebApp_Automate.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ApertaWebApp_Automate.TestCases.BaseClass;

public class LoginPage extends BaseClass{
	
	
	WebDriver driver=null;
	
	public LoginPage(WebDriver driver)
	{
	    this.driver=driver;
		
	}
	
	public void setusername(String uname) {
    	WebElement username = driver.findElement(By.xpath("//*[@id=\"UserName\"]"));
        username.sendKeys(uname);
		
		
	}

	public void setpassword(String Wpass) {
		
				
				try {
					     WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"OK\"]"));
					     WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
				
						 password.sendKeys(Wpass);
						 logger.info("The Password is entered");
						 loginbutton.click();
						 if (!driver.getPageSource().equals(wrongmsg)) {
							 logger.error("The password is wrong. The error message is displayed correctly");
							logger.info("Trying with the correct password");
						 }
				}
				
				finally {
					
					WebElement password1 = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
					password1.sendKeys("Aperta123!");
					 logger.info("The Password is entered");
					 WebElement loginbutton1 = driver.findElement(By.xpath("//*[@id=\"OK\"]"));
					 loginbutton1.click();
					 logger.info("Submit button is clicked");
					logger.info("Validating the title of the launchpage.....");
				}
				
				}
		}
	


