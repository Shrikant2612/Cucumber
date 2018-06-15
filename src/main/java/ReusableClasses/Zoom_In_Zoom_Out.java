package ReusableClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ie.InternetExplorerDriver;

import CanaraStepDefination_1.OpenBrowser;

public class Zoom_In_Zoom_Out extends OpenBrowser {
	
	
	
	public static void Zoom_In_Zoom_Out_Functionality(int zoomin, int zoomout) throws InterruptedException
	{
Thread.sleep(5000);
		
		((JavascriptExecutor)OpenBrowser.driver).executeScript("document.body.style.zoom='zoomin%'");
		
		Thread.sleep(5000);
		
		
		((JavascriptExecutor)OpenBrowser.driver).executeScript("document.body.style.zoom='zoomout%'");
		Thread.sleep(5000);
		
	}

}
