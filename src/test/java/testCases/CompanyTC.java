package testCases;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.CompanyPO;

public class CompanyTC extends LoginTC{
	

	
	@Test
	public void companyModule () throws Exception {
	
		
			FileInputStream file = new FileInputStream("config.properties");
			Properties properties = new Properties();
			properties.load(file);
		
		PageFactory.initElements(driver,CompanyPO.class);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(CompanyPO.settings).build().perform();
		
		CompanyPO.Masters.isDisplayed();
		
		CompanyPO.Select_State.click();
		
		String state_Name = "Harper";
		
//		CompanyPO.Search.sendKeys(state_Name);
		
		Thread.sleep(2000);
		
		WebElement stateName = driver.findElement(By.xpath("//tr[1]//td[1]"));
		
		if (stateName.getText().equals("Harper")) {
			
			System.out.println("Name Matched");
		}
		else {
			System.out.println("Name Missmatched");
		}
		
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
