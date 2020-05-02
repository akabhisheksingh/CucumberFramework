package runner;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pavilion\\Desktop\\Selenium Tutorial Package\\CucumberBasic\\src\\test\\java\\Feature",
glue="stepDefinition", tags="@SeleniumTest",plugin= {"pretty","html:target/testReport"}, monochrome=true,strict=true)
/*@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pavilion\\Desktop\\Selenium Tutorial Package\\CucumberBasic\\src\\test\\java\\Feature",
glue="stepDefinition", tags="@RegTest, @SmokeTest")*/

//-------Controlling the test case by "tags"--------
/*
 * @CucumberOptions(
 * features="C:\\Users\\pavilion\\Desktop\\Selenium Tutorial Package\\CucumberBasic\\src\\test\\java\\Feature"
 * , glue="stepDefinition", tags="@SmokeTest")
 */

public class TestRunnerSignup {

}
