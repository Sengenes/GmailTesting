package gmailLogin.GmailTesting;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "src/test/java/demo.feature", format = {"pretty", "html:target/reports"})

public class RunnerClass {

}
