package TestNGdriverProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hoverTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		WebElement rght=driver.findElement(By.xpath("//*[@id='myButton']"));
		Actions act= new Actions(driver);
		act.doubleClick(rght).perform();

	}

}
