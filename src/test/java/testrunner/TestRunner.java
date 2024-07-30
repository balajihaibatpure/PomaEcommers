package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\shree\\eclipse-workspace\\Cucumber\\features", // Adjusted path to feature file
    glue = {"stepdefination"}, // Adjusted package name for step definitions
    plugin = {"html:Report/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"})
public class TestRunner {
}
