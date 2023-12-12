package co.wedevx.digitalbank.automation.ui.runners;

import org.junit.platform.suite.api.*;
//import io.cucumber.junit.platform.engine.Cucumber;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("ui/features")
@ConfigurationParameter(key=GLUE_PROPERTY_NAME, value = "co.wedevx.digitalbank.automation.ui.steps")
@IncludeTags("Test")
//@Cucumber
//@CucumberOptions(plugin = {"json:target/cucumber.json"})
public class UiRegressionRunner {
}
