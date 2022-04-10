package com.PavanExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/"); 
		
		Actions act=new Actions(driver);
		
		WebElement ele1=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		Thread.sleep(100);
		
		WebElement ele2= driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
		
		Thread.sleep(100);
		
		WebElement ele3= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Thread.sleep(100);
		
		act.moveToElement(ele1).moveToElement(ele2).moveToElement(ele3).click().perform();
		
		
		
		
		
		

	}

}
