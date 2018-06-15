package CanaraStepDefination_1;

import junit.framework.Assert;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class Doc_Search_For_Special_Cheque_998 extends WebElementObjectRepositoryForCucumber {
	
	public static int i=1;
	
	@Given("^i have on special cheque tab$")
	public void i_have_on_special_cheque_tab() throws Throwable {
		
		
		if(i==2)
		{ 
			Thread.sleep(5000);
		canaraoutdocsearchmodule.click();
		Thread.sleep(5000);

		   canaraoutdocsearchforspecialcheque.click();
		   Thread.sleep(5000);
		}
		else
		{
			   canaraoutdocsearchforspecialcheque.click();
			   Thread.sleep(5000);
		}

		
	    
	}

	@When("^I gave chequeno for special cheque from \"(.*?)\" cheque to \"(.*?)\"$")
	public void i_gave_chequeno_for_special_cheque_from_cheque_to(String chequeno1left, String chequeno1right) throws Throwable {
	 
		
		Thread.sleep(3000);
		canaraoutchequenoforspecialchequetableftsection.clear();
		canaraoutchequenoforspecialchequetableftsection.sendKeys(chequeno1left);
		Thread.sleep(3000);
		canaraoutchequenoforspecialchequetabrightsection.clear();
		canaraoutchequenoforspecialchequetabrightsection.sendKeys(chequeno1right);
		
		Thread.sleep(3000);
	}
	
	@When("^citycode  for special cheque from  \"(.*?)\" citycode to \"(.*?)\"$")
	public void citycode_for_special_cheque_from_citycode_to(String citycode1left, String citycode1right) throws Throwable {
		
		Thread.sleep(3000);
		canaraoutcitycodeforspecialchequetableftsection.clear();
		canaraoutcitycodeforspecialchequetableftsection.sendKeys(citycode1left);
		Thread.sleep(3000);
		canaraoutcitycodeforspecialchequetabrightsection.clear();
		canaraoutcitycodeforspecialchequetabrightsection.sendKeys(citycode1right);
		
		Thread.sleep(3000);
	   
	}

	@When("^bankcode for special cheque from  \"(.*?)\" bankcode to \"(.*?)\"$")
	public void bankcode_for_special_cheque_from_bankcode_to(String bankcode1left, String bankcode1right) throws Throwable {
		Thread.sleep(3000);
		canaraoutbankcodeforspecialchequetableftsection.clear();
		canaraoutbankcodeforspecialchequetableftsection.sendKeys(bankcode1left);
		Thread.sleep(3000);
		canaraoutbankcodeforspecialchequetabrightsection.clear();
		canaraoutbankcodeforspecialchequetabrightsection.sendKeys(bankcode1right);
		
		Thread.sleep(3000);
		
		
	   
	}

	@When("^branchcode for special cheque from  \"(.*?)\" branchcode to \"(.*?)\"$")
	public void branchcode_for_special_cheque_from_branchcode_to(String branchcode1left, String branchcode1right) throws Throwable {
	
		
		
		Thread.sleep(3000);
		canaraoutbranchcodeforspecialchequetableftsection.clear();
		canaraoutbranchcodeforspecialchequetableftsection.sendKeys(branchcode1left);
		Thread.sleep(3000);
		canaraoutbranchcodeforspecialchequetabrightsection.clear();
		canaraoutbranchcodeforspecialchequetabrightsection.sendKeys(branchcode1right);
		
		Thread.sleep(3000);
	 
	}

	@When("^basecode for special cheque  from  \"(.*?)\" branchcode to \"(.*?)\"$")
	public void basecode_for_special_cheque_from_branchcode_to(String baseno1left, String baseno1right) throws Throwable {
	  
		
		Thread.sleep(3000);
		canaraoutbasenoforspecialchequetableftsection.clear();
		canaraoutbasenoforspecialchequetableftsection.sendKeys(baseno1left);
		Thread.sleep(3000);
		canaraoutbasenoforspecialchequetabrightsection.clear();
		canaraoutbasenoforspecialchequetabrightsection.sendKeys(baseno1right);
		
		Thread.sleep(3000);
		
	}

	@When("^tc for special cheque from  \"(.*?)\" branchcode to \"(.*?)\"$")
	public void tc_for_special_cheque_from_branchcode_to(String tccode1left, String tccode1right) throws Throwable {
	  
		
		Thread.sleep(3000);
		canaraouttcforspecialchequetableftsection.clear();
		canaraouttcforspecialchequetableftsection.sendKeys(tccode1left);
		Thread.sleep(3000);
		canaraouttcforspecialchequetabrightsection.clear();
		canaraouttcforspecialchequetabrightsection.sendKeys(tccode1right);
		
		Thread.sleep(3000);
	}

	@When("^amount for special cheque from  \"(.*?)\" branchcode to \"(.*?)\"$")
	public void amount_for_special_cheque_from_branchcode_to(String amount1left, String amount1right) throws Throwable {
	  
		
		Thread.sleep(3000);
		canaraoutamountforspecialchequetableftsection.clear();
		canaraoutamountforspecialchequetableftsection.sendKeys(amount1left);
		Thread.sleep(3000);
		canaraoutamountforspecialchequetabrightsection.clear();
		canaraoutamountforspecialchequetabrightsection.sendKeys(amount1right);
		
		Thread.sleep(3000);
	}

	@When("^after i clicked on ok button$")
	public void after_i_clicked_on_ok_button() throws Throwable {
		
		Thread.sleep(3000);
		submitbatch.click();
		Thread.sleep(5000);
	  
	}

	@Then("^it should display special cheque the \"(.*?)\" and \"(.*?)\" for the cheques$")
	public void it_should_display_special_cheque_the_and_for_the_cheques(String itemcountforspecialcheque, String totalamountforspecialcheque) throws Throwable {
	
		
		Thread.sleep(8000);
		String Actualitemcount=bhutan_totalitemcount.getText();
		
		String Expcteditemcount=itemcountforspecialcheque;
		System.out.println();
		
		String Actualtotalamount=bhutan_totalamount.getText();
		String Expctedtotalamount=totalamountforspecialcheque;
		
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
		mainmenu.click();
		Thread.sleep(5000);
softassertion.assertAll();
i++;

	}

	}



