import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleHyperLinks {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

// Open google.com in Chrome Browser
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();

List<WebElement> elements = driver.findElements(By.tagName("a"));

// Iterate through all the elements and print text and respective links
for (WebElement element : elements) {
System.out.print(" Element Text : " + element.getText() + " ");
System.out.print(" Element Link : " + element.getAttribute("href"));
System.out.println();
}}
}
//