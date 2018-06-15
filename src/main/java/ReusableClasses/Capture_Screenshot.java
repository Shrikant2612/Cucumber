package ReusableClasses;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import CanaraStepDefination_1.OpenBrowser;

import java.io.File;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;




public class Capture_Screenshot {
	
	
	
	public static void getScreenShot(WebDriver driver,String Screenshotname) throws IOException, InterruptedException
	{
		
		
		TakesScreenshot scrshot=((TakesScreenshot)OpenBrowser.driver);
		   File src=scrshot.getScreenshotAs(OutputType.FILE);
		   String filepath="C:\\Screenshot\\";
		   
		   
	 File dest=new File(filepath+Screenshotname+".jpg");
		   FileUtils.copyFile(src, dest);
		
		
	}
}
		
		