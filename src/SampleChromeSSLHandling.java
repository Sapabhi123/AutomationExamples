import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleChromeSSLHandling {
static WebDriver driver;
static WebElement element;

public static void main(String[] args) throws InterruptedException {

// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");

// Create instance of ChromeOptions Class
ChromeOptions handlingSSL = new ChromeOptions();

// Using the accept insecure cert method with true as parameter to accept the
// untrusted certificate
handlingSSL.setAcceptInsecureCerts(false);
// handlingSSL.setAcceptInsecureCerts(true);

// Creating instance of Chrome driver by passing reference of ChromeOptions
// object
driver = new ChromeDriver(handlingSSL);
driver.manage().window().maximize();

// Launching the URL
driver.get("https://wrong.host.badssl.com/");
Thread.sleep(2000);
System.out.println("The page title is : " + driver.getTitle());
Thread.sleep(2000);
// Closing the browser
driver.close();
}
}

