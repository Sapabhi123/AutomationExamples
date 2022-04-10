
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class SampleChromeHeadless {
static JavascriptExecutor js;
public static void main(String[] args) throws IOException, InterruptedException {

// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pictures\\chromedriver.exe");

// Set headless chrome
ChromeOptions option = new ChromeOptions();

  option.setHeadless(true);
// OR - No need to add '--'
//option.addArguments("headless");

// // You should set window size for better resolution and screen capture
// option.addArguments("window-size=1200x600");

// // Other Arguments - For Sampling Purpose
// option.addArguments("--disable-gpu");
// option.addArguments("--disable-extensions");
// option.addArguments("--no-sandbox");
// option.addArguments("--disable-dev-shm-usage");

ChromeDriver driver = new ChromeDriver(option);
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
Files.copy(file, new File("./ScreenShot_Folder/Test1" + currentTimeStamp + "ChromeHeadless.png"));

// Close the driver
driver.close();
}
}
