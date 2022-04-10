
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAlertPopupsHandling {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;
static Alert alert;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("http://the-internet.herokuapp.com/javascript_alerts");
driver.manage().window().maximize();

// Simple Alert Handling
element = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button"));
element.click();
Thread.sleep(2000);

alert = driver.switchTo().alert();
alert.accept();
Thread.sleep(2000);

// Confirmation Alert Handling
element = driver.findElement(By.xpath("//*[@id='content']//ul/li[2]/button"));
element.click();
Thread.sleep(2000);
alert = driver.switchTo().alert();
System.out.println("Confirmation Alert Text : " + alert.getText());
// alert.accept();
alert.dismiss();
Thread.sleep(2000);

// Prompt Alert Handling
element = driver.findElement(By.xpath("//*[@id='content']//ul/li[3]/button"));
element.click();
Thread.sleep(2000);
alert = driver.switchTo().alert();
System.out.println("Prompt Alert Text : " + alert.getText());
alert.sendKeys("Binda");
alert.accept();
Thread.sleep(2000);
// alert.dismiss();

// Close the browser
driver.close();
}
}