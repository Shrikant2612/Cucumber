package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verification_Of_Document_Search_For_Deposit_Slip_996 extends WebElementObjectRepositoryForCucumber {
	
	
	
	@Given("^i have on deposit slip tab$")
	public void i_have_on_deposit_slip_tab() throws Throwable {
		PageFactory.initElements(OpenBrowser.driver,Verification_Of_Document_Search_For_Deposit_Slip_996.class);
		Thread.sleep(3000);
		canaraoutdepositslipsectionfordocsearch.click();
		Thread.sleep(5000);
	  
	}

	@When("^I gave from \"(.*?)\"  to \"(.*?)\"$")
	public void i_gave_from_to(String leftaccountno, String rightaccountno) throws Throwable {
	  Thread.sleep(3000);
	  canaraoutdepositslipaccountnoleft.clear();
	  canaraoutdepositslipaccountnoleft.sendKeys(leftaccountno);
	  Thread.sleep(3000);
	  canaraoutdepositslipaccountnoright.clear();
	  canaraoutdepositslipaccountnoright.sendKeys(rightaccountno);
	  Thread.sleep(3000);
	  
	  
		
	}

	@When("^\"(.*?)\"  to \"(.*?)\" i clicked on ok button$")
	public void to_i_clicked_on_ok_button(String leftamount, String righttamount) throws Throwable {
		
		  Thread.sleep(3000);
		  canaraoutdepositslipamountleft.clear();
		  canaraoutdepositslipamountleft.sendKeys(leftamount);
		  Thread.sleep(3000);
		  canaraoutdepositslipamountright.clear();
		  canaraoutdepositslipamountright.sendKeys(righttamount);
		  Thread.sleep(3000);
		  submitbatch.click();
		  Thread.sleep(5000);
		  
	  
	}

	@Then("^it should display the \"(.*?)\" and \"(.*?)\"$")
	public void it_should_display_the_and(String itemcount, String totalamount) throws Throwable {
		
		
		Thread.sleep(8000);
		String Actualitemcount=bhutan_totalitemcount.getText();
		
		String Expcteditemcount=itemcount;
	
		
		String Actualtotalamount=bhutan_totalamount.getText();
		String Expctedtotalamount=totalamount;
		
		if(Actualitemcount.equalsIgnoreCase(Expcteditemcount))
		{
		Assert.assertEquals(true, true);
		}
		else
		{
			Assert.assertEquals(true, false);
		}
		
		
		if(Actualtotalamount.equalsIgnoreCase(Expctedtotalamount))
		{
		Assert.assertEquals(true, true);
		}
		else
		{
			Assert.assertEquals(true, false);
		}
		
		Thread.sleep(5000);
		searchcriteria.click();
		Thread.sleep(8000);
softassertion.assertAll();
		
		
	}


	@Given("^i have on deposit slip tab without search inculding criteria$")
	public void i_have_on_deposit_slip_tab_without_search_inculding_criteria() throws Throwable {
	 
		
		Thread.sleep(3000);
		canaraoutdepositslipsectionfordocsearch.click();
		Thread.sleep(5000);
		canaraoutdepositslipunchecktextbox.click();
		Thread.sleep(5000);
		
	}

	@When("^I exclude the account no and amount range i clicked on ok button$")
	public void i_exclude_the_account_no_and_amount_range_i_clicked_on_ok_button() throws Throwable {
	   submitbatch.click();
	   Thread.sleep(5000);
		
	}

	@Then("^it should displays the \"(.*?)\" and \"(.*?)\"$")
	public void it_should_displays_the_and(String itemscount, String totalsamount) throws Throwable {
		
	
		Thread.sleep(8000);
		String Actualitemcount=bhutan_totalitemcount.getText();
		
		String Expcteditemcount=itemscount;
		System.out.println();
		
		String Actualtotalamount=bhutan_totalamount.getText();
		String Expctedtotalamount=totalsamount;
		
		if(Actualitemcount.equalsIgnoreCase(Expcteditemcount))
		{
		Assert.assertEquals(true, true);
		}
		else
		{
			Assert.assertEquals(true, false);
		}
		
		
		if(Actualtotalamount.equalsIgnoreCase(Expctedtotalamount))
		{
		Assert.assertEquals(true, true);
		}
		else
		{
			Assert.assertEquals(true, false);
		}
		
		Thread.sleep(5000);
		searchcriteria.click();
		Thread.sleep(8000);
softassertion.assertAll();
		
		
	}
	
	
}
