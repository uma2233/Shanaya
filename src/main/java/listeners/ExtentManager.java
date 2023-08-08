package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	public static ExtentReports extent;
public static ExtentReports createInstance() {
	ExtentReports extent = new ExtentReports();
	 
	 ExtentSparkReporter sparkReporter = new ExtentSparkReporter("MyHtmlReport2.html");
	 sparkReporter.config().setReportName("Uma");
	 sparkReporter.config().setTheme(Theme.DARK);
	 sparkReporter.config().setDocumentTitle("Welcome to Uma world");
	 extent.attachReporter(sparkReporter);
	 return extent;
}
public static ExtentReports getInstance() {
	if(extent==null) {
		extent=createInstance();
		return extent;}
	else {return extent;
	}
}
}
