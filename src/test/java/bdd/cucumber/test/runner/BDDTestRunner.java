package bdd.cucumber.test.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        features = {"src/test/resources/inventoryBDDtest.feature"},
        glue = {"bdd.cucumber.test"})
@Tag("E2ETest")
public class BDDTestRunner  {

}
