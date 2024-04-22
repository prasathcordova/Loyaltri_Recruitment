package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobsPO {
	
	@FindBy (xpath = "//p[text()='Jobs']")
	public static WebElement jobs;
	
	@FindBy (xpath = "//span[text()='View career page']")
	public static WebElement View_career_page;
	
	@FindBy (xpath = "//h1[text()='Jobs']//following::h1[text()='Web Developer'][1]")
	public static WebElement WebDev_job;
	
	@FindBy (xpath = "//span[text()='Apply']")
	public static WebElement Apply;

	@FindBy (xpath = "//span[text()='Create a Job']")
	public static WebElement create_job;
	
	@FindBy (xpath = "//label[text()='Choose Template']//following::span[2]")
	public static WebElement template_list;
	
	@FindBy (xpath = "//div[@class='rc-virtual-list']//div//div//div//div//div")
	public static List<WebElement> Jobtemplates;
	
	@FindBy (xpath = "//label[text()='Choose Evaluation Template']//following::span[2]")
	public static WebElement evaluation_template_list;
	
	@FindBy (xpath = "//*[text()='Choose Evaluation Template']//following::div[@class='rc-virtual-list'][2]//div//div//div//div")
	public static List<WebElement> evaluationtemplates;
	
	@FindBy (xpath = "//label[text()='Choose Questionnaire Template']//following::span[2]")
	public static WebElement questionnaire_template_list;
	
	@FindBy (xpath = "//*[text()='Choose Questionnaire Template']//following::div[@class='rc-virtual-list'][3]//div//div//div//div")
	public static List<WebElement> Questionnairetemplates;
	
	@FindBy (xpath = "//p[text()='Number of Opennings']//following::input[1]")
	public static WebElement no_of_openings;
	
	@FindBy (xpath = "//h1[text()='TeamMembers']//following::input[@class='ant-checkbox-input'][1]")
	public static WebElement team_member_1;
	
	@FindBy (xpath = "//h1[text()='TeamMembers']//following::input[@class='ant-checkbox-input'][2]")
	public static WebElement team_member_2;
	
	@FindBy (id = "comments-0")
	public static WebElement publish_naukri;
	
	@FindBy (id = "comments-1")
	public static WebElement publish_bayt;
	
	
	
	
	
	

}
