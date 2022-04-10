package com.PavanExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		// here Select tags are not avail 
       List<WebElement> opt= driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
       
       for(WebElement ele:opt) {
    	   
    	   
    	  if( ele.getText().equals("Accounts"));
    	  
    	    ele.click();
    	    break;
       }
	}

}
