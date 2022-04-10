package com.PavanExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html"); 
		
		Actions act=new Actions(driver);
		
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		act.doubleClick(ele).perform();

	}

}


//button[@ondblclick='myFunction()']