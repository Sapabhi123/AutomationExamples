
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleiFramesHandling {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;
static int count;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

// driver.get("https://www.quackit.com/html/examples/frames/");
// driver.manage().window().maximize();
//
// Thread.sleep(5000);
//
// // Frames Handling
// count = driver.findElements(By.tagName("iframe")).size();
// System.out.println(count);
//
// //Switching to frame by ID
// driver.switchTo().frame("aswift_2");
//
//// // Switching to frame by ID
//// driver.switchTo().frame("aswift_0");
//
//// //Switching to frame by index(Not recommended unless only one fr


//// //Switching to frame by index(Not recommended unless only one frame is present)
//// driver.switchTo().frame(2);
//
// // Switch to frame by Web element
//// WebElement element = driver.findElement(By.xpath("//iframe[@id='aswift_2']")); // //*[@id="aswift_0"]
//// driver.switchTo().frame(element);
//
// // Get title of Frame / Page
// System.out.println(driver.getTitle());
// Thread.sleep(3000);
//
// // Switch back to main frame
// driver.switchTo().defaultContent();
//
// // Click on Home button in Main Frame
// driver.findElement(By.xpath("//header/div//a//img")).click();
// Thread.sleep(3000);

// Nested Frames sample
driver.get("https://the-internet.herokuapp.com/frames");

// identify element and click
driver.findElement(By.partialLinkText("Nested")).click();

// switching to frame with frame name
driver.switchTo().frame("frame-bottom");
WebElement m = driver.findElement(By.cssSelector("body"));
System.out.println("Frame text: " + m.getText());

// Close the browser
driver.close();
}
}

//FRAME-1 TO FRAME-2
//SWITCHING TO FRAME-1 -> Perform all the actions
//SWITCHING TO DEFAULT CONTENT(PARENT FRAME)
//SWITCHING TO FRAME-2 -> Perform all the actions

