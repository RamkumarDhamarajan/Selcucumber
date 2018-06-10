package createLead;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions (features="src/main/java/createLead/CreateLead.feature",
glue="createLead",monochrome=true)

@RunWith (Cucumber.class)
public class RunTest {

}
