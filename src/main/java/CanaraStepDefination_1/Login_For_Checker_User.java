package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import Configuration.Handle_Alert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_For_Checker_User  extends WebElementObjectRepositoryForCucumber{
	
	
	@Given("^Maker user did logout$")
	public void maker_user_did_logout() throws Throwable {
		
	    Thread.sleep(3000);
	}

	@When("^I clicked on click here to login button$")
	public void i_clicked_on_click_here_to_login_button() throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,Login_For_Checker_User.class);
		Thread.sleep(3000);
		clickheretologin.click();
		Thread.sleep(8000);
		
			
	    
	}

	@Then("^i should get SOD Pop up and after that user will enter the \"(.*?)\" and \"(.*?)\" then user should able to login$")
	public void i_should_get_SOD_Pop_up_and_after_that_user_will_enter_the_and_then_user_should_able_to_login(String username3, String password3) throws Throwable {
		
		
PageFactory.initElements(OpenBrowser.driver,Login_For_Checker_User.class);
		
		Thread.sleep(3000);
		Handle_Alert.Handle_Alert();
		Thread.sleep(3000);
		username.clear();
		
	username.sendKeys(username3);
	Thread.sleep(3000);
	
	password.clear();
	password.sendKeys(password3);
	Thread.sleep(3000);
	login.click();
	Thread.sleep(7000);
	
	    
	}


}
