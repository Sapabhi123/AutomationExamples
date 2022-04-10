package com.PavanExample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); 
		
		String windowId=driver.getWindowHandle();  // return single window id its a string
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> winIDs	=driver.getWindowHandles();
		
		Iterator<String>it =winIDs.iterator();
		String ParentId= it.next();
		String ChildId=it.next();
		  System.out.println(ParentId);
		  System.out.println("---------------------------------------------------------");
		  System.out.println(ChildId);
		  
		  driver.switchTo().window(ParentId);
		  
		  System.out.println(driver.getTitle());
		  driver.switchTo().window(ChildId);
		  System.out.println(driver.getTitle());
	
	
		

	}

}
