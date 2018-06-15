

package CanaraStepDefination_1;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;

import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ReusableClasses.HelightElementMethod;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ICICIStepDefination extends WebElementObjectRepositoryForCucumber {
	
	

	
	@Given("^when i access the WebCTS Outward URL For the Canara Bank$")
	public void when_i_access_the_WebCTS_Outward_URL_For_the_Canara_Bank() throws Throwable {
		
		
		
	   
	}
	

	@When("^I enter the Invalid \"(.*?)\" and Invalid \"(.*?)\"$")
	public void i_enter_the_Invalid_and_Invalid(String username1, String password1) throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,ICICIStepDefination.class);
		
		
		
		Thread.sleep(3000);
		HelightElementMethod.HelightElementonWebPage(OpenBrowser.driver, username);
		username.clear();
		
	username.sendKeys(username1);
	Thread.sleep(3000);
	HelightElementMethod.HelightElementonWebPage(OpenBrowser.driver, password);
	password.clear();
	password.sendKeys(password1);
	Thread.sleep(3000);
	
	}

	@Then("^i should not able to login$")
	public void i_should_not_able_to_login() throws Throwable {
		
		
		Thread.sleep(3000);
		HelightElementMethod.HelightElementonWebPage(OpenBrowser.driver, login);
		login.click();
	Thread.sleep(8000);	
	
	Thread.sleep(3000);	
	}
	
	@Then("^we should able to verify the error \"(.*?)\" on UI$")
public void we_should_able_to_verify_the_error_on_UI(String messages) throws Throwable {

Thread.sleep(3000);
 String actualerrormessge=errormessagewhileloginwithinvaliduser.getText();
 Thread.sleep(3000);
 if(actualerrormessge.equalsIgnoreCase(messages))
	 {
	 softassertion.assertEquals(true, true);
	 }
 else
 {
	 softassertion.assertEquals(true, false); 
 }

 Thread.sleep(3000);
softassertion.assertAll();

    
}



@Given("^when i access the WebCTS Outward URL For the Canara Bank for valid user$")
public void when_i_access_the_WebCTS_Outward_URL_For_the_Canara_Bank_for_valid_user() throws Throwable {
	
	
	System.out.println("URL access for Valid user");
	
	
  
}

@When("^I enter the valid \"(.*?)\" and valid \"(.*?)\"$")
public void i_enter_the_valid_and_valid(String username2, String password2) throws Throwable {
	
	PageFactory.initElements(OpenBrowser.driver,ICICIStepDefination.class);
	Thread.sleep(6000);
	username.clear();
	
username.sendKeys(username2);
Thread.sleep(3000);

password.clear();
password.sendKeys(password2);
Thread.sleep(3000);

   
}

@Then("^i should able to login$")
public void i_should_able_to_login() throws Throwable {
	
	
	Thread.sleep(3000);
	login.click();
Thread.sleep(8000);	



  
}


	


}
