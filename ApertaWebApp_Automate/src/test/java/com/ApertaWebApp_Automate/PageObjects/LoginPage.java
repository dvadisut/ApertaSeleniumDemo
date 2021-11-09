package com.ApertaWebApp_Automate.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ApertaWebApp_Automate.TestCases.BaseClass;


public class LoginPage extends BaseClass{

	
	@FindBy(xpath ="//*[@id=\"UserName\"]")
	public static WebElement setusername;
	@FindBy(xpath ="//*[@id=\"OK\"]")
	public static WebElement loginbutton;
	@FindBy(xpath ="//*[@id=\"Password\"]")
	public static WebElement password;
	@FindBy(xpath ="//*[@id=\"Password\"]")
	public static WebElement password1;
	@FindBy(xpath ="//*[@id=\"OK\"]")
	public static WebElement loginbutton1;	
	
}

	


