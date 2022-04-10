package com.PavanExample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement ele:links) {
			
			String url=ele.getAttribute("href");
			
			URL link=new URL(url);
			
			HttpURLConnection httpcon=(HttpURLConnection) link.openConnection();
			
			httpcon.connect();
			if(httpcon.getResponseCode()>=400) {
				System.out.println(httpcon.getResponseCode()+"is a"+"Broken Link:");
				
				
			}
			
			
		}
				
				


	}

}
