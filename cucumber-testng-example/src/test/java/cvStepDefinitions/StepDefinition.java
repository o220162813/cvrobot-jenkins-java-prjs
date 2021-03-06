package cvStepDefinitions;

import cucumber.api.java.en.Given;
import org.testng.Assert;

/**
 * Created by Stephen C-F Lin on 2017/10/8.
 */
public class StepDefinition {

    @Given("^Tester logs on to the \"([^\"]*)\" \"([^\"]*)\" system$")
    public void givenTesterAccess(String varargin1, String varargin2) throws Throwable {
        System.out.println("Tester access reached");
        System.out.println(varargin1);
        System.out.println(varargin2);

        if(varargin1.equalsIgnoreCase("21")) {
            Assert.fail();
        }
        
    }
}
