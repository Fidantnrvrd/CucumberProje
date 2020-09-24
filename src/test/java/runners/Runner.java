package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},// rapor oluşturmak için
        features = "src/test/resources/features",  // features klasörünün adresini
        glue = "stepdefinitions", // testlerinin içerisinde olduğu paketin ismi
        tags = "@walmart", //sectiginiz tag'a ait testler calistirilir.
        dryRun = false // senaryoda olusturdugumuz anca henuz test methodu yazilmamis
                       // olan adimlarin(steps) methodlarini consol'da gormek icin "dryRun = true
                       // seklinde kullaniyoruz.

        // dryRun = false

)

public class Runner {

}
