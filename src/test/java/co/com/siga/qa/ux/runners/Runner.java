package co.com.siga.qa.ux.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/.../",
        glue = "co.com.siga.qa.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {}