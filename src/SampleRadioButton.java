import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleRadioButton {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

// Open URL in browser
driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
driver.manage().window().maximize();

Thread.sleep(10000);
// Click the ad-close button
driver.findElement(By.xpath("//*[@id='AdThrive_Footer_1_desktop']/span")).click();

Thread.sleep(2000);
element = driver.findElement(By.xpath("//input[@value='Beginner']"));
element.click();
Thread.sleep(3000);


if (element.isSelected()) {
System.out.println("Element is Selected");
} else {
System.out.println("Element is NOT Selected");
}

// Click on 'Excel' radio button
element = driver.findElement(By.xpath("//input[@value='Excel']"));
element.click();
Thread.sleep(3000);

if (element.isSelected()) {
System.out.println("Element is Selected");
} else {
System.out.println("Element is NOT Selected");
}
Thread.sleep(2000);

element = driver.findElement(By.xpath("//input[@value='QBP']"));
element.click();
Thread.sleep(3000);

if (element.isSelected()) {
System.out.println("Element is Selected");
} else {
System.out.println("Element is NOT Selected");
}
Thread.sleep(2000);

if (element.isDisplayed()) {
System.out.println("Element is displayed");
} else {
System.out.println("Element is NOT displayed");
}
}}

