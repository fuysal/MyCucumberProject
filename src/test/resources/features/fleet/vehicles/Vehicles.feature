@vehicles
Feature: Navigation menu options
  As a user I want to use top menu for navigation

  Scenario: Login as driver and navigate to the Vehicles
    Given user is on the landing page
    When user logs in as a "driver"
    Then  user navigate to "Fleet" and "Vehicles"
    And  user verifies that "Cars" page name is displayed
    And user verifies that defaul page number is 1