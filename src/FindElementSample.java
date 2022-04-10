// findElements() Example: match multiple elements instead of single elements

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementSample {
static WebDriver driver;
static WebElement element;
static List<WebElement> listOfElements;

public static void main(String[] args) throws InterruptedException {
// driver.get("http://automationpractice.com/index.php");

// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();

// Open google.com in Chrome Browser
// driver.get("https://en-gb.facebook.com/");
driver.get("https://www.google.com/");
driver.manage().window().maximize();
//Thread.sleep(2000);

//driver.findElement(By.xpath("//input[@value='Google Search'][1]"));


// // NoSuchElementException thrown
// driver.findElement(By.xpath("//input[@value='G']"));

// List of Input boxes
listOfElements = driver.findElements(By.xpath("//input"));
System.out.println("List of Elements");
System.out.println(listOfElements);

// List of Empty items
// listOfElements = driver.findElements(By.xpath("//input[@value='Google Search']"));
listOfElements = driver.findElements(By.xpath("//input[@value='Google Search123']"));
System.out.println(listOfElements.size());
System.out.println("empty List : " + listOfElements);

// Closing the browser
driver.close();
}
}

