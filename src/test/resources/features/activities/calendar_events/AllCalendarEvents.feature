@calendar_events
Feature: All Calendar Events
  As a user I should be able to see all calendar events as a table

  Scenario: Verify column names
    Given user logs as a store manager
    When user navigate to "Activities" and "Calendar Events"
    Then following table headers should be displayed
      | TITLE             |
      | CALENDAR          |
      | START             |
      | END               |
      | RECURRENT         |
      | RECURRENCE        |
      | INVITATION STATUS |


