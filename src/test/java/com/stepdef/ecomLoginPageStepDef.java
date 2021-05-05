package com.stepdef;

import java.util.Map;

import org.testng.annotations.Test;

import com.facebook.pageobject.ecomLoginPage;
import com.facebook.utility.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Test
public class ecomLoginPageStepDef {

	ecomLoginPage ecomlp = new ecomLoginPage(TestBase.driver);

	@Given("user is on nopcommerce login page")
	public void user_is_on_nopcommerce_login_page() {
		ecomlp.launch();
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		ecomlp.clickLogInBtn();
	}

	@Then("user is redirected to login page")
	public void user_is_redirected_to_login_page() {
		ecomlp.verifyLoginPageDisplayed();
	}

}
