package TestNGdriverProvider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxTesting {
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	
	List<WebElement>  li= (List) driver.findElements(By.xpath("//*[@type='checkbox1']"));
	
	for(WebElement check:li) {
		
		check.click();
	}
	
	
	}
}
