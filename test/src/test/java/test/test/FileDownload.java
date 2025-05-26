package test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class FileDownload {
    public static void main(String[] args) {
        // Set download directory path
        String downloadFilePath = System.getProperty("user.dir") + "\\downloads";

        // Configure ChromeOptions
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadFilePath);
        prefs.put("download.prompt_for_download", false);  // Disable download prompt
        prefs.put("profile.default_content_settings.popups", 0);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://example.com/download-page");

        // Click on the download button
        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        WebElement Web=driver.findElement(By.tagName("a"));
        driver.switchTo().newWindow(WindowType.TAB);
        
       driver.findElement(with(By.tagName("a")).toRightOf(Web));
        downloadButton.click();

        // Wait for the file to download (use explicit wait if needed)
        driver.quit();
    }
}
