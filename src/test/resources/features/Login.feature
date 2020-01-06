Feature: As a user I want to login with different roles

  Scenario: Login as "driver" (negative)
    Given Open Vytrack login page
    When Enter valid username and invalid password information
    And Click login
    Then Message Invalid user username or password. should be displayed
    And Page title and url should be same
