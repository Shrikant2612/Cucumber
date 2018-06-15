package CanaraStepDefination_1;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Panini_Capture  extends WebElementObjectRepositoryForCucumber{
	
	@Given("^I connect panini scanner$")
	public void i_connect_panini_scanner() throws Throwable {
		Thread.sleep(5000);
		
		canaraoutpaninimodule.click();
		
		
	
	}

	@When("^I click on initialize button$")
	public void i_click_on_initialize_button() throws Throwable {
	 
	}

	@Then("^it should able to capture$")
	public void it_should_able_to_capture() throws Throwable {
	
	}



}
