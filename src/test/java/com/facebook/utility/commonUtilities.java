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

	public static void openURL() {
		TestBase.driver.get(TestBase.properties.getProperty("qaurl"));
		waitTillPageLoad();
	}

	public static void sendTextToField(WebElement element, String text) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 20, 5);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}

	public static void click(WebElement element) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 20, 5);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void waitTillPageLoad() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").equals("complete");
	}
}
