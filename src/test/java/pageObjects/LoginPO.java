package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO {
	
	@FindBy (id = "floating_filled_email")
	public static WebElement Email;
	
	@FindBy (id = "floating_filled_password")
	public static WebElement Password;
	
	@FindBy (xpath = "//*[text()='Sign In']")
	public static WebElement Sign_In;

}
