Feature: As user I want to login with different roles


  Scenario: Login as a store manager
    Given user is on the landing page
    When user logs as a store manager
    And user verifies that "Dashboard" page name is displayed
    @negative
    Scenario: Verify warning message for invalid credentials
      Given user is on the landing page
      When user logs in with "wrong" username and "wrong" password
      And verify that "Invalid user name or password." warning message is displayed
      Then close browser