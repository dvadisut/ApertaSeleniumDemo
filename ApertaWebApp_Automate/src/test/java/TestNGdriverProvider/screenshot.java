package TestNGdriverProvider;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		TakesScreenshot sh=(TakesScreenshot)driver;
		 
		File src=sh.getScreenshotAs(OutputType.FILE);
		 
		  File dest=new File("D://test.jpg"); 
		  FileUtils.copyFile(src, dest);

	}

}
