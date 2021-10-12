package co.com.choucair.utestchallenge.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resourses/utestchallenge.feature",
        tags = "@CreateUser",
        glue="co.com.choucair.utestchallenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
