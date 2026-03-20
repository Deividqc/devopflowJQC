package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // Busca archivos .feature en src/test/resources/features
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps") // <--- PAQUETE de tus Steps
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:build/reports/cucumber/report.html")



//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
    glue="steps",
    plugin = {"pretty", "html:target/cucumber-reports"},
    tags ="@Navigation"
)

public class TestRunner {
@AfterClass
public static void cleanDriver(){
    BasePage.closeBrowser();
}

}
