package com.PavanExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkslocateOnpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Best Sellers")).click();
				
		driver.findElement(By.partialLinkText("Sellers")).click(); 
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		int link_count=links.size();
		System.out.println(link_count);
		
		for(int i=0;i<links.size();i++) {
			
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
				
				

	}

}
