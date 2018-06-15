package CanaraStepDefination_1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Second_Batch_In_RR extends WebElementObjectRepositoryForCucumber{
	
	@Given("^user is in RR Module$")
	public void user_is_in_RR_Module() throws Throwable {
	
		Thread.sleep(3000);
	}

	@When("^I select the second batch$")
	public void i_select_the_second_batch() throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,Second_Batch_In_RR.class);
		Thread.sleep(10000);
		
		
		Thread.sleep(3000);
		/*JavascriptExecutor js = (JavascriptExecutor) OpenBrowser.driver;  
		js.executeScript("arguments[0].click", canaraoutsecondbatchforp2f);*/
		Thread.sleep(3000);
		System.out.println("it will click");
	 canaraoutsecondbatchforp2f.click();
	  Thread.sleep(15000);
		System.out.println("clicked");
	  
	}

	@Then("^It should open the batch$")
	public void it_should_open_the_batch() throws Throwable {
	  Thread.sleep(5000);
	}



}
