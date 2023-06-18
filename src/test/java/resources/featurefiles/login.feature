Feature: User Login
  As a registered user I want to log into the website
  so that I can access my account

  @regression
  Scenario: User should not login with Invalid Credentials
    Given I am on the home page
    When I click on the Login icon from top bar
    And I enter Invalid credentials for '<Email>' and '<Password>'
    And click on the login button
    Then I should not be logged in successfully
    And I should see the error message