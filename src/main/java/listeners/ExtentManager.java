package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	public static ExtentReports extent;
public static ExtentReports createInstance() {
	ExtentReports extent = new ExtentReports();
	 
	 ExtentSparkReporter sparkReporter = new ExtentSparkReporter("MyExtentReport1.html");
	 sparkReporter.config().setReportName("ShahanaHomeTest");
	 sparkReporter.config().setTheme(Theme.DARK);
	 sparkReporter.config().setDocumentTitle("Welcome to Hometest world");
	 extent.attachReporter(sparkReporter);
	 ExtentTest t1 = extent.createTest("Login to Uma");
	 t1.pass("login success");
	 return extent;
}
//this below method is becoj, if every method of test we mention create insatnce we will get n number of instances but in reality we want one report for all tests so we use this below.
public static ExtentReports getInstance() {
	if(extent==null) {
		extent=createInstance();
		return extent;}
	else {return extent;
	}
}
}
