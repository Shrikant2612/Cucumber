package ReusableClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.Cucumber.WebElementObjectRepositoryForCucumber;
import CanaraStepDefination_1.OpenBrowser;


public class HelightElementMethod extends WebElementObjectRepositoryForCucumber {

	public static void HelightElementonWebPage(WebDriver driver,
			WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) OpenBrowser.driver;
		js.executeScript(
				"arguments[0].setAttribute('style','background: yellow; border:2px solid red;');",
				element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("error occured");
		}
		js.executeScript(
				"arguments[0].setAttribute('style','border: sold 2px white')",
				element);
	}
}
