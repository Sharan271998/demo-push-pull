package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", dryRun = true, features = "src\\test\\resources\\Features", stepNotifications = true, glue = "com.stepDefinition", monochrome = true, plugin = {
		"pretty" })

public class TestRunner {

}
