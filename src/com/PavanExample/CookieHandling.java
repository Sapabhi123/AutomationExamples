package com.PavanExample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Set<Cookie> ck =driver.manage().getCookies();
		 
		System.out.println(ck.size());
	Iterator<Cookie> it	=ck.iterator();
       while(it.hasNext()) {
    	   
    	   System.out.println(it.next().getName());  
    	   System.out.println(it.next().getValue());
       }
       
       //add cookie
       Cookie ck1=new Cookie("abhi1","143");
       driver.manage().addCookie(ck1);
       
       Iterator<Cookie> it1	=ck1.iterator();
       while(it.hasNext()) {
    	   
    	   System.out.println(it.next().getName());  
    	   System.out.println(it.next().getValue());
       }
       
		
	}

}
