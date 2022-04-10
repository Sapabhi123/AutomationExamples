
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver","D:\\SAL_DRIVER\\Firefox\\geckodriver.exe"); //Change the path here accordingly

WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
String appTitle=driver.getTitle();
String expTitle="Google";
if (appTitle.equals (expTitle)){
    System.out.println("Verification Successful");
}
else{
       System.out.println("Verification Failed");
}
String url=driver.getCurrentUrl();
System.out.println(url);
String tittle=driver.getTitle();
System.out.println(tittle);
Navigation page=(Navigation) driver.switchTo();
System.out.println(page);
  driver.close();
 System.exit(0); 
}}