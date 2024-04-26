package calculatorv2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features2")
@RunWith(Cucumber.class)
public class RunnerTest {
}
