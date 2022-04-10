
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCheckBoxes {
static WebDriver driver;
static WebElement ele;
static boolean bool;
static String text;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

// Open http://automationpractice.com in Chrome Browser
driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
driver.manage().window().maximize();

// element= driver.findElement(By.id("layered_category_4"));
ele = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a"));
//ele=driver.findElement(By.xpath("//a[@id='color_20']"));
// Click on Element - Check the check-box
ele.click();
Thread.sleep(3000);

if (ele.isSelected()) {
System.out.println("Element is Selected");

}
else 
{
System.out.println("Element is NOT Selected");
}

Thread.sleep(3000);
// Click on Element - Un-Check the check-box
ele.click();
if (ele.isSelected()) {
System.out.println("Element is Selected");
} else {
System.out.println("Element is NOT Selected");
}

Thread.sleep(3000);
if (ele.isDisplayed()) {
System.out.println("Element is displayed");
} else {
System.out.println("Element is NOT displayed");
}

Thread.sleep(3000);
if (ele.isEnabled()) {
System.out.println("Element is Enabled");
} else {
System.out.println("Element is NOT Enabled");
}

// Close the browser
driver.close();
}
}