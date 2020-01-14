@VYT-2141
Feature: As user I want to login with different roles

    Background:
      Given user is on the landing page

  @storemanager
      Scenario: Login as a store manager
        When user logs as a store manager
        And user verifies that "Dashboard" page name is displayed

      @negative
      Scenario: Verify warning message for invalid credentials
        When user logs in with "wrong" username and "wrong" password
        And verify that "Invalid user name or password." warning message is displayed

      @driver
      Scenario: Login as a driver
        When user logs in as a driver
        And user verifies that "Quick Launchpad" page name is displayed

