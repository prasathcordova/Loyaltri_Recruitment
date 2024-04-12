package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CompanyPO;
import pageObjects.LoginPO;

public class LoginTC {
	WebDriver driver = new ChromeDriver();
	
@BeforeTest	
public void login() throws InterruptedException {
	
		driver.get("https://alpha.loyaltri.com/");
		
		driver.manage().window().maximize();
	
		PageFactory.initElements(driver,LoginPO.class);
		PageFactory.initElements(driver,CompanyPO.class);
	
		LoginPO.Email.sendKeys("admin");
	
		LoginPO.Password.sendKeys("123abcAB");

		LoginPO.Sign_In.click();
		
		
		
	
	
	}
	

}
