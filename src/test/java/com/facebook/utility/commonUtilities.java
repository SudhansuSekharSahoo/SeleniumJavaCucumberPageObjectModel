package com.facebook.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonUtilities extends TestBase {
	public static Properties properties;

	public static void openURL() {
		TestBase.webDriverSetup("chrome");
		TestBase.driver.get(commonUtilities.properties.getProperty("qaurl"));
	}

	public static void getPropertiesFile(String pathOFile) throws Exception {
		File file = new File(pathOFile);
		if (file.getName().endsWith(".properties")) {
			properties = new Properties();
			InputStream fis = null;
			fis = new FileInputStream(file);
			properties.load(fis);
		} else {
			throw new Exception("Properties file not found");
		}
	}

	public static void sendTextToField(WebElement element, String text) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 1000, 500);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}

	public static void clickButton(WebElement element) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 1000, 500);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void waitTillPageLoad() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").equals("complete");
	}
}
