package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@hotelroomedit", // {"@tag1", "@tag2", "@tag3"} veya {"@tag1" or "@tag2" or "@tag3"}
        dryRun = false
)

public class KoalaPalaceRunner {

}
