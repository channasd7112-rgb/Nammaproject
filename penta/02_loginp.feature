Feature: Login Functionality
  @Smoke
  Scenario: To verify login functionality with valid credentials
    Given User has opened the browser and launched  application
    When User enters the valid Email ID
    And User enters the valid Password
    And User clicks on the Login button
    Then User should be logged the successfully