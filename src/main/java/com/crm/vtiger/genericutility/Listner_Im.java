package com.crm.vtiger.genericutility;

import org.openqa.selenium.WebDriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listner_Im extends BaseClasss implements ITestListener {
public	ExtentReports reporter;
public ExtentTest test;
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	test=reporter.createTest(result.getMethod().getMethodName());
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	test.log(Status.PASS, result.getMethod().getMethodName()+"is passed");
}

public void onTestFailure(ITestResult result) {
	
	test.log(Status.FAIL, result.getMethod().getMethodName()+"is failed");
	test.log(Status.FAIL, result.getThrowable());
	String date = new Java_utility().getCurrentSystemDate().replace(" ", "-");
	
	WebdriverUtilities webutil=new WebdriverUtilities();
	try {
		webutil.takeScreenShot(BaseClasss.staticdriver,result.getMethod().getMethodName()+date);
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	test.log(Status.SKIP, result.getMethod().getMethodName()+"is skipped");
	test.log(Status.SKIP, result.getMethod().getMethodName());
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	ExtentSparkReporter htmlReporter=new ExtentSparkReporter("./ExtentReport.html");
	htmlReporter.config().setTheme(Theme.DARK);
	htmlReporter.config().setDocumentTitle("Vtiger App");
	htmlReporter.config().setReportName("Full regression test");
 reporter = new ExtentReports();
reporter.attachReporter(htmlReporter);
reporter.setSystemInfo("plateform", "windows");
reporter.setSystemInfo("os", "Windows 10 pro");
reporter.setSystemInfo("Environment", "Testing Environment");
reporter.setSystemInfo("Reporter", "Abhishek");

	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	reporter.flush();
}
}
