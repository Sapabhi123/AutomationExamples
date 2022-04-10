import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager"); 
		
		Actions act=new Actions(driver);
		//image present inside frame so first switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement srcimg=driver.findElement(By.xpath("//li[1]"));
		
		WebElement target1=driver.findElement(By.xpath("//div[@id='trash']"));
		
		act.dragAndDrop(srcimg, target1).perform();

	}

}

//div[@class='single_tab_div resp-tab-content resp-tab-content-active']