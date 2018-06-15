package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidChequeData extends WebElementObjectRepositoryForCucumber {
	
	@Given("^when i navigate to first batch$")
	public void when_i_navigate_to_first_batch() throws Throwable {
	   
	}

	@When("^I enter the valid chequeno \"(.*?)\" and valid citycode \"(.*?)\"$")
	public void i_enter_the_valid_chequeno_and_valid_citycode(String chequeno, String citycode) throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,ValidChequeData.class);
		Thread.sleep(3000);
		canarachequeno.clear();
		canarachequeno.sendKeys(chequeno);
		Thread.sleep(3000);
		canaracitycode.clear();
		canaracitycode.sendKeys(citycode);
		Thread.sleep(3000);
		
	   
	}

	@When("^valid bank code \"(.*?)\" and valid branch code  \"(.*?)\" and$")
	public void valid_bank_code_and_valid_branch_code_and(String bankcode, String branchcode) throws Throwable {
		
		
		PageFactory.initElements(OpenBrowser.driver,ValidChequeData.class);
		Thread.sleep(3000);
		canarabankcode.clear();
		canarabankcode.sendKeys(bankcode);
		Thread.sleep(3000);
		canarabranchcode.clear();
		canarabranchcode.sendKeys(branchcode);
		Thread.sleep(3000);
	   
	}

	@When("^valid base no \"(.*?)\" and valid tc \"(.*?)\" and$")
	public void valid_base_no_and_valid_tc_and(String baseno, String tc) throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,ValidChequeData.class);
		Thread.sleep(3000);
		canarabaseno.clear();
		canarabaseno.sendKeys(baseno);
		Thread.sleep(3000);
		canaratccode.clear();
		canaratccode.sendKeys(tc);
		Thread.sleep(3000);
	   
	}

	@When("^valid amount  \"(.*?)\" and after click on save button$")
	public void valid_amount_and_after_click_on_save_button(String amount) throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,ValidChequeData.class);
		Thread.sleep(3000);
	  canaraamountforcheque.clear();
	  canaraamountforcheque.sendKeys(amount);
		Thread.sleep(3000);
	   
	}

	@Then("^i should  able to save the records$")
	public void i_should_able_to_save_the_records() throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,ValidChequeData.class);
		Thread.sleep(3000);
		savebutton.click();
		Thread.sleep(5000);
		}
	

@Given("^i handle all the remaining cheque$")
public void i_handle_all_the_remaining_cheque() throws Throwable {

}

@When("^I enter the valid chequeno for last cheque \"(.*?)\" and valid citycode for last cheque  \"(.*?)\"$")
public void i_enter_the_valid_chequeno_for_last_cheque_and_valid_citycode_for_last_cheque(String chequeno, String citycode) throws Throwable {
 
	PageFactory.initElements(OpenBrowser.driver,ValidChequeData.class);
	Thread.sleep(3000);
	canarachequeno.clear();
	canarachequeno.sendKeys(chequeno);
	Thread.sleep(3000);
	canaracitycode.clear();
	canaracitycode.sendKeys(citycode);
	Thread.sleep(3000);
	
}

@When("^valid bank code for last cheque \"(.*?)\" and valid branch code for last cheque  \"(.*?)\" and$")
public void valid_bank_code_for_last_cheque_and_valid_branch_code_for_last_cheque_and(String bankcode, String branchcode) throws Throwable {
 
	PageFactory.initElements(OpenBrowser.driver,ValidChequeData.class);
	Thread.sleep(3000);
	canarabankcode.clear();
	canarabankcode.sendKeys(bankcode);
	Thread.sleep(3000);
	canarabranchcode.clear();
	canarabranchcode.sendKeys(branchcode);
	Thread.sleep(3000);
}

@When("^valid base no for last cheque \"(.*?)\" and valid tc for last cheque \"(.*?)\" and$")
public void valid_base_no_for_last_cheque_and_valid_tc_for_last_cheque_and(String baseno, String tc) throws Throwable {
 
	
	PageFactory.initElements(OpenBrowser.driver,ValidChequeData.class);
	Thread.sleep(3000);
	canarabaseno.clear();
	canarabaseno.sendKeys(baseno);
	Thread.sleep(3000);
	canaratccode.clear();
	canaratccode.sendKeys(tc);
	Thread.sleep(3000);
}

@When("^valid amount for last cheque  \"(.*?)\" and after click on save button$")
public void valid_amount_for_last_cheque_and_after_click_on_save_button(String amount) throws Throwable {
	
	PageFactory.initElements(OpenBrowser.driver,ValidChequeData.class);
	Thread.sleep(3000);
  canaraamountforcheque.clear();
  canaraamountforcheque.sendKeys(amount);
	Thread.sleep(3000);
    
}

@Then("^i should  able to save the records and after that i will get pop up for batch is not balanced$")
public void i_should_able_to_save_the_records_and_after_that_i_will_get_pop_up_for_batch_is_not_balanced() throws Throwable {
	Thread.sleep(3000);
	savebutton.click();
	Thread.sleep(3000);
	
	submitbatch.click();
	Thread.sleep(3000);
	
    
}


}

