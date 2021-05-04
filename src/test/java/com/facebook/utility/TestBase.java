package com.facebook.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {

	public static WebDriver driver;
	public static Properties properties = null;

	public static void intilize() {
		File file = new File(System.getProperty("user.dir") + "/src/test/resources/qa/TestData.properties");
		if (file.getName().endsWith(".properties")) {
			properties = new Properties();
			InputStream fis = null;
			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				properties.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Exception while initializing properties files.");
		}
	}

	public static void initDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver.exe");
			driver = new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("Firefox");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

}
