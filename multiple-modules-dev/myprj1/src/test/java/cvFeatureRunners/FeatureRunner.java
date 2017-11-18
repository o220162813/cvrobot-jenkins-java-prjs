package cvFeatureRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Stephen C-F Lin on 2017/10/8.
 */

@CucumberOptions(
        features = {"src/test/resources/cvFeatures/"},
        glue = {"cvStepDefinitions/"},
        tags = {"@performTC1"},
        format = {"pretty","html:target/cvRobot-RawHtmlResult1","json:target/cvRobot-RawJsonResult/report1.json"}
)

public class FeatureRunner extends AbstractTestNGCucumberTests {
}
