@create_car
Feature: Create a Car
  As user I want to be able to create a car

  Scenario: Create a regular car
    Given user logs in as a "sales manager"
    Then  user navigate to "Fleet" and "Vehicles"
    And  user verifies that "All Cars" page name is displayed
  Then user c;ocl on the create a car button
    And user enters car information:
      | License Plate | HELLO |
      | Driver        | Ben   |
      | Model Year    | 2020  |
      | Make          | Tesla |
    Then user clicks save and close
    And user verifies that general information is displayed

