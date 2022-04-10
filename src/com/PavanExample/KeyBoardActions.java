package com.PavanExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/key_presses"); 
					
			driver.findElement(By.xpath("//input[@id='target']"));
			Actions act=new Actions(driver);
			
			act.sendKeys(Keys.CONTROL).perform();
							
			act.sendKeys(Keys.ENTER).perform();
	}

}
