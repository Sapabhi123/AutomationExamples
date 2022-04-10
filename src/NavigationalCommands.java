//NavigationalCommands  forward(), back(), refresh()
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
System.out.println("Navigational Commands");

// To launch a Chrome Browser
System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

// driver.get("https://www.google.com/");//Wait till page loads completely before jumping to the next line
driver.navigate().to("https://www.google.com/");// Doesn't wait till page loads completely before jumping to the
// next line

//Maximising the screen
driver.manage().window().maximize();
Thread.sleep(3000);

driver.findElement(By.xpath("//*[text()='Gmail']")).click();
Thread.sleep(3000);

driver.navigate().back();
Thread.sleep(2000);


driver.navigate().forward();
Thread.sleep(2000);

driver.navigate().back();
Thread.sleep(2000);

driver.navigate().refresh();
Thread.sleep(2000);

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();

driver.close();
}
}

