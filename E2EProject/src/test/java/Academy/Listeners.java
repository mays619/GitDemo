package Academy;



import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReportsDemo;
import resources.base;

public class Listeners extends base implements ITestListener {

	ExtentReports er=ExtentReportsDemo.getReports();
	ExtentTest test;
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	
	
	@Override
	public void onFinish(ITestContext context) {
		
		
		er.flush();
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
		
		
	//ITestListener.super.onStart(context);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
		String testMethodName = result.getMethod().getMethodName();
		
		
			try {
				driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			} catch (Exception e) {
			
			}
		
		
		
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShot(testMethodName, driver), result.getMethod().getMethodName());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		//ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	//	ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestStart(ITestResult result) {
	
		
		
		 test=er.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	//	ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		
		extentTest.get().log(Status.PASS, "Test Passed");
	//	ITestListener.super.onTestSuccess(result);
	}

}
