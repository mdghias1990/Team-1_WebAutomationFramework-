package cucumberRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
  features = {"src/test/featurefile/"},
   glue = { "stepDefination"},
    strict = true,
    monochrome = true,
    tags = {},
    plugin = { "pretty", "json:target/cucumber-reports/cucumber.jason","html:target/cucumber-reports"}


)

public class HomePageRunner extends AbstractTestNGCucumberTests {

}
