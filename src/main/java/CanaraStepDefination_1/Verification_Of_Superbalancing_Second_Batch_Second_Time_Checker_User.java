package CanaraStepDefination_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verification_Of_Superbalancing_Second_Batch_Second_Time_Checker_User extends WebElementObjectRepositoryForCucumber {
	
	@Given("^i am in Superbalcing module for second batch$")
	public void i_am_in_Superbalcing_module_for_second_batch() throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,Verification_Of_Superbalancing_Second_Batch_Second_Time_Checker_User.class);
		Thread.sleep(5000);
		canaraoutsuperbalancingmodule.click();
		Thread.sleep(5000);
		canaraoutsecondbatchforp2f.click();
		Thread.sleep(5000);
		
		
	 
	}

	@When("^I open the second batch which got rejected in superbalancing module by checker$")
	public void i_open_the_second_batch_which_got_rejected_in_superbalancing_module_by_checker() throws Throwable {
		
		Thread.sleep(5000);
		handlesinglerecord.click();
		Thread.sleep(5000);
	   
	}

	@Then("^i should able to save the records and then  able to submit the batch in superbalancing module$")
	public void i_should_able_to_save_the_records_and_then_able_to_submit_the_batch_in_superbalancing_module() throws Throwable {
		
		Thread.sleep(5000);
		submitbatch.click();
		Thread.sleep(5000);
		dontwanttoloadbatch.click();
		Thread.sleep(5000);
		mainmenu.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		
		
	   
	}


}
