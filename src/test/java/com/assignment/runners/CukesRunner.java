package com.assignment.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-html-reports"},
        features = "src/test/resources/features",
        glue = "com/assignment/step_definitions",
        dryRun = false,
            tags = "@Done"
)
public class CukesRunner {
}
