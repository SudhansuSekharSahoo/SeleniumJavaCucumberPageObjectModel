package com.stepdef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.facebook.utility.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends TestBase {

	@Before
	
	public void setUp() {
		//Can be used to inizilize database connection, SauceLab/Broswer stack connection
		System.out.println("Before hook");
	}
	
	
	@After
		public void tearDown(Scenario scenario) {
		   // if (scenario.isFailed()) {
		            //final byte[] screenshot = ((TakesScreenshot) TestBase.driver)
		                       // .getScreenshotAs(OutputType.BYTES);
		           // scenario.attach(screenshot, null, null); //stick it in the report
		   // }
		    driver.quit();;
		}
    }

