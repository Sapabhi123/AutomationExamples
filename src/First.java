
//1. open browser
//2.login
//3.sign out
//4. close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
//import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.Test;

public class First {
	static WebDriver driver;

	@Test(priority=1)
	public void setUp() {  // all setup before class madbeku 
		// open the browser first
		System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}

	@Test(priority=2)
	void login() {
		// WebDriver driver=new ChromeDriver();

		driver.findElement(By.name("identifier")).sendKeys("abhinandans2010@gmail.com");

		// l.sendKeys("abc@gmail.com");
		WebElement b = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		b.click();
		// identify password
		WebElement p = driver.findElement(By.name("password"));
		p.sendKeys("123456");
		b.click();
		// close browser
		driver.close();

	}
}
