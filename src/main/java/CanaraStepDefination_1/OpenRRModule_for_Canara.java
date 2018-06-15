package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenRRModule_for_Canara extends WebElementObjectRepositoryForCucumber {
	
	@Given("^when I clicked on RR Module$")
	public void when_I_clicked_on_RR_Module() throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,OpenRRModule_for_Canara.class);
		Thread.sleep(5000);
Thread.sleep(3000);
		
		
		Thread.sleep(5000);
		newcanaraoutrrmodule.click();
		Thread.sleep(5000);
		
		
	   
	}

	@When("^I select the batchno$")
	public void i_select_the_batchno() throws Throwable {
		Thread.sleep(3000);
		PageFactory.initElements(OpenBrowser.driver,OpenRRModule_for_Canara.class);
		Thread.sleep(5000);
		canaraoutfirstbatch.click();
		Thread.sleep(5000);
	    
	}

	@Then("^it should open the batch$")
	public void it_should_open_the_batch() throws Throwable {
		System.out.println("main page will display");
	   
	}


}
