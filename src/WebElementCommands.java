

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

// Open google.com in Chrome Browser
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(2000);

// // Send keys and Clear Command
 element = driver.findElement(By.xpath("//input[@id='email']"));
element.sendKeys("Typingggg");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='email']")).clear();
 Thread.sleep(3000);
//
//// Click()/Submit() Command
/*click() - Perform only click operation as like mouse click.
//submit() - Perform Enter operation as like keyboard Enter event.
The submit() function is applicable only for <form> and makes handling of form easier. 
It can be used with any element inside a form. The click() is only applicable to buttons with type submit in a form.

The submit() function shall wait for the page to load however the click() 
waits only if any explicit wait condition is provided. If a form has a submit of type button,
the submit() method cannot be used. Also, if a button is outside <form>, then submit() will not work.
Thus we see that click() works for both type buttons irrespective of the 
fact that the button is inside or outside of <form>.
*/

//
// element = driver.findElement(By.xpath("//input[@type='password']"));
// element.sendKeys("Password");
// Thread.sleep(3000);
//
// element = driver.findElement(By.name("login"));
// element.submit();
// Thread.sleep(3000);
//// element.click();
//
// isDisplayed Command
element = driver.findElement(By.id("email"));
bool = element.isDisplayed();
System.out.println("Is displayed ?? : " + bool);

// isEnabled Command
element = driver.findElement(By.id("email"));
bool = element.isEnabled();
System.out.println("Is Enabled ?? : " + bool);

//getText command
element = driver.findElement(By.name("login"));
text = element.getText();
System.out.println("Get Text : " + text);


//getTagName command
element = driver.findElement(By.name("login"));
text = element.getTagName();
System.out.println("Get Tag : " + text);

//getAttribute command
element = driver.findElement(By.name("login"));
text = element.getAttribute("name");
System.out.println("Get Attribute : " + text);
text = element.getAttribute("data-testid");
System.out.println("Get Attribute : " + text);

// getSize command
element = driver.findElement(By.name("login"));
Dimension dimension = element.getSize();
System.out.println(dimension.getHeight());
System.out.println(dimension.getWidth());

// getLocation command
element = driver.findElement(By.name("login"));
Point point = element.getLocation();
System.out.println(point.getX());     //(x,y) point value
System.out.println(point.getY());

// getCssValue
// CSS property such as background-color, font-family,color, font-weight etc.,
element = driver.findElement(By.name("login"));
System.out.println(element.getCssValue("color"));


System.out.println(element.getCssValue("border-radius"));
System.out.println(element.getCssValue("font-size"));
System.out.println(element.getCssValue("font-weight"));

// Closing the browser
driver.close();

}
}


