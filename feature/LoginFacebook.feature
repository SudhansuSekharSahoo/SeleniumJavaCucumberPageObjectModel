@test
Feature: Login to Facebook page test

  Scenario: user able to login to Facebook page page using correct credentials
    Given user is on facebook login page
    When user enters username and password as credential
    Then user sees the facebook homepage
    And user post the status message