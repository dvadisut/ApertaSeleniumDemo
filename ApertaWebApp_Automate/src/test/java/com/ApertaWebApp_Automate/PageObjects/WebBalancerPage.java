package com.ApertaWebApp_Automate.PageObjects;



import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ApertaWebApp_Automate.TestCases.BaseClass;

public class WebBalancerPage extends BaseClass {
	
	@FindBy(css = "#ABSDiv > ul:nth-child(2) > li:nth-child(8)")
	public static WebElement chckpass;
	@FindBy(xpath = "//*[@id=\"helpMCapprove\"]")
	public static WebElement WBapprove;
	@FindBy(xpath = "//*[@id=\"DrawArea\"]/img")
	public static WebElement WBimg;
	@FindBy(xpath = "//*[@id=\"helpclose\"]")
	public static WebElement WBclose;
		}
	




