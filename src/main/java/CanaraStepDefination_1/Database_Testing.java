package CanaraStepDefination_1;

import ReusableClasses.Database_Testing_for_Cucumber;
import cucumber.api.java.en.Given;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class Database_Testing extends WebElementObjectRepositoryForCucumber {
	/*
	@Given("^when I connect to database \"(.*?)\" and after executing query \"(.*?)\" it should give result$")
	public void when_I_connect_to_database_and_after_executing_query_it_should_give_result(String dbname, String query1) throws Throwable {
		
		Database_Testing_for_Cucumber.Delete_From_Inprogress();
		
	   
	}
*/
	
	
	@Given("^when I connect to database and after executing query it should give result$")
	public void when_I_connect_to_database_and_after_executing_query_it_should_give_result() throws Throwable {
	  
		Database_Testing_for_Cucumber.Delete_From_Inprogress();
	}
}
