package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(id="naveen")
	private WebElement name;
	
	@FindBy(id="naveen")
	private WebElement lastname;
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
