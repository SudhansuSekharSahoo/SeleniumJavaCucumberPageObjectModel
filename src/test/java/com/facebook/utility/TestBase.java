package com.facebook.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {

	public static WebDriver driver;

	// Different browser parameter can be passed in testng.xml file for different
	// features
	@Test
	@Parameters("myBrowser")
	public static void webDriverSetup(String myBrowser) {
		System.out.println("@Test Started");
		if (myBrowser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver.exe");
			driver = new ChromeDriver(options);

		} else if (myBrowser.equalsIgnoreCase("firefox")) {

		}
		try {
			commonUtilities.getPropertiesFile(APP_CONSTANT.readPropertiesFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

}
