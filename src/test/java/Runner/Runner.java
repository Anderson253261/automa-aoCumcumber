package Runner;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions (features = "src/test/resources/Feature",glue = "steps", tags = "@tag1",
plugin = {"pretty","html: Evidenciahtml/flashcode.html"}, monochrome = true,dryRun = false)
public class Runner {

}
