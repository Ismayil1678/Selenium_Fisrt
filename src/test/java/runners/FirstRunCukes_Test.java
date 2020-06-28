package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Instructs junit to run this class as a Cucumber test runner
@CucumberOptions(
        dryRun = false, // executes the features and validates whether features exist without failing
        features = "classpath:Features", //location of the features file folder
        glue = {"stepDefs"}, //location of the step definition classes
        tags = "@controlgroupheader",
        plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json"}
)




public class FirstRunCukes_Test {
}
