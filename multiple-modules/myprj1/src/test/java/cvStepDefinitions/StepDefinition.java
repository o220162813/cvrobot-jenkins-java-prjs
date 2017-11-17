package cvStepDefinitions;

import cucumber.api.java.en.Given;
import main.Main;
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

        if(varargin1.contains("21")) {
            Assert.fail();
        }

        Main mytestmain = new Main();
        mytestmain.main(null);
    }
}
