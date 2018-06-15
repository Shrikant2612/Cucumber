package CanaraStepDefination_1;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class Verification_Of_Superbalancing_For_Checker_User_Second_Batch extends WebElementObjectRepositoryForCucumber{
	
	
	@Given("^i am in superbalancing module for second batch$")
	public void i_am_in_superbalancing_module_for_second_batch() throws Throwable {
		Thread.sleep(3000);
	
	 System.out.println("execution started for check user second batch");
		
	}

	@When("^I open the second batch$")
	public void i_open_the_second_batch() throws Throwable {
		
		Thread.sleep(5000);
		canaraoutsecondbatchforp2f.click();
		Thread.sleep(5000);
	    
	}

	@Then("^i should able to MICR or IMAGE tag and able to submit the batch$")
	public void i_should_able_to_MICR_or_IMAGE_tag_and_able_to_submit_the_batch() throws Throwable {
		Thread.sleep(8000);
		for (int i=1;i<=4;i++)
		{
			Thread.sleep(5000);
			handlesinglerecord.click();
			Thread.sleep(5000);
			
		}
		Thread.sleep(5000);
		MICRbutton.click();
		Thread.sleep(5000);
		submitbatch.click();
		Thread.sleep(5000);
		
		for (int j=1;j<=3;j++)
		{
			Thread.sleep(5000);
			submitbatch.click();
			Thread.sleep(5000);
			
		}
		Thread.sleep(5000);
		mainmenu.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		
	
	   
	}



}
