package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubmitBatch extends WebElementObjectRepositoryForCucumber {
	

@Given("^when my batch is balanced$")
public void when_my_batch_is_balanced() throws Throwable {
	
   System.out.println("8th scenario");
}

@When("^i clicked on submit batch button$")
public void i_clicked_on_submit_batch_button() throws Throwable {
	PageFactory.initElements(OpenBrowser.driver,SubmitBatch.class);
	
	Thread.sleep(3000);
	submitbatch.click();
	Thread.sleep(3000);
	
	
		 
}

@Then("^it should asked pop up for batch submit and next batch load pop up$")
public void it_should_asked_pop_up_for_batch_submit_and_next_batch_load_pop_up() throws Throwable {
	
	PageFactory.initElements(OpenBrowser.driver,SubmitBatch.class);
	Thread.sleep(3000);
	dontwanttoloadbatch.click();
	Thread.sleep(3000);
	
   
}


}
