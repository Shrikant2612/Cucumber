package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import Configuration.Handle_Alert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_For_Maker_User_Second_Time_993 extends WebElementObjectRepositoryForCucumber {
	
	@Given("^i clicked on click here to login button$")
	public void i_clicked_on_click_here_to_login_button() throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,Login_For_Maker_User_Second_Time_993.class);
		Thread.sleep(3000);
		clickheretologin.click();
		Thread.sleep(8000);
	}

	@When("^I enter the valid username  \"(.*?)\" and valid password  \"(.*?)\"$")
	public void i_enter_the_valid_username_and_valid_password(String username4, String password4) throws Throwable {
	 
		

		
		Thread.sleep(3000);
		Handle_Alert.Handle_Alert();
		Thread.sleep(3000);
		username.clear();
		
	username.sendKeys(username4);
	Thread.sleep(3000);
	
	password.clear();
	password.sendKeys(password4);
	Thread.sleep(3000);
	login.click();
	Thread.sleep(7000);
	
		
		
	}

	@Then("^i should able to login successfully$")
	public void i_should_able_to_login_successfully() throws Throwable {
		System.out.println("login done");
	  
	}

}
