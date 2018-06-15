package Automation.Cucumber;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import CanaraStepDefination_1.OpenBrowser;
import ReusableClasses.Capture_Screenshot;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


	
	
@RunWith(Cucumber.class)
@CucumberOptions(features =
{	
/*"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\1_Application_Prerequiste.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\2_Browser.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\3_CanaraLogin.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\4_OpenRRModule.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\5_RejectRepair.feature" ,
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\6_ScenarioForValidCheque.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\7_DummySlip.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\8_SubmitBatch.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\91_Second_Batch_In_RR.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\92_Second_Batch_In_RR_For_P2F_Cheque.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\93_DummySlipforsecondbatch.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\94_SubmitBatchSecondBatch.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\941_Second_Batch_Submit_In_RR.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\95_Verification_Of_Superbalancing_For_Maker.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\96_LogoutFunctionality.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\97_Login_For_Checker.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\98_Verification_Of_Superbalancing_For_Checker_First_Batch.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\991_Verification_of_Superbalancing_For_Checker_Second_Batch.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\992_Handling_Batch_For_RR_After_Superbalancing.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\993_Logout_Functionality_for_Checker.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\994.Login_For_Maker.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\995_Superbalancing_Second_Batch_After_Doing_RR_Checker_Second_Time.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\996_DocumentSearchCommonModule.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\997_Document_Search_For_Deposit_Slip.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\998_Document_Search_For_Cheque.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\9991_Document_Search_For_Special_Cheque.feature",
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\9992_PaperTracking_PaperNot_Received.feature",


"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\9994_Database_Testing.feature"
"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\abcd.feature"*/
/*		"C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\FeatureFiles\\Canara_Capture_Panini.feature"*/
		
},

 plugin={"html:target/cucumber-html-report",
		"html:target/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}, 
	                       glue = "CanaraStepDefination_1"
	                       
	                    		 /*  tags={"~@1"}*/)
			             
			                              


	
	
public class ICICILoginModule {
		
@AfterClass
		
public static void teardown() throws InterruptedException
		{
			Thread.sleep(3000);
		     Reporter.loadXMLConfig(new File("C:/PSDOCOUMENTS/eclipseluna/Cucumber/Configuration/Extent-config.xml"));
		     Reporter.setSystemInfo("user", System.getProperty("user.name"));
		     Reporter.setSystemInfo("os", "Windows-10");
		     Reporter.setTestRunnerOutput("Sample test runner output message");
		    }



@BeforeClass
public static void SystemTrayDemo()
{
	ReusableClasses.SystemTrayDemo.Ststem_Tray_Icon();
}

@AfterMethod

public static void screenshotutility(ITestResult result) throws IOException, InterruptedException
{
	
	if(ITestResult.FAILURE==result.getStatus())
	{
		Capture_Screenshot.getScreenShot(OpenBrowser.driver, "login");
		
	}
}
		}
