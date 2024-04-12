package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPO {

	@FindBy (xpath = "//*[text()='Settings']")
	public static WebElement settings;
	
	
	//All Employees
	@FindBy (linkText = "Masters")
	public static WebElement Masters;
	
	@FindBy (xpath = "//button//p[text()='State']")
	public static WebElement Select_State;
	
	
	@FindBy (xpath = "//table//tbody//tr")
	public static List<WebElement> table;
	
	
	@FindBy (xpath = "//button[@role='switch']")
	public static WebElement Status_switch;
	
	@FindBy (xpath = "//input[@placeholder='Search']")
	public static WebElement Search;
	
	@FindBy (xpath = "//input[@placeholder='Phone number']")
	public static WebElement Phone_number;
	
	@FindBy (xpath = "//input[@placeholder='Select date']")
	public static WebElement Select_Date;
	
	@FindBy (xpath = "//*[text()='Male']")
	public static WebElement Gender;
	
	@FindBy (xpath = "//*[text()='Blood Group']/following::span[2]")
	public static WebElement Blood_Group_DD;
	
	@FindBy (xpath = "//div[@title='AB+']")
	public static WebElement Blood_Group;
	
	@FindBy (xpath = "//*[text()='Religion']/following::span[2]")
	public static WebElement Religion_DD;
	
	@FindBy (xpath = "//div[text()='Christian']")
	public static WebElement Religion;
	
	@FindBy (xpath = "//*[text()='Save & Continue']")
	public static WebElement Save;
	
	
	

}
