@test
Feature: Login to Facebook page test

  Scenario: user able to login to Facebook page page using correct credentials
    Given user is on nopcommerce login page
    When user clicks on login 
    Then user is redirected to login page
