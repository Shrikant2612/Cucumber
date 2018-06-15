package CanaraStepDefination_1;

import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class DocumentSearch_for_Common_Module extends WebElementObjectRepositoryForCucumber{
	

	
	@Given("^I have to verify the Document Search module$")
public void i_have_to_verify_the_Document_Search_module() throws Throwable {
	
		
		
	   
	}

	@When("^I clicked in Document Search Module$")
	public void i_clicked_in_Document_Search_Module() throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,DocumentSearch_for_Common_Module.class);
		Thread.sleep(5000);
		canaraoutdocsearchmodule.click();
		Thread.sleep(8000);
		
	}
	
	
	@Then("^I should able to see sorterno \"(.*?)\" and \"(.*?)\"$")
	public void i_should_able_to_see_sorterno_and(String sorternoleft, String sorternoright) throws Throwable {
		
		Thread.sleep(5000);
		canaraoutleftsorterno.clear();
		
		canaraoutleftsorterno.sendKeys(sorternoleft);
		Thread.sleep(2000);
		canaraoutrightsorterno.clear();
		canaraoutrightsorterno.sendKeys(sorternoright);
	}

	@Then("^I should able to see presentingbankno \"(.*?)\" and \"(.*?)\"$")
	public void i_should_able_to_see_presentingbankno_and(String presentingbanknoleft, String presentingbanknoright) throws Throwable {
		Thread.sleep(3000);
		canaraoutleftpresentingbankroutingno.clear();
		canaraoutleftpresentingbankroutingno.sendKeys(presentingbanknoleft);
		Thread.sleep(3000);
		canaraoutrightpresentingbankroutingno.clear();
		 canaraoutrightpresentingbankroutingno.sendKeys(presentingbanknoright);
	
	
}
	

	@Then("^I should able to see  sequenceno \"(.*?)\" and \"(.*?)\"$")
	public void i_should_able_to_see_sequenceno_and(String sequencenoleft, String sequencenoright) throws Throwable {
		
		Thread.sleep(3000);
		canaraoutleftsequenceno.clear();
		 canaraoutleftsequenceno.sendKeys(sequencenoleft);
		 Thread.sleep(3000);
		 canaraoutrightsequenceno.clear();
		 canaraoutrightsequenceno.sendKeys(sequencenoright);
	
	}

	@Then("^I should able to see blockno \"(.*?)\" and \"(.*?)\"$")
	public void i_should_able_to_see_blockno_and(String blocknoleft, String blocknoright) throws Throwable {
	   
		Thread.sleep(3000);
		canaraoutleftblockno.clear();
		canaraoutleftblockno.sendKeys(blocknoleft);
		canaraoutrightblockno.clear();
		canaraoutrightblockno.sendKeys(blocknoright);
		
	}
	@Then("^I should able to see batchno \"(.*?)\" and \"(.*?)\"$")
	public void i_should_able_to_see_batchno_and(String batchnoleft, String batchnoright) throws Throwable {
		
		Thread.sleep(3000);
		canaraoutleftbatchno.clear();
		 canaraoutleftbatchno.sendKeys(batchnoleft);
		 canaraoutrightbatchno.clear();
		 canaraoutrightbatchno.sendKeys(batchnoright);
	

	}
	@Then("^I should able to see chequedate \"(.*?)\" and \"(.*?)\"$")
	public void i_should_able_to_see_chequedate_and(String chequedateleft, String chequedateright) throws Throwable {
	   
		
		Thread.sleep(3000);
		canaraoutleftchequedate.clear();
		canaraoutleftchequedate.sendKeys(chequedateleft);
		Thread.sleep(3000);
		canaraoutrightchequedate.clear();
		canaraoutrightchequedate.sendKeys(chequedateright);
	
	}
	
	
	@Then("^After click on ok button it should display the \"(.*?)\" and \"(.*?)\"$")
public void after_click_on_ok_button_it_should_display_the_and(String itemcount, String totalamount) throws Throwable {
	   
		Thread.sleep(3000);
		submitbatch.click();
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
