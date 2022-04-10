import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SecondChromeclass
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
// browser type and chromedrover.exe path as parameters

    String url = " https://www.flipkart.com";
    driver.get(url); 

}}