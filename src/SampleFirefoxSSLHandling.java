import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SampleFirefoxSSLHandling {
static WebDriver driver;
static WebElement element;

public static void main(String[] args) throws InterruptedException {

// To launch a Firefox Browser
System.setProperty("webdriver.gecko.driver", "/Users/bjahagirdar/Downloads/geckodriver");

// Creating an object of the FirefoxOptions Class
FirefoxOptions firefoxOptions = new FirefoxOptions();

// Using the setAcceptInsecureCerts() method to pass parameter as False
firefoxOptions.setAcceptInsecureCerts(false);
// firefoxOptions.setAcceptInsecureCerts(true);

WebDriver driver = new FirefoxDriver(firefoxOptions);
// WebDriver driver = new FirefoxDriver(DesiredCapabilities);

driver.get("https://wrong.host.badssl.com/");
System.out.println("The page title is : " + driver.getTitle());
Thread.sleep(3000);
driver.quit();

}
}
