package CanaraStepDefination_1;

import ReusableClasses.Start_The_Service;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Prerequisite {
	
	
	@Given("^I have to run the automation$")
	public void i_have_to_run_the_automation() throws Throwable {
		
	 
	}

	@When("^I excute the test suite$")
	public void i_excute_the_test_suite() throws Throwable {
		Thread.sleep(3000);
		Start_The_Service.clickonexe("C:\\PSDOCOUMENTS\\BANKS\\Canara\\StartServices.bat");
		Thread.sleep(5000);
		System.out.println("click done ");
		Start_The_Service.clickonexe("C:\\PSDOCOUMENTS\\BANKS\\Canara\\truncate_and_Insert_Data.bat");
			Thread.sleep(5000);
	    
	}

	@Then("^It should start the DE/Data Entry, Capture,Image Service ,Delete and Insert the data into database$")
	public void it_should_start_the_DE_Data_Entry_Capture_Image_Service_Delete_and_Insert_the_data_into_database() throws Throwable {
		
		
	   
	}


}