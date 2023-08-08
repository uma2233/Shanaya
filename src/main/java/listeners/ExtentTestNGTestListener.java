package listeners;

import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestNGTestListener implements ITestNGListener {
	ExtentReports extent = ExtentManager.getInstance();
	ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
		parentTest.set(extentTest);
	}
	public void onTestSuccess(ITestResult result) {
		parentTest.get().pass("Test passed");
}
	public void onTestFailure(ITestResult result) {
		parentTest.get().fail("Test failed" +result.getThrowable().getMessage());}
	public void onTestSkipped(ITestResult result) {
		parentTest.get().skip("Test skipped" +result.getThrowable().getMessage());}
	public void onTestFinish(ITestResult result) {
		parentTest.get().skip("Test Finished" +result.getThrowable().getMessage());}
}