package testCases;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.JobsPO;
import pageObjects.settingsPO;

public class settingsTC extends LoginTC{
	
	@Test
	public void companyModule () throws Exception {
	
		
			FileInputStream file = new FileInputStream("config.properties");
			Properties properties = new Properties();
			properties.load(file);
		
		PageFactory.initElements(driver,settingsPO.class);
		PageFactory.initElements(driver,JobsPO.class);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(settingsPO.settings).build().perform();
		
//		JobsPO.jobs.click();
		
		settingsPO.templates.click();
		
		settingsPO.Institution_dd.click();
		
		settingsPO.Docme_institution.click();
		
//		JobsPO.View_career_page.click();
//		
//		Set<String> windows = driver.getWindowHandles();
//		
//		for (String string : windows) {
//			
//			driver.switchTo().window(string);
//		}
//		
//		
//		
//		JobsPO.WebDev_job.click();
//		
//		JobsPO.Apply.click();
//		
//		driver.close();
		
		settingsPO.job_description.click();
		
		settingsPO.create_description.click();
		
		settingsPO.job_des_template_name.sendKeys(properties.getProperty("JobDesc_templateName"));
		
		settingsPO.jobDesc_description.sendKeys(properties.getProperty("Job_description"));
		
		settingsPO.save_template.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.navigate().refresh();
		
		settingsPO.workflow.click();
		
		settingsPO.create_workflow.click();
		
		settingsPO.workflow_name.sendKeys(properties.getProperty("Workflow_Name"));
		
		settingsPO.workflow_description.sendKeys(properties.getProperty("Workflow_description"));
		
		settingsPO.add_stage.click();
		
		settingsPO.stage_name.sendKeys(properties.getProperty("Stage1"));
		
		settingsPO.Ok_button.click();
		
		settingsPO.add_stage.click();
		
		settingsPO.stage_name.clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		settingsPO.stage_name.sendKeys(properties.getProperty("Stage2"));
		
		settingsPO.Ok_button.click();
		
		settingsPO.add_stage.click();
		
		settingsPO.stage_name.clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		settingsPO.stage_name.sendKeys(properties.getProperty("Stage3"));
		
		settingsPO.Ok_button.click();
		
		settingsPO.save_template.click();
		
		driver.navigate().refresh();
		
		settingsPO.email.click();
		
		settingsPO.create_email.click();
		
		settingsPO.template_name.sendKeys(properties.getProperty("EmailTemplate"));
		
		settingsPO.email_subject_name.sendKeys(properties.getProperty("EmailSubject"));
		
		settingsPO.email_desc.sendKeys(properties.getProperty("EmailDescription"));
		
		settingsPO.save_template.click();
		
		driver.navigate().refresh();
		
		settingsPO.evaluation.click();
		
		settingsPO.create_evaluation.click();
		
		settingsPO.evaluation_template_name.sendKeys(properties.getProperty("EvaluationTemplate"));
		
		settingsPO.description.sendKeys(properties.getProperty("EvaluationDescription"));
		
		settingsPO.question1.sendKeys(properties.getProperty("Question"));
		
		settingsPO.answer_dd.click();
		
		settingsPO.short_ans.click();
		
		settingsPO.save_template.click();
		
		driver.navigate().refresh();
		
		settingsPO.questionnaire.click();
		
		settingsPO.create_questionnaire.click();
		
		settingsPO.questionnaire_template_name.sendKeys(properties.getProperty("QuestionnaireTemplate"));
		
		settingsPO.description.sendKeys(properties.getProperty("QuestionnaireDescription"));
		
//		settingsPO.add_question.click();
		
		settingsPO.qesttion1_questionnaire.sendKeys(properties.getProperty("Question"));
		
		settingsPO.answer_dd.click();
		
		settingsPO.short_ans.click();
		
		settingsPO.save_template.click();
		
		driver.navigate().refresh();
		
		settingsPO.letter.click();
		
		settingsPO.create_letter.click();
		
		settingsPO.letter_template_name.sendKeys(properties.getProperty("LetterTemplate"));
		
		settingsPO.letter_template_subject.sendKeys(properties.getProperty("LetterSubject"));
		
		settingsPO.letter_desc.sendKeys(properties.getProperty("LetterDescription"));
		
		settingsPO.save_template.click();
		
		driver.navigate().refresh();
		
		settingsPO.job_templates.click();
		
		settingsPO.create_job_temp.click();
		
		settingsPO.job_title.sendKeys(properties.getProperty("JobTitle"));
		
		settingsPO.department.click();
		
		settingsPO.department_select.click();
		
		settingsPO.job_code.sendKeys(properties.getProperty("JobCode"));
		
		settingsPO.location.sendKeys(properties.getProperty("Location"));
		
		settingsPO.requirement.click();
		
		settingsPO.requirement_select.click();
		
		settingsPO.job_type.click();
		
		settingsPO.job_type_select.click();
		
		settingsPO.experience.click();
		
		settingsPO.experience_select.click();
		
		settingsPO.education.click();
		
		settingsPO.education_select.click();
		
		settingsPO.keywords.sendKeys(properties.getProperty("KeyWords"));
		
		settingsPO.salary_from.sendKeys(properties.getProperty("SalaryFrom"));
		
		settingsPO.salary_to.sendKeys(properties.getProperty("SalaryTo"));
		
		settingsPO.salary_currency.click();
		
		settingsPO.salary_currency_AED.click();
		
		settingsPO.view_public.click();
		
		settingsPO.job_Template_description.sendKeys(properties.getProperty("Job_description"));
		
		settingsPO.Save_Continue.click();
		
		settingsPO.phone_optional.click();
		
		settingsPO.country_optional.click();
		
		settingsPO.job_template_question1.sendKeys(properties.getProperty("Question"));
		
		settingsPO.answer_dd.click();
		
		settingsPO.select_answer.click();
		
		settingsPO.Save_Continue.click();
		
		settingsPO.workflow_select.click();
		
		settingsPO.Save_Continue.click();
		
		Thread.sleep(2000);
		
		JobsPO.jobs.click();
		
		JobsPO.create_job.click();
		
		JobsPO.template_list.click();
		
		    for (int i = 0; i < JobsPO.Jobtemplates.size(); i++) {
		    	
		        if (JobsPO.Jobtemplates.get(i).getText().equalsIgnoreCase(properties.getProperty("JobTitle"))) {
		        	
		        	JobsPO.Jobtemplates.get(i).click();
		        	
		            break;
		        }
		    }
		    
		    JobsPO.evaluation_template_list.click();
		    
		    for (int i = 0; i < JobsPO.evaluationtemplates.size(); i++) {
		    	
		        if (JobsPO.evaluationtemplates.get(i).getText().equalsIgnoreCase(properties.getProperty("EvaluationTemplate"))) {
		        	
		        	JobsPO.evaluationtemplates.get(i).click();
		        	
		            break;
		        }
		    }
		    
		    JobsPO.questionnaire_template_list.click();
		    
		    for (int i = 0; i < JobsPO.Questionnairetemplates.size(); i++) {
		    	
		        if (JobsPO.Questionnairetemplates.get(i).getText().equalsIgnoreCase(properties.getProperty("QuestionnaireTemplate"))) {
		        	
		        	JobsPO.Questionnairetemplates.get(i).click();
		        	
		            break;
		        }
		    }
		
		    JobsPO.no_of_openings.sendKeys(properties.getProperty("NumberOfOPenings"));
		    
		    settingsPO.Save_Continue.click();
		    
		    settingsPO.Save_Continue.click();
		    
		    settingsPO.Save_Continue.click();
		    
		    Thread.sleep(2000);
		    
//		    JobsPO.team_member_1.click();
//		    
//		    JobsPO.team_member_2.click();
		    
		    settingsPO.Save_Continue.click();
		    
		    Thread.sleep(2000);
		

		driver.close();
	}

}
