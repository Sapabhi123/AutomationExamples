import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.flipkart.com/"); // open flipkart
				driver.navigate().to("\"https://www.flipkart.com/\"");
				driver.get("https://www.amazon.com/");   // override above page and open amazon page
				driver.navigate().back(); // return from amazon to flipakart page
				driver.navigate().forward(); // return from flip kart page  to amazon page
				driver.navigate().refresh();// it refreshes the current page 
 
	}

}
