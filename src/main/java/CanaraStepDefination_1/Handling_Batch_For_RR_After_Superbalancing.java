package CanaraStepDefination_1;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Handling_Batch_For_RR_After_Superbalancing  extends WebElementObjectRepositoryForCucumber{
	
	//Actions action = new Actions(driver);
	
	@Given("^i am in RR module for second batch$")
	public void i_am_in_RR_module_for_second_batch() throws Throwable {
		System.out.println("handling");
		PageFactory.initElements(OpenBrowser.driver,Handling_Batch_For_RR_After_Superbalancing.class);
		Thread.sleep(10000);
newcanaraoutrrmodule.click();
		
Thread.sleep(8000);
	 
	}

	@When("^I open the second batch which got rejected in superbalancing module$")
	public void i_open_the_second_batch_which_got_rejected_in_superbalancing_module() throws Throwable {
		Thread.sleep(5000);
		canaraoutsecondbatchforp2f.click();
		Thread.sleep(5000);
		
		
		
	   
	}

	@Then("^i should able to save the records and then  able to submit the batch$")
	public void i_should_able_to_save_the_records_and_then_able_to_submit_the_batch() throws Throwable {
		Thread.sleep(5000);
		savebutton.click();
		Thread.sleep(8000);
		
		submitbatch.click();
		Thread.sleep(5000);
		dontwanttoloadbatch.click();
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		mainmenu.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		
		
		
		
		
	    
	}



}
