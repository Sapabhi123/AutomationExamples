package com.PavanExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {  //url: https://itera-qa.azurewebsites.net/home/automation

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
// select single check box
		List <WebElement>list = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(WebElement opt:list) 
		{
			Thread.sleep(100);
			opt.click();
				
		}
			
		}
	}

