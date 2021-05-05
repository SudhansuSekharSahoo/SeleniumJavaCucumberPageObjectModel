package com.stepdef;

import java.util.Map;

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
	@When("user enters username and password as credential")
	public void user_enters_username_and_password_as_credential(Map<String,String> credentials) {
		LoginFaceBookPage facebookloginPage = new LoginFaceBookPage(TestBase.driver);
		facebookloginPage.enterUserNameAndPassword(credentials.get("username"), credentials.get("password"));
	}
	

	@Then("user sees the facebook homepage")
	public void user_sees_the_facebook_homepage() {
		
	}
	
	@Then("user post the status message")
	public void postStatusMessage() {
	}
	
}
