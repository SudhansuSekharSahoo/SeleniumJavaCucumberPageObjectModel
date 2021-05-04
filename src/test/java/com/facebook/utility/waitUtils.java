package com.facebook.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUtils extends TestBase{
	
	public void waitTillVisibilty(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void pause(int timeToPause) {
		try {
			Thread.sleep(timeToPause);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
