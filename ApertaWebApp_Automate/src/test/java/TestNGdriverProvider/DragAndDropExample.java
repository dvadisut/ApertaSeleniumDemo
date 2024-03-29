package TestNGdriverProvider;
/*
 * package TestNGdriverProvider;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class DragDrop {
 * 
 * public static void main(String[] args) {
 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
 * ChromeDriver(); driver.manage().timeouts().implicitlyWait(10000,
 * TimeUnit.MILLISECONDS);
 * driver.get("https://the-internet.herokuapp.com/drag_and_drop");
 * 
 * WebElement from=driver.findElement(By.xpath("//*[@id='column-a']"));
 * 
 * WebElement to=driver.findElement(By.xpath("//*[@id='column-b']"));
 * 
 * Actions act=new Actions(driver);
 * 
 * act.dragAndDrop(from, to).perform();
 * 
 * 
 * }
 * 
 * }
 */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager; 
public class DragAndDropExample {
public static void main(String[] args) throws InterruptedException { 
//Set system properties for geckodriver System.setProperty("webdriver.gecko.driver", "Path_of_the_driver");
//WebDriver driver = new FirefoxDriver();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
String URL = "https://the-internet.herokuapp.com/drag_and_drop";
driver.get(URL);
// It is always advisable to Maximize the window before performing DragNDrop action driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//Actions class method to drag and drop 
Actions builder = new Actions(driver);
WebElement from = driver.findElement(By.id("column-a"));
WebElement to = driver.findElement(By.id("column-b")); 
//Perform drag and drop
builder.dragAndDrop(from, to).perform();
//verify text changed in to 'Drop here' box 
String textTo = to.getText();
if(textTo.equals("Dropped!")) {
System.out.println("PASS: File is dropped to target as expected");
}else {
System.out.println("FAIL: File couldn't be dropped to target as expected");
}
driver.close();
} 
}
