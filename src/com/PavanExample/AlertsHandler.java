package com.PavanExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// alert window (browser stuff) with ok button 
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(100);
		driver.switchTo().alert().accept();
		
		// alert window (browser stuff) with ok and cancel (2) buttons
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
				
		driver.switchTo().alert().accept();
		
			
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		 
		Alert alertwindow=driver.switchTo().alert();
		//alertwindow.getText();
		alertwindow.sendKeys("hi helo");
		
		alertwindow.accept();
		
		
		
		
	}

}
