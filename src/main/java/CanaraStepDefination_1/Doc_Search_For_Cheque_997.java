package CanaraStepDefination_1;

import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class Doc_Search_For_Cheque_997 extends WebElementObjectRepositoryForCucumber {
	
	
	@Given("^i have on cheque tab$")
	public void i_have_on_cheque_tab() throws Throwable {
		Thread.sleep(3000);
System.out.println("hi");
	   canaraoutdocsearchforchequeslip.click();
	   Thread.sleep(5000);
	}

	@When("^I gave chequeno from \"(.*?)\" cheque to \"(.*?)\"$")
	public void i_gave_chequeno_from_cheque_to(String chequenoleft, String chequenoright) throws Throwable {
		Thread.sleep(3000);
		canaraoutchequenoforchequetableftsection.clear();
		canaraoutchequenoforchequetableftsection.sendKeys(chequenoleft);
		Thread.sleep(3000);
		canaraoutchequenoforchequetabrightsection.clear();
		canaraoutchequenoforchequetabrightsection.sendKeys(chequenoright);
		
		Thread.sleep(3000);
	}

	@When("^citycode from  \"(.*?)\" citycode to \"(.*?)\"$")
	public void citycode_from_citycode_to(String citycodeleft, String citycoderight) throws Throwable {
		
		Thread.sleep(3000);
		canaraoutcitycodeforchequetableftsection.clear();
		canaraoutcitycodeforchequetableftsection.sendKeys(citycodeleft);
		Thread.sleep(3000);
		canaraoutcitycodeforchequetabrightsection.clear();
		canaraoutcitycodeforchequetabrightsection.sendKeys(citycoderight);
		
		Thread.sleep(3000);
	    
	}

	@When("^bankcode from  \"(.*?)\" bankcode to \"(.*?)\"$")
	public void bankcode_from_bankcode_to(String bankcodeleft, String bankcoderight) throws Throwable {
		
		Thread.sleep(3000);
		canaraoutbankcodeforchequetableftsection.clear();
		canaraoutbankcodeforchequetableftsection.sendKeys(bankcodeleft);
		Thread.sleep(3000);
		canaraoutbankcodeforchequetabrightsection.clear();
		canaraoutbankcodeforchequetabrightsection.sendKeys(bankcoderight);
		
		Thread.sleep(3000);
	 
	}

	@When("^branchcode from  \"(.*?)\" branchcode to \"(.*?)\"$")
	public void branchcode_from_branchcode_to(String branchcodeleft, String branchcoderight) throws Throwable {
		
		Thread.sleep(3000);
		canaraoutbranchcodeforchequetableftsection.clear();
		canaraoutbranchcodeforchequetableftsection.sendKeys(branchcodeleft);
		Thread.sleep(3000);
		canaraoutbranchcodeforchequetabrightsection.clear();
		canaraoutbranchcodeforchequetabrightsection.sendKeys(branchcoderight);
		
		Thread.sleep(3000);
	 
	  
	}

	@When("^basecode from  \"(.*?)\" branchcode to \"(.*?)\"$")
	public void basecode_from_branchcode_to(String basenoleft, String basenoright) throws Throwable {
		
		Thread.sleep(3000);
		canaraoutbasenoforchequetableftsection.clear();
		canaraoutbasenoforchequetableftsection.sendKeys(basenoleft);
		Thread.sleep(3000);
		canaraoutbasenoforchequetabrightsection.clear();
		canaraoutbasenoforchequetabrightsection.sendKeys(basenoright);
		
		Thread.sleep(3000);
	   
	}

	@When("^tc from  \"(.*?)\" branchcode to \"(.*?)\"$")
	public void tc_from_branchcode_to(String tccodeleft, String tccoderight) throws Throwable {
		
		Thread.sleep(3000);
		canaraouttcforchequetableftsection.clear();
		canaraouttcforchequetableftsection.sendKeys(tccodeleft);
		Thread.sleep(3000);
		canaraouttcforchequetabrightsection.clear();
		canaraouttcforchequetabrightsection.sendKeys(tccoderight);
		
		Thread.sleep(3000);
	    
	}

	@When("^amount from  \"(.*?)\" branchcode to \"(.*?)\"$")
	public void amount_from_branchcode_to(String amountleft, String amountright) throws Throwable {
		
		Thread.sleep(3000);
		canaraoutamountforchequetableftsection.clear();
		canaraoutamountforchequetableftsection.sendKeys(amountleft);
		Thread.sleep(3000);
		canaraoutamountforchequetabrightsection.clear();
		canaraoutamountforchequetabrightsection.sendKeys(amountright);
		
		Thread.sleep(3000);
	  
	}

	@When("^after clicked on ok button$")
	public void after_clicked_on_ok_button() throws Throwable {
		
		Thread.sleep(3000);
		submitbatch.click();
		Thread.sleep(5000);
		
	   
	}

	@Then("^it should display the \"(.*?)\" and \"(.*?)\" for the cheques$")
	public void it_should_display_the_and_for_the_cheques(String itemcount, String totalamount) throws Throwable {
	    
		
		Thread.sleep(8000);
		String Actualitemcount=bhutan_totalitemcount.getText();
		
		String Expcteditemcount=itemcount;
		System.out.println();
		
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


}

