
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class SampleDropdownListsMultipleOptions {

	static WebDriver driver;

	static WebElement element;

	static boolean bool;

	static String text;



	public static void main(String[] args) throws InterruptedException {

		// To launch a Chrome Browser

		System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();



		// https://semantic-ui.com/modules/dropdown.html

		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		driver.manage().window().maximize();

		element = driver.findElement(By.xpath("//select[@name='selenium_commands']"));



		Select select = new Select(element);

		System.out.println("IsMULTIPLE?? : " + select.isMultiple());



		// selectByIndex

		select.selectByIndex(1);

		Thread.sleep(1000);

		select.selectByIndex(2);

		Thread.sleep(1000);

		select.selectByIndex(3);



		// DeselectByIndex

		select.deselectByIndex(1);

		Thread.sleep(2000);

		select.deselectByVisibleText("Navigation Commands");



		// DeselectByVisibleText

		select.deselectByIndex(3);

		Thread.sleep(2000);



		select.selectByIndex(1);

		Thread.sleep(1000);

		select.selectByIndex(2);

		Thread.sleep(1000);

		select.selectByIndex(3);



		select.deselectAll();

		Thread.sleep(2000);



		// Close the browser

		driver.close();

	}

}


