package cucumber_project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,
features="C:\\Users\\saranyant\\NewCucumber\\cucumber_project", glue="Stepdef",
format={"pretty","html:reports","json:target/Runcuke/cucumber.json"},tags="@tag1")

public class Runner {

}
