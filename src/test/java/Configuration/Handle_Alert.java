package Configuration;

import org.openqa.selenium.Alert;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import CanaraStepDefination_1.OpenBrowser;

public class Handle_Alert extends WebElementObjectRepositoryForCucumber {
	
	public static void Handle_Alert() throws InterruptedException
	{
		Thread.sleep(5000);
		
		Alert alert=OpenBrowser.driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(5000);
		
		

		
}
}
