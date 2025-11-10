package org.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "C:\\Users\\vigneshraja\\eclipse-workspace\\MyCucumberProject\\src\\test\\resources\\features",
	    glue = {"org.stepDefinitions"},
	    plugin = {"pretty", 
	    		  "html:C:\\Users\\vigneshraja\\eclipse-workspace\\MyCucumberProject\\target\\cucumber-html-report\\cucumber-reports.html",
	    		  "json:C:\\Users\\vigneshraja\\eclipse-workspace\\MyCucumberProject\\target\\cucumber-json-report\\cucumber.json",
	    		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    		 },
	    dryRun = false,
	    monochrome = true
	)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
