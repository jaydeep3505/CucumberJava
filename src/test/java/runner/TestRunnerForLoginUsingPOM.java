package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features/LoginDemo.feature"},
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty","html:target/Htmlreports",
                "json:target/JSONReports/report.json",
                "junit:target/JUNITReports/report.xml"})
public class TestRunnerForLoginUsingPOM {

}