package com.facebook.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.facebook.utility.AssertUtils;
import com.facebook.utility.TestBase;
import com.facebook.utility.commonUtilities;
import com.facebook.utility.waitUtils;

public class ecomLoginPage extends TestBase implements launchBrowser {

	WebDriver driver;

	public ecomLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//a[contains(text(),'Log in')]")
	private WebElement lnkloginin;

	public WebElement getlinkloginin() {
		return lnkloginin;
	}

	@FindBy(xpath = ".//div[@class='page-title']/h1")
	private WebElement txtPageTitleMessage;

	public WebElement gettxtPageTitleMessage() {
		return txtPageTitleMessage;
	}

	public void launch() {

		commonUtilities.openURL();
	}

	public void clickLogInBtn() {
		commonUtilities.click(getlinkloginin());
	}

	public void verifyLoginPageDisplayed() {
		commonUtilities.waitTillPageLoad();
		AssertUtils.assertTextMatches(gettxtPageTitleMessage(),
				commonUtilities.properties.getProperty("welcomeMessage"));
	}

}
