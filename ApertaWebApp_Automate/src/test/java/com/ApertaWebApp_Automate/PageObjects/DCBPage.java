package com.ApertaWebApp_Automate.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ApertaWebApp_Automate.TestCases.BaseClass;

public class DCBPage extends BaseClass {
WebDriver driver=null;
	
	public DCBPage(WebDriver driver)
	{
	    this.driver=driver;   
		
	}


	public void dcbtitle() {
		WebElement dcbtile=driver.findElement(By.xpath("//*[@id=\"dropDivApertaWDCB\"]")); //DCB title  
		dcbtile.click();
	}
	
	public void dcbdate() throws InterruptedException {
		
		WebElement calpick=driver.findElement(By.xpath("//*[@id=\"DateText\"]")); //date picker 
		calpick.click();
		WebElement datepick=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")); //select the date
		datepick.click();
	}

    public void dcbchck() {
  
		WebElement checker=driver.findElement(By.xpath("//*[@id=\"ABSDiv\"]/ul[1]/li[8]/div[1]")); //checker
		checker.click();
	}
}
