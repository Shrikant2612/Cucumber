package CanaraStepDefination_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CanaraRejectRepair extends WebElementObjectRepositoryForCucumber{
	

	
	@Given("^when i enter to RR module and after selecting the batch$")
	public void when_i_enter_to_RR_module_and_after_selecting_the_batch() throws Throwable {
		
		
		
	  
	}

	@When("^I enter the Invalid chequeno \"(.*?)\" and Invalid citycode \"(.*?)\"$")
	public void i_enter_the_Invalid_chequeno_and_Invalid_citycode(String chequeno, String citycode) throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,CanaraRejectRepair.class);
		Thread.sleep(3000);
		canarachequeno.clear();
		canarachequeno.sendKeys(chequeno);
		Thread.sleep(3000);
		canaracitycode.clear();
		canaracitycode.sendKeys(citycode);
		Thread.sleep(3000);
		
		
	  
	}

	@When("^Invalid bank code \"(.*?)\" and Invalid branch code  \"(.*?)\" and$")
	public void invalid_bank_code_and_Invalid_branch_code_and(String bankcode, String branchcode) throws Throwable {
	
		PageFactory.initElements(OpenBrowser.driver,CanaraRejectRepair.class);
		Thread.sleep(3000);
		canarabankcode.clear();
		canarabankcode.sendKeys(bankcode);
		Thread.sleep(3000);
		canarabranchcode.clear();
		canarabranchcode.sendKeys(branchcode);
		Thread.sleep(3000);
		
	}

	
	@When("^Invalid base no \"(.*?)\" and Invalid tc \"(.*?)\" and$")
	public void invalid_base_no_and_Invalid_tc_and(String baseno, String tc) throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,CanaraRejectRepair.class);
		Thread.sleep(3000);
		canarabaseno.clear();
		canarabaseno.sendKeys(baseno);
		Thread.sleep(3000);
		canaratccode.clear();
		canaratccode.sendKeys(tc);
		Thread.sleep(3000);
	}

	@When("^Invalid amount  \"(.*?)\" and after click on save button$")
	public void invalid_amount_and_after_click_on_save_button(String amount) throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,CanaraRejectRepair.class);
		Thread.sleep(3000);
	  canaraamountforcheque.clear();
	  canaraamountforcheque.sendKeys(amount);
		Thread.sleep(3000);
	  
	}

	@Then("^i should not able to save the records$")
	public void i_should_not_able_to_save_the_records() throws Throwable {
		Thread.sleep(3000);
		savebutton.click();
		Thread.sleep(5000);
		
	    
	}

	
	
}