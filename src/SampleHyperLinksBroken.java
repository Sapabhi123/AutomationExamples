import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleHyperLinksBroken {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
// http://www.deadlinkcity.com/

	System.setProperty("webdriver.chrome.driver","C:\\Users\\profas\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

// Open google.com in Chrome Browser
driver.get("http://www.deadlinkcity.com/"); // www.facebook.com use to check broken links 
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Send keys and Clear Command
List<WebElement> links = driver.findElements(By.tagName("a"));


// Print number of links and the count of links
System.out.println("No of links are " + links.size());
String url = null;
// checking the links fetched
for (int i = 0; i < links.size(); i++) {
WebElement E1 = links.get(i);
url = E1.getAttribute("href");
verifyBrokenLinks(url);
}
// Close the browser
driver.close();
}

public static void verifyBrokenLinks(String linkUrl) {
try {
URL url = new URL(linkUrl);

// Now we will be creating URL Connection & Getting the response code
HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

// Wait before creating a connection as the URL may take time to load.
// We have set the Connection timeout of 5 seconds.
httpURLConnect.setConnectTimeout(5000);

// Creation of connection
httpURLConnect.connect();


// Check the HTTP status of each using HttpURLConnection class in Java.
if (httpURLConnect.getResponseCode() >= 400) {
System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " : is a broken link");
}

// Fetching and Printing the response code obtained
// We will fetch the response code and print OK if the URL works fine. Else will
// give an error.
else {
System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
}
} catch (Exception e) {
}
}
}