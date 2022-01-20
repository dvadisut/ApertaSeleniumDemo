package com.ApertaWebApp_Automate.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ApertaWebApp_Automate.TestCases.BaseClass;

public class DCBPage extends BaseClass {

	//public static int date=6;
	@FindBy(xpath = "//*[@id=\"dropDivApertaWDCB\"]")
	public static WebElement dcbtitle;
	@FindBy(xpath ="//*[@id=\"DateText\"]")
	public static WebElement dcbcalselect;
	@FindBy(xpath ="//*[@id=\"ui-datepicker-div\"]/div")
	public static WebElement dcbcaltext;
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")
	public static WebElement dcbcalarrow;
	@FindBy(xpath = "//span[contains(text(),'19')]")
	public static WebElement dcbcaldt;
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")
	public static WebElement selectedmonth;
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")
	public static WebElement selectedyear;
	@FindBy(xpath = "//tbody//tr//td//*[contains(text(),\"+date+\")]")
	public static WebElement selectdate;
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")
	public static WebElement skip_year_month;
}
