
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleMultipleWindowsHandling {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("http://the-internet.herokuapp.com/windows");
driver.manage().window().maximize();

// Multiple Windows Handling
element = driver.findElement(By.xpath("//a[text()='Click Here']"));
element.click();
Thread.sleep(3000);

// Get handles of the windows
String mainWindowHandle = driver.getWindowHandle();
Set<String> allWindowHandles = driver.getWindowHandles();
System.out.println(allWindowHandles);
Iterator<String> iterator = allWindowHandles.iterator();

// Check if child window has other child windows and will fetch the text from
// the child window
while (iterator.hasNext()) {
System.out.println(allWindowHandles.size());
String ChildWindow = iterator.next();
if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
// Switch to another child window
driver.switchTo().window(ChildWindow);

// Read 'New Window' text
WebElement text = driver.findElement(By.xpath("//div[@class='example']"));
System.out.println("Heading of child window is --->>>>    " + text.getText());
Thread.sleep(3000);
}
}

//Close the child window
driver.close();
Thread.sleep(2000);

//Switch back to parent window
driver.switchTo().window(mainWindowHandle);

//Clicking on the button
element = driver.findElement(By.xpath("//a[text()='Click Here']"));
Thread.sleep(2000);

element.click();
Thread.sleep(3000);
// Close the browser
driver.quit();
}
}

//1 != 2 -> Not FALSE -> True
//1  
//1 2