package TestNGdriverProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class TestNG_order {
	WebDriver driver;

	@BeforeSuite
	public void m1() {

		System.out.println("Before suite");
	}

	@BeforeTest
	public void m2() {

		System.out.println("Before test");
	}

	@BeforeClass
	public void m3() {

		System.out.println("Before class");
	}

	@BeforeMethod
	public void m4() {

		System.out.println("Before method");
	}

	@Test
	public void m5() throws IOException {

		System.out.println("test1");

		/*
		 * TakesScreenshot sh=(TakesScreenshot)driver;
		 * 
		 * java.io.File src=sh.getScreenshotAs(OutputType.FILE);
		 * 
		 * File dest=new File("D://test.jpg"); FileUtils.copyFile(src, dest);
		 * 
		 * 
		 * TakesScreenshot webdriver; TakesScreenshot scrShot
		 * =((TakesScreenshot)webdriver);
		 * 
		 * //Call getScreenshotAs method to create image file
		 * 
		 * java.io.File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 * 
		 * //Move image file to new destination
		 * 
		 * File DestFile=new File("D://test.png");
		 * 
		 * //Copy file at destination
		 * 
		 * //FileUtils.copyFile(SrcFile, new File("D://test.jpg"));
		 * FileUtils.copyFile(SrcFile, new File("D://test.jpg"));
		 */
	}

	@Test
	public void m6() {

		System.out.println("test2");
	}

	@AfterMethod
	public void m10() {

		System.out.println("After method");
	}

	@AfterClass
	public void m9() {

		System.out.println("After class");
	}

	@AfterTest
	public void m8() {

		System.out.println("After test");
	}

	@AfterSuite
	public void m7() {

		System.out.println("After suite");
	}

}
