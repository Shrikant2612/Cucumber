package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class Dummy_Slip_Insertion_And_Balance_Batch extends WebElementObjectRepositoryForCucumber {
	
	
	@Given("^when my batch is unbalanced$")
	public void when_my_batch_is_unbalanced() throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,Dummy_Slip_Insertion_And_Balance_Batch.class);
		
	  Thread.sleep(5000);
	  dummyslip.click();
	  Thread.sleep(5000);
	  
	}

	@When("^when i gave \"(.*?)\" and \"(.*?)\"$")
	public void when_i_gave_and(String AccountNo, String Amount) throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,Dummy_Slip_Insertion_And_Balance_Batch.class);
		Thread.sleep(3000);
		canaraoutdepositaccountnoforslip.clear();
		canaraoutdepositaccountnoforslip.sendKeys(AccountNo);
		Thread.sleep(3000);
		canaraoutamountforslip.clear();
		canaraoutamountforslip.sendKeys(Amount);
		Thread.sleep(3000);
		//savebutton.click();
		
		Thread.sleep(5000);
		forcesavebutton.click();
		Thread.sleep(5000);
		submitbatch.click();
		Thread.sleep(7000);
		
	
	}

	@Then("^i should able to insert dummy slip and balance the batch$")
	public void i_should_able_to_insert_dummy_slip_and_balance_the_batch() throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,Dummy_Slip_Insertion_And_Balance_Batch.class);
		Thread.sleep(3000);
		//forcesavebutton.click();
		Thread.sleep(3000);
		
		
	    
	}


}
