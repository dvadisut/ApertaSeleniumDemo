package TestNGdriverProvider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		Select sc= new Select(driver.findElement(By.xpath("//*[@class='input-xlarge']")));
		
		List<WebElement> li=sc.getOptions();
		
		for(WebElement s: li) {
			
			
			System.out.println(s.getText());
		}
		
		sc.selectByValue("Python");
		Thread.sleep(1000);
		sc.selectByIndex(4);
		Thread.sleep(1000);
		sc.selectByVisibleText("C++");
		
	}
}
