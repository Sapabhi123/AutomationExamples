
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshotSample {

	static WebDriver driver;

	static JavascriptExecutor js;

	static WebElement element;

	public static void main(String[] args) throws InterruptedException, IOException {

		// To launch a Chrome Browser

		System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pictures\\chromedriver.exe");

		driver = new ChromeDriver();



		// Creating the JS reference

		js = (JavascriptExecutor) driver;

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);



		// Login flow - Enter the email/password

		js.executeScript("document.getElementById('email').value='Bindacharya';");

		Thread.sleep(2000);



//		// Convert web driver reference to TakeScreenshot

            TakesScreenshot screenshot = ((TakesScreenshot) driver);

//

//		// Call 'getScreenshotAs()' method to create an image file

          //File SrcFile = screenshot.getScreenshotAs(OutputType.FILE);

			

		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);



		// To append Current timestamp to filename

		String currentTimeStamp = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());



		// Copy file at destination

		FileUtils.copyFile(SrcFile, new File("./ScreenShot_Folder/Test1_" + currentTimeStamp + "_Login.png"));



		// Close the driver

		driver.close();

	}

}

