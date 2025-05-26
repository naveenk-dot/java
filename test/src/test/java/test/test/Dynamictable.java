package test.test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		List <WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']//tr"));
		
		for (WebElement str: rows)
		{
			if (str.getText().equals("Chrome"))
			{
				String CPU= driver.findElement(By.xpath("//td[normalize-space( )='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
			}
		}
			
		
		
	}

}
