@VYT-2141
Feature: As user I want to login with different roles
#   We don't need this step anymore it will come from hook-before
#    Background:
#      Given user is on the landing page

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

  @map_example
  Scenario: Login as different users
    Given user logs in with the following credentials
      | username | salesmanager101 |
      | password | UserUser123     |
    Then  user navigate to "Fleet" and "Vehicles"
    And  user verifies that "All Cars" page name is displayed

  @login_1
  Scenario Outline: login as different user test
    Given user logs in as a "<user_type>"
    And user verifies that "<page name>" page name is displayed

    Examples:
      | user_type     | page name       |
      | driver        | Quick Launchpad |
      | sales manager | Dashboard       |
      | store manager | Dashboard       |

  @login_with_outline_2
  Scenario Outline: User names test
    Given user logs in with the following credentials
      | username | <username> |
      | password | <password> |
    Then Credentials information be "<name>"

    Examples: Credentials information
      | username        | password    | name             |
      | user187         | UserUser123 | Jerel Vandervort |
      | user200         | UserUser123 | Lonzo Leuschke   |
      | storemanager52  | UserUser123 | Roma Medhurst    |
      | storemanager66  | UserUser123 | Carlos Ernser    |
      | salesmanager125 | UserUser123 | Cleveland Heller |
      | salesmanager140 | UserUser123 | Jameson Paucek   |