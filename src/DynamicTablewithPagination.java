import java.awt.image.PixelInterleavedSampleModel;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablewithPagination {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
				// Timeout Applicable for all the elements
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.opencart.com/admin/index.php");
        //Login
        WebElement username= driver.findElement(By.id("input-username"));
        username.clear();
        username.sendKeys("demo");
        
        WebElement password= driver.findElement(By.id("input-password"));
        password.clear();
        password.sendKeys("demo");
        driver.findElement(By.xpath("//button[@type='submit']")).click();  
        // click on sales ---order
        driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click(); 
        driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();  
        //Table
        //1. find total no of pages
        driver.findElement(By.xpath("//a[normalize-space()='>|']")).click(); 
        String page =driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div[2]")).getText();
        System.out.println(page);
       // page.substring(page.indexOf('(')+1, page.indexOf("Pages")-1);
         int total_pages=Integer.valueOf(page.substring(page.indexOf('(')+1, page.indexOf("Pages")-1));
         System.out.println("Total no_of pages:  "+total_pages);
       // return the active pages
          for(int p=1;p<=total_pages;p++) {
        	  
        	  WebElement active_pages=driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
        	  System.out.println("active_page is: "+active_pages.getText());
        	  active_pages.click();
        	Dimension rows= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).getSize();
        	 System.out.println("Dimension is: "+rows);
        	String pageno=Integer.toString(p);
        	 driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()=' "+pageno+" ')]")).click();
        	//ul[@class='pagination']//li//a[text()=' "+pageno+" '))
        	 
         }
        

	}

}
