import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleExceptionHandlingInSelenium {
static WebDriver driver;
static WebElement element;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
System.setProperty("webdriver.chrome.driver", "/Users/bjahagirdar/Downloads/chromedriver");
// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pictures\\chromedriver.exe");
driver = new ChromeDriver();

try {
driver.get("https://en-gb.facebook.com/");
element = driver.findElement(By.xpath("//div[@class='SampleClass']"));
}
// catch (NoSuchElementException e) {
// System.out.println("Element NOT FOUND");
// e.printStackTrace();
// }
catch (NoSuchElementException | SessionNotCreatedException e) {
System.out.println(e.getMessage());
e.printStackTrace();
} catch (Exception e) {
System.out.println(e.getMessage());
e.printStackTrace();
} finally { // Meant for clean-up processing
// Close the driver
driver.close();
}
System.out.println("Remaining statements would get executed!!!");

}
}

