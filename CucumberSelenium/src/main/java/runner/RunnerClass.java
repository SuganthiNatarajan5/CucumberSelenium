package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions (features = "featureFile/OpenGoogle.feature",glue = "stepDefinitions")
//@CucumberOptions (features = "featureFile/login.feature",glue = "stepDefinitions")
//@CucumberOptions (features = "featureFile/expression.feature",glue = "stepDefinitions")
//@CucumberOptions (features = "featureFile/DataTableWithoutHeader.feature",glue = "stepDefinitions")
//@CucumberOptions (features = "featureFile/DataTableWithoutHeader.feature",glue = "stepDefinitions")
@CucumberOptions (features = "featureFile",
glue = {"stepDefinitions", "hook" },
dryRun = false, monochrome = true, 
tags = {"@Hooks"})
public class RunnerClass {
	

	

}
