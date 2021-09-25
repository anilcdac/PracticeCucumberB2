@Login
Feature: Login

  Scenario: Login Steps
#     I setup with Chrome Browser
    Given I launch URL "https://www.google.com/"
    And I enter username "anil"
    And I enter password "pwd"
    When I verify button "Login" is present
    Then I click on button "Login"

    And I ver
#    Given , And, When, Then