
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.google.common.io.Files;

public class SampleFirefoxHeadless {
static JavascriptExecutor js;

public static void main(String[] args) throws IOException, InterruptedException {

// To launch a Firefox Browser
System.setProperty("webdriver.gecko.driver", "/Users/bjahagirdar/Downloads/geckodriver"); // firefox driver path
// System.setProperty("webdriver.chrome.driver",
// "C:\\Users\\Pictures\\chromedriver.exe");

// Set headless chrome
FirefoxOptions option = new FirefoxOptions();

// option.setHeadless(true);
// OR - No need to add '--'
// option.addArguments("--headless");
option.setHeadless(true);
// option.setHeadless(false);

// You should set window size for better resolution and screen capture
option.addArguments("window-size=1200x600");
option.addArguments("--disable-gpu");

FirefoxDriver driver = new FirefoxDriver(option);
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(2000);

// Creating the JS reference
js = (JavascriptExecutor) driver;
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(2000);

// Login flow - Enter the email/password
js.executeScript("document.getElementById('email').value='Bindacharya';");
Thread.sleep(2000);
// To append Current timestamp to filename
String currentTimeStamp = new SimpleDateFormat("yyyyMMddHHmm'.txt'").format(new Date());

// Capturing screenshot
File file = driver.getScreenshotAs(OutputType.FILE);
Files.copy(file, new File("./ScreenShot_Folder/Test1" + currentTimeStamp + "FirefoxHeadless.png"));

// Close the driver
driver.close();
}
}
