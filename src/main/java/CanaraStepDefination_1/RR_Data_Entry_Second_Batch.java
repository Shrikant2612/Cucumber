package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class RR_Data_Entry_Second_Batch extends WebElementObjectRepositoryForCucumber {
	
	@Given("^when i navigate to second batch$")
	public void when_i_navigate_to_second_batch() throws Throwable {
	   Thread.sleep(3000);
	}
	
	@When("^I enter the valid chequeno for second batch \"(.*?)\" and valid citycode for second batch \"(.*?)\"$")
	public void i_enter_the_valid_chequeno_for_second_batch_and_valid_citycode_for_second_batch(String chequeno, String citycode) throws Throwable {
	    Thread.sleep(3000);
		PageFactory.initElements(OpenBrowser.driver,RR_Data_Entry_Second_Batch.class);
		Thread.sleep(30000);
		canarachequeno.clear();
		canarachequeno.sendKeys(chequeno);
		Thread.sleep(3000);
		canaracitycode.clear();
		canaracitycode.sendKeys(citycode);
		Thread.sleep(3000);
		
	}


	@When("^valid bank code for second batch \"(.*?)\" and valid branch code for second batch  \"(.*?)\" and$")
	public void valid_bank_code_for_second_batch_and_valid_branch_code_for_second_batch_and(String bankcode, String branchcode) throws Throwable {
	  
		PageFactory.initElements(OpenBrowser.driver,RR_Data_Entry_Second_Batch.class);
		Thread.sleep(6000);
		canarabankcode.clear();
		canarabankcode.sendKeys(bankcode);
		Thread.sleep(3000);
		canarabranchcode.clear();
		canarabranchcode.sendKeys(branchcode);
		Thread.sleep(3000);
	}

	@When("^valid base no for second batch \"(.*?)\" and valid tc for second batch \"(.*?)\" and$")
	public void valid_base_no_for_second_batch_and_valid_tc_for_second_batch_and(String baseno, String tc) throws Throwable {
	 
		PageFactory.initElements(OpenBrowser.driver,RR_Data_Entry_Second_Batch.class);
		Thread.sleep(3000);
		canarabaseno.clear();
		canarabaseno.sendKeys(baseno);
		Thread.sleep(3000);
		canaratccode.clear();
		canaratccode.sendKeys(tc);
		Thread.sleep(3000);
	}

	
	@When("^valid amount for second batch  \"(.*?)\" and after click on save button$")
	public void valid_amount_for_second_batch_and_after_click_on_save_button(String amount) throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,RR_Data_Entry_Second_Batch.class);
		Thread.sleep(6000);
	  canaraamountforcheque.clear();
	  canaraamountforcheque.sendKeys(amount);
		Thread.sleep(3000);
	   
	}

	@Then("^i should  able to save the records for second batch$")
	public void i_should_able_to_save_the_records_for_second_batch() throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,RR_Data_Entry_Second_Batch.class);
		Thread.sleep(6000);
		savebutton.click();
		Thread.sleep(5000);
		
	   
	}
	
	@Given("^when i navigate to second batch last record$")
	public void when_i_navigate_to_second_batch_last_record() throws Throwable {
		
		
	   
	}

	@When("^I enter the valid chequeno for second batch last record  \"(.*?)\" and valid citycode for second batch last record \"(.*?)\"$")
	public void i_enter_the_valid_chequeno_for_second_batch_last_record_and_valid_citycode_for_second_batch_last_record(String chequeno, String citycode) throws Throwable {
	   
		 Thread.sleep(3000);
			PageFactory.initElements(OpenBrowser.driver,RR_Data_Entry_Second_Batch.class);
			Thread.sleep(6000);
			canarachequeno.clear();
			canarachequeno.sendKeys(chequeno);
			Thread.sleep(3000);
			canaracitycode.clear();
			canaracitycode.sendKeys(citycode);
			Thread.sleep(3000);	
		
		
	}

	@When("^valid bank code for second batch last record \"(.*?)\" and valid branch code for second batch last record \"(.*?)\" and$")
	public void valid_bank_code_for_second_batch_last_record_and_valid_branch_code_for_second_batch_last_record_and(String bankcode, String branchcode) throws Throwable {
		
		
		PageFactory.initElements(OpenBrowser.driver,RR_Data_Entry_Second_Batch.class);
		Thread.sleep(6000);
		canarabankcode.clear();
		canarabankcode.sendKeys(bankcode);
		Thread.sleep(3000);
		canarabranchcode.clear();
		canarabranchcode.sendKeys(branchcode);
		Thread.sleep(3000);
	    
	}

	@When("^valid base no for second batch last record \"(.*?)\" and valid tc for second batch last record \"(.*?)\" and$")
	public void valid_base_no_for_second_batch_last_record_and_valid_tc_for_second_batch_last_record_and(String baseno, String tc) throws Throwable {
	  
		
		PageFactory.initElements(OpenBrowser.driver,RR_Data_Entry_Second_Batch.class);
		Thread.sleep(3000);
		canarabaseno.clear();
		canarabaseno.sendKeys(baseno);
		Thread.sleep(3000);
		canaratccode.clear();
		canaratccode.sendKeys(tc);
		Thread.sleep(3000);
	}

	@When("^valid amount for for second batch last record  \"(.*?)\" and after click on save button$")
	public void valid_amount_for_for_second_batch_last_record_and_after_click_on_save_button(String amount) throws Throwable {
	 
		
		PageFactory.initElements(OpenBrowser.driver,RR_Data_Entry_Second_Batch.class);
		Thread.sleep(6000);
	  canaraamountforcheque.clear();
	  canaraamountforcheque.sendKeys(amount);
		Thread.sleep(3000);
	}

	@Then("^i should  able to save the last  records for second batch$")
	public void i_should_able_to_save_the_last_records_for_second_batch() throws Throwable {
		
		Thread.sleep(3000);
		savebutton.click();
		Thread.sleep(3000);
		
		submitbatch.click();
		Thread.sleep(3000);
		
	   
	}

	
	
	

}
