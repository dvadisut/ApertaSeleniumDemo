package TestNGdriverProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProvidetest {
	
	
	
	
	
	
	@Test(dataProvider = "logindata",dataProviderClass = dp.class)
	public void method1(String user,String pass) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.stealmylogin.com/demo.html");
		
		WebElement j=driver.findElement(By.xpath("/html/body/form/input[1]"));
				j.sendKeys(user);
		WebElement g=driver.findElement(By.xpath("/html/body/form/input[2]"));
				g.sendKeys(pass);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
		
		
	}

}
