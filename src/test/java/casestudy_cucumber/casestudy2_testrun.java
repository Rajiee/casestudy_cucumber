package casestudy_cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\A08019DIRP_C2B.02.14\\workspace\\casestudy_cucumber\\src\\resources\\java\\casestudy2.feature",
plugin={"html:target/Reports"}
)
public class casestudy2_testrun {
  
}
