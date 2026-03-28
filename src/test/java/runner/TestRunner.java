package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
    glue="steps",
    plugin = {"pretty", "json:build/cucumber-report.json","html:build/cucumber-reports"},
    tags ="@Navigation"
)

public class TestRunner {
@AfterClass
public static void cleanDriver(){
    BasePage.closeBrowser();
}

}
