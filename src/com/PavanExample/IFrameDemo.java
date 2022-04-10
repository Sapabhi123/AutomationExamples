package com.PavanExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		// step 1 switch to frame1  
		driver.switchTo().frame("packageListFrame"); 
		//step 2. then locate the element inside the frame1
		driver.findElement(By.xpath("//main[@role='main']")).click();
		//step 3. return back from frame1 to main page 
		driver.switchTo().defaultContent();

		// jump 2nd frame follow the same steps as above 
		driver.switchTo().frame("packageFrame"); 
		driver.findElement(By.xpath("//main[@role='main']")).click();
		driver.switchTo().defaultContent();
		
		// jump int 3rd frames
		
		driver.switchTo().frame("classFrame"); 
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click();
		driver.switchTo().defaultContent();
		
	}

}
