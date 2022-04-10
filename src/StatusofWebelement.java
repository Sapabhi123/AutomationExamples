import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofWebelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
	  // isDisplayed()  isEnabled() 
		
		// inspect the webpage ele and right click copy the xpath
		 WebElement Searchstore=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	
		 System.out.println(Searchstore.isDisplayed()); // true
		 System.out.println(Searchstore.isEnabled()); // true
		 System.out.println(Searchstore.isSelected()); // true
		 
		 //isSelected() is mainly used for radio buttons check boxes
		 
	WebElement male=driver.findElement(By.id("gender-male"));
		 System.out.println(male.isSelected());
		 WebElement  female=driver.findElement(By.id("gender-female"));
		 System.out.println(female.isSelected());
		 
		 male.click(); // selects male the radio button
		 System.out.println(male.isSelected());
			 
		 female.click(); // // selects female the radio button
		 System.out.println(female.isSelected());
		
		 
		
		
		
		
		
		
		
		
	}

}
