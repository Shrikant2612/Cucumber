package CanaraStepDefination_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class Batch_Submit_For_Second_Batch_941  extends WebElementObjectRepositoryForCucumber{
	

@Given("^when my second batch is balanced$")
public void when_my_second_batch_is_balanced() throws Throwable {
	  System.out.println("8th scenario");
   
}

@When("^i clicked on submit batch button for second batch$")
public void i_clicked_on_submit_batch_button_for_second_batch() throws Throwable {
	
PageFactory.initElements(OpenBrowser.driver,Batch_Submit_For_Second_Batch_941.class);
	
	Thread.sleep(3000);
	submitbatch.click();
	Thread.sleep(3000);
  
}

@Then("^it should asked pop up for batch submit and next batch load pop up and it should go to main menu$")
public void it_should_asked_pop_up_for_batch_submit_and_next_batch_load_pop_up_and_it_should_go_to_main_menu() throws Throwable {
   
	
	PageFactory.initElements(OpenBrowser.driver,Batch_Submit_For_Second_Batch_941.class);
	Thread.sleep(5000);
	dontwanttoloadbatch.click();
	Thread.sleep(5000);
	mainmenu.sendKeys(Keys.ENTER);
	Thread.sleep(10000);
	
}

}
