package com.PavanExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); 
		
		// drag source ele and drop on target ele 
		Actions act=new Actions(driver);
		
		WebElement rome= driver.findElement(By.xpath("//div[@id='box6']")); //src ele
		
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(rome, italy).perform();		
		
	
		

	}

}
