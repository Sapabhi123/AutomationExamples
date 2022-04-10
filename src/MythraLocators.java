import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MythraLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\profas\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		// id locators		
      //	WebElement  web=driver.findElement(By.id("search_query_top"));
//      	web.sendKeys("T-shirts");
//      
//      	driver.findElement(By.name("submit_search")).click();
//      	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/h5[1]/a[1]")).click();
//     //class name 	
     int a=driver.findElements(By.className("homeslider-container")).size(); // locate slider and returns how many images are there in slider
		System.out.println(a);
		
		//tagname
		int no_tags=driver.findElements(By.tagName("a")).size();
		System.out.println(no_tags);
		
		
		
		driver.close();
		
		
		
		

	}

}
