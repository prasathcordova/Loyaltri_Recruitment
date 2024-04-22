package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class settingsPO {

	@FindBy (xpath = "//*[text()='Settings']")
	public static WebElement settings;
	
	@FindBy (xpath = "//h1//span[text()='Recruitment']//following::button//h1")
	public static WebElement Institution_dd;
	
	@FindBy (xpath = "//p[text()='Docme']")
	public static WebElement Docme_institution;
	
	@FindBy (linkText = "Templates")
	public static WebElement templates;
	
	@FindBy (xpath = "//span[text()='Job Templates']")
	public static WebElement job_templates;
	
	@FindBy (xpath = "//span[text()='Job Description']")
	public static WebElement job_description;
	
	@FindBy (xpath = "//span[text()='Create Job Description Template']")
	public static WebElement create_description;
	
	@FindBy (xpath = "//p[text()='Job Description']//following::input[16]")
	public static WebElement job_des_template_name;
	
	@FindBy (xpath = "//p[text()='Template Name']//following::input[1]")
	public static WebElement template_name;
		
	@FindBy (xpath = "//*[text()='Create a Job Description Template']//following::div[@role='textbox']")
	public static WebElement jobDesc_description;
	
	@FindBy (xpath = "//span[text()='Workflow']//parent::button")
	public static WebElement workflow;
	
	@FindBy (xpath = "//span[text()='Create Workflow Template']")
	public static WebElement create_workflow;
	
	@FindBy (xpath = "//input[@placeholder='Type here...']")
	public static WebElement workflow_name;
	
	@FindBy (xpath = "//textarea[@placeholder='Type here...']")
	public static WebElement workflow_description;
	
	@FindBy (xpath = "//p[text()='Add Stage']")
	public static WebElement add_stage;
	
	@FindBy (xpath = "//p[text()='Add Stages']//following::input[@placeholder='Type here...']")
	public static WebElement stage_name;
	
	@FindBy (xpath = "//button//span[text()='OK']")
	public static WebElement Ok_button;
	
	@FindBy (xpath = "//span[text()='Save Template']")
	public static WebElement save_template;
	
	@FindBy (xpath = "//span[text()='Email']//parent::button")
	public static WebElement email;
	
	@FindBy (xpath = "//span[text()='Create Email Template']")
	public static WebElement create_email;
	
	@FindBy (xpath = "//p[text()='Template Name']//following::input[2]")
	public static WebElement email_subject_name;
	
	@FindBy (xpath = "//*[text()='Subject']//following::div[@role='textbox']")
	public static WebElement email_desc;
	
	@FindBy (xpath = "//span[text()='Evaluation']//parent::button")
	public static WebElement evaluation;
	
	@FindBy (xpath = "//span[text()='Create Evaluation Template']")
	public static WebElement create_evaluation;
	
	@FindBy (xpath = "//p[text()='Template Name']//following::input[@placeholder='Type here...']")
	public static WebElement evaluation_template_name;
	
	@FindBy (xpath = "//label[text()='Decription']//following::textarea[1]")
	public static WebElement description;
	
	@FindBy (xpath = "//label[text()='Decription']//following::input[1]")
	public static WebElement question1;
	
	@FindBy (xpath = "//p[text()='Mandatory']//preceding::div[1]")
	public static WebElement answer_dd;
	
	@FindBy (xpath = "//span[text()='Short Answer']")
	public static WebElement short_ans;

	@FindBy (xpath = "//span[text()='Questionnaire']//parent::button")
	public static WebElement questionnaire;
	
	@FindBy (xpath = "//span[text()='Create Questionnaire Template']")
	public static WebElement create_questionnaire;
	
	@FindBy (xpath = "//p[text()='Template Name']//following::input[@placeholder='Type here...']")
	public static WebElement questionnaire_template_name;
	
	@FindBy (xpath = "//p[text()='Add New Question']")
	public static WebElement add_question;
	
	@FindBy (xpath = "//p[text()='Question 1']//following::input[1]")
	public static WebElement qesttion1_questionnaire;
//	
//	@FindBy (xpath = "//span[text()='MultipleChoice']")
//	public static WebElement ans_questionnaire;
	
	@FindBy (xpath = "//span[text()='Letter']//parent::button")
	public static WebElement letter;
	
	@FindBy (xpath = "//span[text()='Create Letter Template']")
	public static WebElement create_letter;
	
	@FindBy (xpath = "//p[text()='Letter Template Name']//following::input[@placeholder='Enter Letter Template Name']")
	public static WebElement letter_template_name;
	
	@FindBy (xpath = "//p[text()='Letter Template Name']//following::input[@placeholder='Enter Subject']")
	public static WebElement letter_template_subject;

	@FindBy (xpath = "//*[@placeholder='Enter Subject']//following::div[@role='textbox']")
	public static WebElement letter_desc;
	
	
	//JOB_TEMPLATE PAGE-1
	@FindBy (xpath = "//span[text()='Create Job Template']")
	public static WebElement create_job_temp;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[1]")
	public static WebElement job_title;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[2]")
	public static WebElement department;
	
	@FindBy (xpath = "//*[text()='Hr Department1']")
	public static WebElement department_select;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[3]")
	public static WebElement job_code;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[4]")
	public static WebElement location;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[5]")
	public static WebElement requirement;
	
	@FindBy (xpath = "//*[text()='Mid level']")
	public static WebElement requirement_select;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[6]")
	public static WebElement job_type;
	
	@FindBy (xpath = "//*[@title='Full Time']")
	public static WebElement job_type_select;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[7]")
	public static WebElement experience;
	
	@FindBy (xpath = "//*[@title='Manager Level']")
	public static WebElement experience_select;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[8]")
	public static WebElement education;
	
	@FindBy (xpath = "//*[@title='Post Graduate']")
	public static WebElement education_select;

	@FindBy (xpath = "//*[text()='Job Details']//following::input[9]")
	public static WebElement keywords;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[10]")
	public static WebElement salary_from;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[11]")
	public static WebElement salary_to;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[12]")
	public static WebElement salary_currency;
	
	@FindBy (xpath = "//*[@title='AED']")
	public static WebElement salary_currency_AED;
	
	@FindBy (xpath = "//*[text()='Job Details']//following::input[13]")
	public static WebElement view_public;
	
	@FindBy (xpath = "//p[text()='Description']//following::div[@role='textbox']")
	public static WebElement job_Template_description;
	
	@FindBy (xpath = "//span[text()='Save And Continue']")
	public static WebElement Save_Continue;
	
	//--------------------------------------------------------------------------------------------------------------
	
	//JOB_TEMPLATE PAGE-2
	@FindBy (xpath = "//*[text()='Phone']//following::span[text()='Optional'][1]")
	public static WebElement phone_optional;
	
	@FindBy (xpath = "//*[text()='Country']//following::span[text()='Optional'][1]")
	public static WebElement country_optional;
	
	@FindBy (xpath = "//*[text()='Resume']//following::span[text()='Optional'][1]")
	public static WebElement resume_optional;
	
	@FindBy (xpath = "//h1[text()='Custom Fields ']//following::input[1]")
	public static WebElement job_template_question1;
	
//	@FindBy (xpath = "//span[@title='ShortAnswer']")
//	public static WebElement job_template_answer;
	
	@FindBy (xpath = "//span[text()='Paragraph']")
	public static WebElement select_answer;
	
	@FindBy (xpath = "//h1[text()='Custom Fields ']//following::button[1]")
	public static WebElement mandatory_button;
	
	@FindBy (xpath = "//*[text()='Level 1']//following::input[@type='radio'][1]")
	public static WebElement workflow_select;
	
	
}
