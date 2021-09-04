package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="D:\\SELENIUM WORKSPACE\\BDDCucumberPageObject1\\src\\test\\resources\\FeatureFile\\CustomerRegistration.feature"
,glue="stepDefination"
,monochrome=true
,publish=true)

public class RunnerTest {

}
