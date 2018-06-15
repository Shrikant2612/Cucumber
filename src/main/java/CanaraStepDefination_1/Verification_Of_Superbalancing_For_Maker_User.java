package CanaraStepDefination_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import Configuration.Handle_Alert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verification_Of_Superbalancing_For_Maker_User extends WebElementObjectRepositoryForCucumber{
	
	

	@Given("^User is in Superbalancing Module$")
	public void user_is_in_Superbalancing_Module() throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,Verification_Of_Superbalancing_For_Maker_User.class);
		Thread.sleep(3000);
		canaraoutsuperbalancingmodule.click();
		Thread.sleep(5000);
		
	    
	}

@When("^I clicked on batch no in superbalancing$")
public void i_clicked_on_batch_no_in_superbalancing() throws Throwable {
	Thread.sleep(3000);
	PageFactory.initElements(OpenBrowser.driver,Verification_Of_Superbalancing_For_Maker_User.class);
	Thread.sleep(5000);
	canaraoutfirstbatch.click();
	Thread.sleep(5000);
	Handle_Alert.Handle_Alert();
	Thread.sleep(5000);
	
	
	
    
}

@Then("^It should give pop up by saying verification canot be done by maker user$")
public void it_should_give_pop_up_by_saying_verification_canot_be_done_by_maker_user() throws Throwable {
	Thread.sleep(5000);
	canaraoutsecondbatchforp2f.click();
	Thread.sleep(5000);
	Handle_Alert.Handle_Alert();
	Thread.sleep(5000);
	mainmenu.sendKeys(Keys.ENTER);
	Thread.sleep(8000);
   
}

	

}
