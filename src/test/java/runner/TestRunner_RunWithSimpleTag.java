package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureWithTag",
        glue = {"StepDefinitions"},
//        tags = "(@smoke or @regression) and @important"
//        tags = " @regression and not @smoke"
//        tags = "(@smoke or @regression) and not @important"
        tags = "@mustRun"
)

public class TestRunner_RunWithSimpleTag {
}
