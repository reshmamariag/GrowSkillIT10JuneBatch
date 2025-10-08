package day5_19092025;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestMethods implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Now the test method execution started: "+result.getName());
	  }

	  
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test method is passed");
	  }

	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test method is failed");
	  }

	  
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test method is skipped");
	  }

	  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  
	public void onStart(ITestContext context) {
		System.out.println("Now execution is started");
	  }

	public void onFinish(ITestContext context) {
		System.out.println("Execution is finished");
	  }

}
