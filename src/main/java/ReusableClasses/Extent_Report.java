package ReusableClasses;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report {
	
}
/*
	public static ExtentReports extent;
	public static ExtentTest test;*/
	//public static SimpleDateFormat sdf;

	/*static
	{sdf=new SimpleDateFormat ("dd-MM-YYYY-hh-mm-SS-SSS");
	try
	{
	extent=new ExtentReports("C:\\PSDOCOUMENTS\\eclipseluna\\Cucumber\\output\\report.html"))+sdf.format(new Date())+".html",false);
	}
	catch (IOException e)
	{
	e.printStackTrace();
	}


	public static void getResult(ITestResult result) throws IOException

	{
	TestBase TB=new TestBase();
	if(result.getStatus()==ITestResult.SUCCESS){
	String screen=TB.getscreenshot("");
	test.log(LogStatus.PASS, test.addscreenCapture(screen));
	test.log(LogStatus.PASS, result.getName() + "Test passsed successfully");}

	else if(if(result.getStatus()==ITestResult.SKIP){

	test.log(LogStatus.SKIP, result.getName() + "Test skipeedsuccessfully"+result.getThrowable());}


	else if(if(result.getStatus()==ITestResult.FAILURE){

	test.log(LogStatus.FAIL, result.getName() + "Test failed"+result.getThrowable());}





}
*/