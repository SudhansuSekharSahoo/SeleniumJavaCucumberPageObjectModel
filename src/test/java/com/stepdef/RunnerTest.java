package com.stepdef;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"feature"},glue = {"com.stepdef"}, publish=true, tags = "@test")
public class RunnerTest extends AbstractTestNGCucumberTests{

}
