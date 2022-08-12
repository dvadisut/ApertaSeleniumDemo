package TestNGdriverProvider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class refresh {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		System.out.println("URL load");
		driver.get(driver.getCurrentUrl());
		System.out.println("1st reload");
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("location.reload()");
		System.out.println("2st reload");
		Thread.sleep(1000);
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_F5);
		rb.keyRelease(KeyEvent.VK_F5);
		System.out.println("3st reload");

	}

}
