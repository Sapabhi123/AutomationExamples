import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDynamicWebTable2 {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;
static int rows, columns, i, j;
static String value;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("https://the-internet.herokuapp.com/tables");
driver.manage().window().maximize();

// Timeout Applicable for all the elements
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Simple Web Table Handling
// columns = driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th")).size();


System.out.println("No of columns : " + columns);

// rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr/td[1]")).size();
rows = driver.findElements(By.xpath("//*[@id='table1']//tr//td[1]")).size();

System.out.println("No of rows : " + rows);

// driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr/td[1]"));

// Retrieve first row and second coloumn value
System.out.println("Retrieve first row and second coloumn value : ");
System.out.print(driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[1]/td[2]")).getText());
System.out.println();

// Retrieving the headers of table
for (int i = 1; i <= columns; i++) {
// Printing the header value
System.out.print(
driver.findElement(By.xpath("//table[@id='table1']//tr//th[" + i + "]")).getText() + " ");
}

System.out.println();
System.out.println();

// *[@id='table1']/tbody/tr[1]/td[2]
// To retrieve the values of table
for (i = 1; i <= rows; i++) {
for (j = 1; j <= columns; j++) {
value =


value = driver.findElement(By.xpath("//*[@id='table1']//tr[" + i + "]//td[" + j + "]")).getText();
System.out.print(value + " ");
}

j--;
Thread.sleep(2000);
// Clicking on Edit option
driver.findElement(By.xpath("//*[@id='table1']//tr[" + i + "]//td[" + j + "]" + "/../td[6]/a[1]")).click();
Thread.sleep(2000);

// Clicking on Delete option
driver.findElement(By.xpath("//*[@id='table1']//tr[" + i + "]/td[" + j + "]" + "/../td[6]/a[2]")).click();
Thread.sleep(2000);
System.out.println();
}
// Close the browser
driver.close();
}
}

