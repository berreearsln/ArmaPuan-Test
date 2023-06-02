package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"src/test/java/armapuanTest/myStepDef"},
        features = {"src/test/java/resources.Scenarios/testScenarios.feature"})


public class runTest {
}