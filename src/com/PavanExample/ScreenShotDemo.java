package com.PavanExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		//1. ScreenShot code [fullpage]
		TakesScreenshot ts=(TakesScreenshot) driver;
		         File src =ts.getScreenshotAs(OutputType.FILE); // take screenshot and move into some file 
		         File trg=new File("C:\\Users\\profas\\eclipse-workspace\\Salenium_Project\\src\\screenshot\\page1.png");
		         FileUtils.copyFile(src, trg);
		         
		         
		//2. portion(section) of the page  
		         
		 WebElement section= driver.findElement(By.xpath("//img[@src='assets/Files/home-page/Talent-Management.jpg']"));
		 
		           File src1 =section.getScreenshotAs(OutputType.FILE);
		           File trg1=new File("C:\\Users\\profas\\eclipse-workspace\\Salenium_Project\\src\\screenshot\\sec1.png");
		           FileUtils.copyFile(src1, trg1);
		           
		           
		           
		  //3. Specific element(logo) of  the page  
			         
		  		 WebElement logoele= driver.findElement(By.xpath("//img[@alt='OrangeHRM Inc Logo']"));
		  		 
		  		           File src2 =logoele.getScreenshotAs(OutputType.FILE);
		  		           File trg2=new File("C:\\Users\\profas\\eclipse-workspace\\Salenium_Project\\src\\screenshot\\logo1.png");
		  		           FileUtils.copyFile(src2, trg2);
		         
	}

}
