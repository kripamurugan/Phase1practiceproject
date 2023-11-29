package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\seleniumDemo\\Lesson5-CucumberDemo\\src\\test\\java\\features\\wikipage.feature",
glue= {"steps"},dryRun=false,plugin= {"pretty","html:target/cucumbertaghookswikipage.html"},
tags="@all")

//	tags="@all" // all the scenarios of feature file will be executed
//	tags="@login" // only login will run
//   tags="@login and @logout"  // only scenarios having both the tags login and logout should run
//   tags = "@login or @logout"  
	// only scenarios having any of  the tags login or logout should run
//  tags = "not @logout" // avoid logout scenario and run the rest of the scenarios
// tags = "@regression or @smoke or @functional" 
		// tags = "@regression"
// all scenarios with tag regression will run

		
public class TestRunnerWikipage {

	
	
	// A cucumber runner file is used to build a communication between your feature
			// files and step defination file
			// Whenever we have to run multiple features or multiple steps, then we use
			// Cucumber runner file.
			// Whenever have to generate reports , we will use cucumber runner file

			/*
			 * - cucumber report - Extent report - Cucumber reports in PDF format - HTML
			 * Reports - TestNG Reports
			 * 
			 * Various Cucumber options or properties :
			 * 
			 * features : comma separted paths to feature file. dryRun=true : It will check
			 * if every steps has an step defination method implemented or not glue : comma
			 * separated package names of step def. file plugin = pretty : Tags
			 * 
			 */
}

