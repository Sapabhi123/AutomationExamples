import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\c99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/"); 
				
		WebElement text1=driver.findElement(By.id("inputText1")); //1st text area
		
		WebElement text2=driver.findElement(By.id("inputText2")); //2nd text area
		Actions act=new Actions(driver);
		
		text1.sendKeys("Welcome Abhi adda");
		// Ctrl+a select all
		
		act.keyDown(Keys.CONTROL); //pressed ctrl
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);// release ctrl
		act.perform();          // perform the action
		
		//Ctrl+c copy all
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// use tab to shift the text2 window
		
		     act.sendKeys(Keys.TAB); // jump into text2 area
		     act.perform();
		     
		  //Ctrl+v paste 
		     
		    act.keyDown(Keys.CONTROL);
			act.sendKeys("v");
			act.keyUp(Keys.CONTROL);
			act.perform();
		// compare the text
			
			if(text1.getAttribute("value").equals(text2.getAttribute("value"))) 
								System.out.println("text copied!!!");
			else 
				                System.out.println("Text not copied");
		

	}

}
