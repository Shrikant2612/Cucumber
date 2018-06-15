package CanaraStepDefination_1;

import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Configuration.Handle_Alert;
import ReusableClasses.Zoom_In_Zoom_Out;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenBrowser {
	public static WebDriver driver;
	
	
	@Given("^when I open the IE browser and webdriver\\.exe path \"(.*?)\" is given$")
	public void when_I_open_the_IE_browser_and_webdriver_exe_path_is_given(String Path) throws Throwable {
	

	
			
			System.setProperty("webdriver.ie.driver",Path);

		   driver=new InternetExplorerDriver();
		  // driver.manage().window().maximize();
		   Thread.sleep(3000);	  
	}	
	
	@When("^I access the WEBCTS URL \"(.*?)\" for Outward$")
	public void i_access_the_WEBCTS_URL_for_Outward(String bankurl) throws Throwable {
		Thread.sleep(3000);
		  driver.get(bankurl);
		   Thread.sleep(3000);	
	}
		
	
	@Then("^i should get SOD Pop up$")
	public void i_should_get_SOD_Pop_up() throws Throwable {
		
		Thread.sleep(3000);
		Handle_Alert.Handle_Alert();
		Thread.sleep(3000);
	}
	  
	@Then("^User should able to Zomm the Browser \"(.*?)\" and \"(.*?)\"$")
	public void user_should_able_to_Zomm_the_Browser_and(int zoomin, int zoomout) throws Throwable {
	    
	Zoom_In_Zoom_Out.Zoom_In_Zoom_Out_Functionality(zoomin, zoomout);

	}
}
