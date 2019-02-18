package myWorkspace.Framework;

import java.lang.reflect.Method;

import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter 
{
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentHtmlReporter htmlreporter;
	
	public static void startReport(ITestContext txt)
	{
		htmlreporter = new ExtentHtmlReporter("C:\\Users\\Deepak\\git\\mySpace\\Exercise\\Reports"+"/testreport.html");
		report = new ExtentReports();
		report.attachReporter(htmlreporter);
		//htmlreporter.config().setReportName("Test Sample");
		htmlreporter.config().setReportName(txt.getName());
		htmlreporter.config().setTheme(Theme.DARK);
	    htmlreporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	   //test = report.createTest(txt.getName());
	}
	
	public static void endReport()
	{
		report.flush();
	}
	
	public static void setup(Method method)
	{
		test = report.createTest(method.getName());
	}
}
