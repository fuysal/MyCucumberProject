package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions  (
        // to spesify where are the features
        features = {
                "src\\test\\resources\\features"
        },

        //where are the implementations for the features
        //features contain scenarios, every scenario is like a test
        glue = {
                "com\\vytrack\\step_definitions\\LoginStepDefinitions.java"
        },
        // dry run to generate step definitions automatically
        dryRun = true
)
public class CukesRunner {

}
