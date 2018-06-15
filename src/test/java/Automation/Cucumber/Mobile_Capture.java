package Automation.Cucumber;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	
@RunWith(Cucumber.class)
@CucumberOptions(features =
{	
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\MobileCaptureFeatureFile\\1_Mobile_Capture.feature",
},

 plugin={"html:target/cucumber-html-report",
		"html:target/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}, 
	                       glue = "Mobile_Capture"
	                       
	                    		)
			             
			                              


	
	
public class Mobile_Capture {
		
@AfterClass
		
public static  void teardown() throws InterruptedException
		{
			Thread.sleep(3000);
		     Reporter.loadXMLConfig(new File("C:/PSDOCOUMENTS/eclipseluna/Cucumber/Configuration/Extent-config.xml"));
		     Reporter.setSystemInfo("user", System.getProperty("user.name"));
		     Reporter.setSystemInfo("os", "Windows-10");
		     Reporter.setTestRunnerOutput("Sample test runner output message");
		    }



@BeforeClass
public static  void SystemTrayDemo()
{
	ReusableClasses.SystemTrayDemo.Ststem_Tray_Icon();
}
		}



