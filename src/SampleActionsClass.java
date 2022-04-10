
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SampleActionsClass {
static WebDriver driver;
static WebElement element, source, destination, firstName, userName;
static Actions action, action1;

public static void main(String[] args) throws InterruptedException {

// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

// Open google.com in Chrome Browser
//driver.get("https://www.google.com/");

//driver.manage().window().maximize();
//Thread.sleep(2000);

// SendKeys
// specify the locator of the search box
//element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

// create an object for the Actions class and pass the driver argument
//With Actions reference variables, can perform either a single action or a series of actions
//action = new Actions(driver);

// // pass the product name that has to be searched in the opposite
// action = action.sendKeys(element, "iphone");
// Action action2 = action.build();
// action2.perform();

//	action.sendKeys(element, "iphone").build().perform();  //build() is used to perform composite action even for sing action u can use it 
//hread.sleep(3000);
//
// @@ Double Click@@
 //driver.get("https://www.amazon.in/");
 //driver.manage().window().maximize();
//element = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
//action = new Actions(driver);
//
// @@Double-Click of the Mouse@@
//action.doubleClick(element).build().perform();
// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
// Thread.sleep(3000);
//
// @@Right Click of the Mouse@@
//action.contextClick().build().perform();
// Thread.sleep(3000);
//
// @@ Mouse Hovers @@
// driver.get("http://the-internet.herokuapp.com/hovers");
//driver.manage().window().maximize();
//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//
// @@ Mouse Hover @@
// // specify the locator of the Resources menu
//element = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img"));
// action = new Actions(driver);
// Thread.sleep(2000);
//
// @@ mouse hover the Resources element@@
//action.moveToElement(element).perform();
// action.moveToElement(element).build().perform();
// System.out.println();
//
// Thread.sleep(2000);
// element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a"));
// element.click();
// Thread.sleep(2000);
//
// @@ DragAndDrop Sample @@
// driver.get("https://www.tutorialspoint.com/html5/drag_demo.htm");
//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//driver.manage().window().maximize();
////
// @@ Switching to frame @@
//element = driver.findElement(By.xpath("//iframe[@class='result']"));
//driver.switchTo().frame(element);
//Thread.sleep(2000);
//
// @@  Draggable element @@

//source = driver.findElement(By.xpath("//*[@id='one']/span[text()='Music']"));
//destination = driver.findElement(By.xpath("//div[@id='bin']"));
//
// @@ Instantiating actions object @@
 //action = new Actions(driver);
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].scrollIntoView();", destination);
// Thread.sleep(3000);
//
// @@ Drag N Drop @@
//action.dragAndDrop(source, destination).build().perform();
//action.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
// action.dragAndDropBy(source,100,100 );
//action.dragAndDropBy(source, destination.getLocation().getX(), destination.getLocation().getY());
// action.moveByOffset(0, 500);
//// Thread.sleep(3000);
//
//@@ Key up/down @@
 driver.get("https://www.google.com/");
 driver.manage().window().maximize();
 element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
 Thread.sleep(2000);
 action = new Actions(driver);
//
// @@ holds the SHIFT key and converts the text to uppercase @@
 //keyDown -> Pressing the Key
 //KeyUp -> Releasing the key
 action.keyDown(element, Keys.SHIFT).sendKeys("Java Oracle").sendKeys(Keys.ENTER).keyUp(Keys.SHIFT).build()
 .perform();
//
// Thread.sleep(3000);
// // Scroll Up /Down the page
// // Scroll Down using Actions class
 action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
//
// Thread.sleep(2000);
// // Scroll Up using Actions class
 action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
// Thread.sleep(2000);

// driver.get("https://en-gb.facebook.com/");
// action = new Actions(driver);
// driver.manage().window().maximize();
//
// @@ Pressing Command button @@
// action.keyDown(Keys.COMMAND).build().perform();
//
// driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
// Thread.sleep(2000);
//
// @@ Release Command button @@
// action.keyUp(Keys.COMMAND).build().perform();
// Thread.sleep(3000);

// Closing the browser
//driver.quit();
}
}










