import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSamples {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// // id locator
		 boolean bool = driver.findElement(By.id("gbwa")).isDisplayed();
		   System.out.println(bool);
		// //locate element ->> 
		   driver.findElement(By.id("gbwa"));
		// //Action to be triggered ->>
		  // driver.findElement(By.id("gbwa")).click();
	
		// //To wait for 2seconds
		//Thread.sleep(2000);
		//
		 //driver.findElement(By.name("q")).sendKeys("Chief Minister");
		 //Thread.sleep(3000);
		//
		// // Link/partialLink Text
		 //driver.findElement(By.linkText("Sign in")).click();
       // driver.findElement(By.partialLinkText("Sign")).click();
		// Thread.sleep(2000);
		//// sign in -> in
		//// sign -> sign
		//// sign down -> down
		// down -> down

		// // // Tag Name
		//driver.findElement(By.tagName("input")).sendKeys("Java Samples");
		// //For Mimicking the Enter Key Action
		//driver.findElement(By.tagName("input")).sendKeys(Keys.RETURN);
	 Thread.sleep(2000);

		//// // Class Name attribute
		driver.findElement(By.className("dRYYxd")).click();   // google microphone name ele
		// Thread.sleep(2000);



		// CSS Selector
//		driver.get("https://google.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(
//		"body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div.SDkEP > div.a4bIc > input"))
//		.sendKeys("Java Samples");
//		driver.findElement(	By.cssSelector(
//		"body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div.SDkEP > div.a4bIc > input"))
//		.sendKeys(Keys.RETURN);
//		Thread.sleep(2000);
//		//
//		// // XPath
//		// driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
//		// .sendKeys("Java Samples");
//		// driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
//		// .sendKeys(Keys.RETURN);
//		// Thread.sleep(2000);
//
//		// Close the browser
		//driver.close();
		}
		



		//Way to choose locators
		//Do we have any ID Attribute? -> By.id()
		//Do we have any Name Attribute? -> By.name()
		//LinkText, ClassName, TagName -> Which is unique
		//Xpath or CSS

		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", ele);
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		


}
