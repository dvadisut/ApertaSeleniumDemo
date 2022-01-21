package com.ApertaWebApp_Automate.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

import com.ApertaWebApp_Automate.TestCases.BaseClass;

public class DataEntryPage extends BaseClass {
	
	
	@FindBy(css = "#ABSDiv > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1)")
	public static WebElement dentry;
	@FindBy(xpath ="//*[@id=\"input1\"]")
	public static WebElement amtry;
	@FindBy(xpath = "//*[@id=\"ApertaTile1\"]/div[1]/figure/div[2]/div/img")
	public static WebElement img;
}

