
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExpectedConditionsSample {
static WebDriver driver;
static WebElement element;
static boolean bool;
static WebDriverWait wait;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();

// Explicit wait of 15seconds
wait = new WebDriverWait(driver, 15);

// titleContains??
System.out.println(driver.getTitle());
System.out.println("Title Contains 'Facebook' ?? : ");
System.out.println(driver.getTitle());

//Title -> Facebook – log in or sign up
bool = wait.until(ExpectedConditions.titleContains("Facebook"));
System.out.println(bool);
bool = wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
System.out.println(bool);

// Element displayed?
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("email")))).sendKeys("Bindacharya");
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("pass")))).sendKeys("Binda");
Thread.sleep(2000);

// Element clickable?
// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Forgotten password?")))).click();
element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Forgotten password?"))));
element.click();

Thread.sleep(4000);

// presenceOfElementLocated???
System.out.print("presenceOfElementLocated??? :  ");
System.out.println(
wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("did_submit"))).get(0).getText());

// visibilityOfElementLocated???
System.out.println("visibilityOfElementLocated??? :   ");
System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("did_submit"))));

// Simple Alert Handling
driver.get("http://the-internet.herokuapp.com/javascript_alerts");
wait = new WebDriverWait(driver, 15);

//Locating the JS Alert button

element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));

//Click on JS Alert option
element.click();
Thread.sleep(2000);
String string = wait.until(ExpectedConditions.alertIsPresent()).getText();
Thread.sleep(2000);
System.out.println(string);

// Accept the alert
driver.switchTo().alert().accept();
Thread.sleep(2000);

// Close the browser
driver.close();
}
}

/*
 *
 * VisibilityOfElementLocated Vs presenceOfElementLocated????
 * presenceOfElementLocated will be slightly faster because it's just check that
 * an element is present on the DOM of a page. This does not necessarily mean
 * that the element is visible. while the visibilityOfElementLocated has to
 * check that an element is present on the DOM of a page and visible. Visibility
 * means that the element is not only displayed but also has a height and width
 * that is greater than 0.
 */