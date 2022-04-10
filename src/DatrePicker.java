import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatrePicker {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Timeout Applicable for all the elements
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("https://www.redbus.in/");
  // locate date picker on redbus website
  driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
  String month="Feb";
  String year="2022";
  String day="5";
  
  // extract the month and year(my)
  
  while(true) {
	  
	  String my=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	  
	  String arr[]=my.split(" ");
	  String mnt=arr[0];
	  String yr=arr[1];
	  if(month.equalsIgnoreCase(mnt) && year.equals(yr)) // my choice is equlas to located elements
		  break;
	  else
		  driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
	  }
  
  //Date selection from Date table
 List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr//td"));
  
  for(WebElement ele: alldates) { // iterate over webelements [all the dates from date table]
	  
	String dt=ele.getText(); // explcit type cast
	  
	  if(dt.equals(day)) {
		  ele.click();
		  break;
	  }
		 
	  
	  
  }
		  
//from place passing
 WebElement from=driver.findElement(By.xpath("//input[@id='src']"));
 from.click();
 from.sendKeys("Belagavi");
 
 // to place passing
 
 WebElement to=driver.findElement(By.xpath("//input[@id='dest']"));
 to.click();
 to.sendKeys("Madiwala, Bangalore");
 WebElement search=driver.findElement(By.id("search_btn"));
 search.click();
 
 driver.close();
	}}


