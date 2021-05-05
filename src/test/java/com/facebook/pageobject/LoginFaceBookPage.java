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


public class LoginFaceBookPage extends TestBase implements launchBrowser {

	WebDriver driver;
	
	public LoginFaceBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//input[@name='email']")
	private WebElement txtBxUsername;

	public WebElement getuserName() {
		return txtBxUsername;
	}

	@FindBy(xpath = ".//input[@name='pass']")
	private WebElement txtBxPassword;

	public WebElement getPassword() {
		return txtBxPassword;
	}

	@FindBy(xpath = ".//button[@name='login']")
	private WebElement btnLogin;

	public WebElement getLoginBtn() {
		return btnLogin;
	}

	@FindBy(xpath = ".//span[contains(text(),'Find Friends')]")
	private WebElement findFriendLink;

	public WebElement getfindFriendLink() {
		return findFriendLink;
	}

	@FindBy(xpath = "//*[@class='m9osqain a5q79mjw jm1wdb64 k4urcfbm']/span")
	private WebElement postTextBx;

	public WebElement getpostTextBx() {
		return postTextBx;
	}

	@FindBy(xpath = "(//div[@role='textbox']/div/div/div)[2]")
	private WebElement createPostTextBx;

	public WebElement getcreatePostTextBx() {
		return createPostTextBx;
	}
	
	@FindBy(xpath = "(.//span[contains(text(),'Post')])[3]")
	private WebElement createPostBtn;

	public WebElement getcreatePostBtn() {
		return createPostBtn;
	}

	public void launch() {
		
		commonUtilities.openURL();
	}

	public void enterUserNameAndPassword(String username, String password) {
		commonUtilities.sendTextToField(getuserName(), username);
		commonUtilities.sendTextToField(getPassword(), password);
		
	}

	public void clickLogInBtn() {
		commonUtilities.clickButton(getLoginBtn());
	}

	public void verifyFaceBookHomePageDisplayed() {
		
		  commonUtilities.waitTillPageLoad();
		  AssertUtils.assertIsDisplayed(getfindFriendLink());
		 
	}

	public void postStatusMessage() {
		  commonUtilities.clickButton(getpostTextBx());
		  commonUtilities.sendTextToField(getcreatePostTextBx(),commonUtilities.properties.getProperty("statusMessage"));
		  commonUtilities.clickButton(getcreatePostBtn());   
	}

}
