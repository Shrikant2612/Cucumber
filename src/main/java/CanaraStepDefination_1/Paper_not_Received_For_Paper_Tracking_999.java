package CanaraStepDefination_1;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Automation.Cucumber.WebElementObjectRepositoryForCucumber;

public class Paper_not_Received_For_Paper_Tracking_999 extends WebElementObjectRepositoryForCucumber {
	
	@Given("^i clicked on click on paper tracking module$")
	public void i_clicked_on_click_on_paper_tracking_module() throws Throwable {
		
		PageFactory.initElements(OpenBrowser.driver,Paper_not_Received_For_Paper_Tracking_999.class);
	   
		Thread.sleep(5000);
		canaraoutpapertrackingmodule.click();
		Thread.sleep(5000);
		
	}
	

@When("^I select the status for paper as \"(.*?)\"$")
public void i_select_the_status_for_paper_as(String statusforcheque) throws Throwable {

		Thread.sleep(3000);
		
		Thread.sleep(5000);
		Select dropdown = new Select(OpenBrowser.driver.findElement(By.id("ctl00_ContentPlaceHolder1_TabContainer1_Tab_47_11myDropDownLeft2")));
		Thread.sleep(3000);
		dropdown.selectByVisibleText(statusforcheque);
		Thread.sleep(5000);
	
		
			
	    
	}

	@When("^if i clicked on ok button$")
	public void if_i_clicked_on_ok_button() throws Throwable {
		Thread.sleep(6000);
		submitbatch.click();
		Thread.sleep(5000);
	 
	}


	@Then("^i should display the item \"(.*?)\" and amount \"(.*?)\"$")
	public void i_should_display_the_item_and_amount(String totalitem1, String totalamount1) throws Throwable {
		
		Thread.sleep(8000);
		String Actualitemcount=bhutan_totalitemcount.getText();
		
		String Expcteditemcount=totalitem1;
		System.out.println();
		
		String Actualtotalamount=bhutan_totalamount.getText();
		String Expctedtotalamount=totalamount1;
		
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
		softassertion.assertAll();
	
		
		
		}
	
	@Then("^able to mark the record with status as as paper received \"(.*?)\"$")
	public void able_to_mark_the_record_with_status_as_as_paper_received(String status1) throws Throwable {
		
		Thread.sleep(5000);
		canaraoutpapertrackingselectallcheque.click();
		Thread.sleep(5000);
		
		Select cheqquestatus = new Select(OpenBrowser.driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlSelect")));
		Thread.sleep(3000);
		cheqquestatus.selectByVisibleText(status1);
		
		Thread.sleep(5000);
		canaraoutpapertrackingmarktherecord.click();
		Thread.sleep(5000);
			searchcriteria.click();
		Thread.sleep(8000);
		mainmenu.click();
		Thread.sleep(5000);

	
		
		
		
		
		
	   
	}


}
