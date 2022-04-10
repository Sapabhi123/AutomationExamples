package com.PavanExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		WebElement ele=driver.findElement(By.xpath("(//select)[1]"));
		
      	Select s=new Select(ele);
//		      s.selectByIndex(2);
//		       Thread.sleep(100);
//		       s.selectByVisibleText("India");
//		         Thread.sleep(100);
//		       s.selectByValue("CAN");
//		       Thread.sleep(100);
		List<WebElement> options=s.getOptions();
		       
		       for(WebElement dd:options) {
		    	   
		    	   if(dd.getText().equals("India")) {
		    		   
		    		   dd.click();
		    	   }
		       }
		
	}}


