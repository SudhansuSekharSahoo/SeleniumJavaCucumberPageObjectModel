package com.facebook.utility;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertUtils {

	public static void assertIsDisplayed(final WebElement element) {
		if (!element.isDisplayed()) {
			throw new AssertionError("Expected element" + element + "should be visible : but not visible");
		} else {
			Assert.assertTrue(element.isDisplayed());
		}
	}
}
