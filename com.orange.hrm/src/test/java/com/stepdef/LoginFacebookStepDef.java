package com.stepdef;

import org.testng.annotations.Test;

import com.facebook.pageobject.LoginFaceBookPage;
import com.facebook.utility.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Test
public class LoginFacebookStepDef {

	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
		LoginFaceBookPage facebookloginPage = new LoginFaceBookPage(TestBase.driver);
		facebookloginPage.launch();
	}

	@When("^user enters username and password as credential$")
	public void user_enters_username_and_password_as_credential() throws Throwable {
		LoginFaceBookPage facebookloginPage = new LoginFaceBookPage(TestBase.driver);
		facebookloginPage.enterUserNameAndPassword();
		facebookloginPage.clickLogInBtn();
	}

	@Then("user sees the facebook homepage")
	public void user_sees_the_facebook_homepage() {
		LoginFaceBookPage facebookloginPage = new LoginFaceBookPage(TestBase.driver);
		facebookloginPage.verifyFaceBookHomePageDisplayed();
	}
	
	@Then("user post the status message")
	public void postStatusMessage() {
		LoginFaceBookPage facebookloginPage = new LoginFaceBookPage(TestBase.driver);
		facebookloginPage.postStatusMessage();
	}
	
}
