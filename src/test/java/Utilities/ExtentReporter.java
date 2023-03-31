package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports objExtentReports;
	
	public static ExtentReports getReport() {
		
		String reportPath = System.getProperty("user.dir")+"\\ExtentReport\\Report\\report.html";
		System.out.println("Html Report File Path"+reportPath);
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		objExtentReports = new ExtentReports();
		objExtentReports.setSystemInfo("Reportname","Webautoamtion Result");
		objExtentReports.attachReporter(reporter);
		reporter.config().setDocumentTitle("Practice project");
		reporter.config().setReportName("Extent Report");
        reporter.config().setTheme(Theme.DARK);
        return objExtentReports ;
        
		}
}
