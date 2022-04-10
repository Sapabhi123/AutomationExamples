import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//1) how many rows in Table
//2) how many columns in Table
//3) fetch specific row/col data
//4) fetch all the data from table
//5)print release date, version of java lang
public class WebTable1 {

	public static void main(String[] args) throws InterruptedException {
		// To launch a Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[6]/a[1]"));
		
		Thread.sleep(10);
		 ele.click();


}}
