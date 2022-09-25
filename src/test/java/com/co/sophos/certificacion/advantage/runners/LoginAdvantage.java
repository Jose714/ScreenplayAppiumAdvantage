package com.co.sophos.certificacion.advantage.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login_advantage.feature",
        glue = "com.co.sophos.certificacion.advantage.stepdefinitions",
        snippets = SnippetType.CAMELCASE)


public class LoginAdvantage {
}
