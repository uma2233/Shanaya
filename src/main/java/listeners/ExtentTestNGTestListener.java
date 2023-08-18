package listeners;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestNGTestListener implements ITestNGListener {
	ExtentReports extent = ExtentManager.getInstance();
	//Thread local is a class in java.lang pckage that provide a way to store values in a per-thread basis, in our case store test details in each thread
	ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
	//If i need six test i need six extent test instance, six threads getting created
	//on test start - add test
	public void onTestStart(ITestResult result) {
		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
		//Maintaining extent test in my thread local by TLs get method , to access we can simply say parent test.get
		parentTest.set(extentTest);
	}
	//add pass logs on success
	public void onTestSuccess(ITestResult result) {
		parentTest.get().pass("Test passed");
}//add fail log, exception trace and screenshot on failure
	public void onTestFailure(ITestResult result) {
		parentTest.get().fail("Test failed" +result.getThrowable().getMessage());}
	//add skip log
	public void onTestSkipped(ITestResult result) {
		parentTest.get().skip("Test skipped" +result.getThrowable().getMessage());}
	//flush on test finish
	public void onTestFinish(ITestContext context) {
		extent.flush();}
}