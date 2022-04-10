
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentXPathHandling {
static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
// driver.get("http://automationpractice.com/index.php");

// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

// Open google.com in Chrome Browser
driver.get("https://www.google.com/");
driver.manage().window().maximize();
Thread.sleep(2000);

//// Attribute
// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java Samples");
//// driver.findElement(By.xpath("//input[@name='q'][@type='text']")).sendKeys("Java
//// Samples");
// Thread.sleep(2000);
//
// driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
// Thread.sleep(2000);


// // Contains() method -> For dynamic elements handling
// driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Java Samples");
// driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys(Keys.RETURN);
// Thread.sleep(2000);
//
// // and / or expression
// // T1 & T2 -> True -> Both true, T1 | T2 -> True -> Either true,
//// driver.findElement(By.xpath("//input[@name='q' and @type='text']")).sendKeys("Java Samples");
// driver.findElement(By.xpath("//input[@name='q' or @type='text']")).sendKeys("Java Samples");
// driver.findElement(By.xpath("//input[@name='q' and @type='text']")).sendKeys(Keys.RETURN);
// Thread.sleep(2000);

// firstName -> contains -> name, first, fistN, firstName
// firstName -> starts -> first, fistN, firstName

//firstname , nameFirst
// // start-with function
// driver.findElement(By.xpath("//input[starts-with(@type,'tex')]")).sendKeys("Java Samples");


// driver.findElement(By.xpath("//input[starts-with(@type,'tex')]")).sendKeys(Keys.RETURN);
// Thread.sleep(2000);
//
// //text()
//// driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
// driver.findElement(By.xpath("//a[text()='Gmail']")).click();
// Thread.sleep(2000);
//
//
//// // index
// driver.findElement(By.xpath("//input[contains(@name,'q')][1]")).sendKeys("Java Samples");
//// driver.findElement(By.xpath("//input[contains(@name,'q')][1]")).sendKeys(Keys.RETURN);
//// Thread.sleep(2000);

// Closing the browser
driver.close();
}
}


