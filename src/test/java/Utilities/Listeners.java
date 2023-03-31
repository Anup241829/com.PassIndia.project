package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import globalObject.ObjectPage;

public class Listeners extends ObjectPage implements ITestListener{
	
	public static ExtentTest objExtentTest;
	ExtentReports objExtentReports = ExtentReporter.getReport();
	
	//result hold the information about testcase
	
	@Override
	public void onTestStart(ITestResult result) {
		
		objExtentTest = objExtentReports.createTest(result.getMethod().getMethodName());
		ObjectPage.setExtentTest(objExtentTest);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		objExtentTest.log(Status.PASS, "Test Passed");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		objExtentTest.fail(result.getThrowable());
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		}
		catch(Exception e) {
			
			// tooo auto generated catch blockl
			e.printStackTrace();
		}
		
	
	 }	
	@Override
	public void onTestSkipped(ITestResult result) {
		objExtentTest.log(Status.SKIP,"Skipped Test case");
		
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		//Too Auto-generated method stub	
	}
	
	@Override
	public void onStart(ITestContext context) {
		//Too Auto-generated method stub	
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
		//Too Auto-generated method stub
		objExtentTest.log(Status.PASS,"Test Completed");
		objExtentReports.flush();
	}
	

}
