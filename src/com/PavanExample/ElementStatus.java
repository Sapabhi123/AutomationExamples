package com.PavanExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStatus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register");
		
		//Boolean bool1=driver.findElement(By.xpath("//input[@id='FirstName']")).isDisplayed();
		//System.out.println(bool1);
// find elemenets:
		
		List <WebElement> links =driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
		
	int total_links=links.size();
	System.out.println(total_links);
			
		for(WebElement ele:links)
		{
			System.out.println(ele.getAttribute("href"));
			}
			
			
		}		
	
		
		
		//div[@class="footer-upper"]//a
		
	}


