package com.stepdef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.facebook.utility.TestBase;
import com.facebook.utility.commonUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {

	@Before
	public void openBrowser() {
		TestBase.intilize();
		TestBase.initDriver(TestBase.properties.getProperty("browser"));
	}

	@After
	public void tearDown(Scenario scenario) {
		
		TestBase.driver.quit();

	}
}
