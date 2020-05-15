package com.vamUI.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "pretty"
        },
        tags = "@login",
        features = { "src/test/resources/features" },
        glue = { "com/vamUI/step_definition" },

        dryRun = false
)
public class CukesRunner {

}
