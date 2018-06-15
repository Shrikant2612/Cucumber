package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class Verification_Of_Superbalancing_For_Checker_User_First_Batch extends WebElementObjectRepositoryForCucumber {
	
	
	
	@Given("^i am in superbalancing module$")
	public void i_am_in_superbalancing_module() throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,Verification_Of_Superbalancing_For_Checker_User_First_Batch.class);
		Thread.sleep(3000);
		canaraoutsuperbalancingmodule.click();
		Thread.sleep(5000);
		
	   
	}

	@When("^I open the first batch$")
	public void i_open_the_first_batch() throws Throwable {
		Thread.sleep(3000);
	  canaraoutfirstbatch.click();
		Thread.sleep(5000);
	  
	}

	@Then("^i should able to submit the batch$")
	public void i_should_able_to_submit_the_batch() throws Throwable {
	    Thread.sleep(5000);
	    
	    for (int i=1;i<=5;i++)
	    {
	    	Thread.sleep(3000);
	    	handlesinglerecord.click();
	    	Thread.sleep(3000);
	  	
	    }
	    Thread.sleep(5000);
	    submitbatch.click();
	    Thread.sleep(5000);
	    dontwanttoloadbatch.click();
	    Thread.sleep(5000);
	    
	    
	}


}
