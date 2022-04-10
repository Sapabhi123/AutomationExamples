package com.PavanExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSliderelementDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/"); 
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions act =new Actions(driver);
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		System.out.println(slider.getLocation());
		
	
		
		act.dragAndDropBy(slider, 100, 0).build().perform();
		
		System.out.println(slider.getLocation());
		
		

	}

}
