
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommandsSample {
static WebDriver driver;

public static void main(String[] args) {

System.out.println("First Selenium Test");

// To launch a Chrome Browser
System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();

System.out.println("************Current URL**********************");
System.out.println(driver.getCurrentUrl());
System.out.println();// To Print a new line

System.out.println("************Current Title**********************");
System.out.println(driver.getTitle());
System.out.println();// To Print a new line


System.out.println();
System.out.println();
System.out.println();
System.out.println("************Page Source**********************");
System.out.println(driver.getPageSource());

driver.close();
}
}

