package test.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksFinder {

    public static void main(String[] args) {
        // Setup WebDriver and open the page
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.example.com"); // Replace with your target URL
        
        // Extract all links (anchor tags)
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        // Iterate over each link and check if it's broken
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                checkLinkStatus(url);
            }
        }
        
        // Close the browser
        driver.quit();
    }
    
    // Method to check HTTP response status
    public static void checkLinkStatus(String url) {
        try {
            // Create a URL object and open connection
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            
            // Get the HTTP response code
            int responseCode = httpURLConnection.getResponseCode();
            
            // Check if the response code is a failure (anything other than 200)
            if (responseCode != 200) {
                System.out.println("Broken Link: " + url + " | Response Code: " + responseCode);
            } else {
                System.out.println("Valid Link: " + url);
            }
        } catch (Exception e) {
            System.out.println("Error checking link: " + url);
        }
    }
}
