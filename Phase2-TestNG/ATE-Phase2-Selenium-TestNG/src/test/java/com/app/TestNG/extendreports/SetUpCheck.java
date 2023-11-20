package com.app.TestNG.extendreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SetUpCheck {

	@Test
	public void extentdemo() {

		// create an object to initiate Extent report engine

		ExtentReports ex = new ExtentReports();

		// give the path of the folder in which extent report has to be created
		// right click on project-->propetries-->go to resources on left-->copy the path
		// of project

//		D:\Java_Lectures\SL_SeleniumDemo_Workspace\ATE-Phase2-Selenium-TestNG

		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(
				"C:\\Users\\user\\seleniumDemo\\ATE-Phase2-Selenium-TestNG\\extentReport\\report.html");

		ex.attachReporter(sparkreporter);

		ex.flush();

	}

	@Test
	public void extentDemo2() throws IOException {

		ExtentReports ex = new ExtentReports();
		File file = new File("report1.html");

		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		ex.flush();

		Desktop.getDesktop().browse(new File("report1.html").toURI());

	}

}