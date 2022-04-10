package com.PavanExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html"); 
		
		// row count
		
	int row=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
	System.out.println(row);
	  // col count
	int col=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size();
	System.out.println(col);
	
	 // fetch complete table data
	 for(int r=2;r<=row;r++) 
	 {
		 for(int c=1;c<=col;c++) 
		 {
			 String data=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
			 
			 System.out.print(data+"|");
		 }	
		 
		 System.out.println("\n");
	 }
		
		
		

	}

}
