package com.ApertaWebApp_Automate.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ApertaWebApp_Automate.TestCases.BaseClass;

public class DCBPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"dropDivApertaWDCB\"]")
	public static WebElement dcbtitle;
	@FindBy(xpath ="//*[@id=\"DateText\"]")
	public static WebElement dcbdate;
	@FindBy(xpath ="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")
	public static WebElement dcbselect;
	
}
