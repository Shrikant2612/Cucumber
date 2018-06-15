package CanaraStepDefination_1;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class B {
	
	


	public static void prerequisite()
	{
		System.out.println("prerequiste done first step");
	}



public static void prerequisite_1()
{
	System.out.println("prerequiste done second step");
}
	


public static void postrequisite()
{
	System.out.println("postrequiste done");
}

	@Given("^I have to do addition$")
	public void i_have_to_do_addition() throws Throwable {
		System.out.println("addition start");
	   
	}

	@When("^I have two number as \"(.*?)\" and \"(.*?)\"$")
	public void i_have_two_number_as_and(String a, String b) throws Throwable {
		
		
		System.out.println("addition middle");
		
	  ;
	}

	@Then("^i should do addition$")
	public void i_should_do_addition() throws Throwable {
		
		System.out.println("addition done");
	   
	}

	@Given("^I have to do subtraction$")
	public void i_have_to_do_subtraction() throws Throwable {
		
		System.out.println("subtraction start");
	 
	}
	

	@When("^I have two number as(\\d+) \"(.*?)\" and \"(.*?)\"$")
	public void i_have_two_number_as_and(int arg1, String arg2, String arg3) throws Throwable {
		
		System.out.println("subtraction middle");
	   
	}

	@Then("^i should do subtraction$")
	public void i_should_do_subtraction() throws Throwable {
		
		System.out.println("subtraction done");
	   ;
	}



}
