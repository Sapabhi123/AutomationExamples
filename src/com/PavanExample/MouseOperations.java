package com.PavanExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); 
		
		Actions act=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M6,8c1.1,0')]"));
				
		act.contextClick(ele).perform();

	}

}
