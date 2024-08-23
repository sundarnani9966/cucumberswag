Feature: Login page Automation of saucedemo App

  Scenario Outline: Check login is successful with valid creds
    Given user is on login page
    When user enters valid "<username>" and "<password>"
    And Clicks on Login Button
    Then user is navigated to Home page
    And Close the browser

    Examples: 
      | username                | password     |
      | standard_user          | secret_sauce  |
      
    