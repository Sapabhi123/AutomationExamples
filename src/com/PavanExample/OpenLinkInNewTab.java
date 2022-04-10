package com.PavanExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		String newtab=Keys.chord(Keys.CONTROL,Keys.RETURN); // return a string
		driver.findElement(By.xpath("//a[normalize-space()='Contact Sales']")).sendKeys(newtab);

	}

}
