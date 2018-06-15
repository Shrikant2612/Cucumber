package CanaraStepDefination_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class Logout_Functionality extends WebElementObjectRepositoryForCucumber {
	
	@Given("^i am on homepage$")
	public void i_am_on_homepage() throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,Logout_Functionality.class);
		Thread.sleep(5000);
	
		}
	

	@When("^i clicked on logout button$")
	public void i_clicked_on_logout_button() throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,Logout_Functionality.class);
		Thread.sleep(5000);
	  logout.click();
	  Thread.sleep(5000);
	}

	@Then("^it should logout the application and click here to login screen will appear$")
	public void it_should_logout_the_application_and_click_here_to_login_screen_will_appear() throws Throwable {
		
		
	  
	}


}
