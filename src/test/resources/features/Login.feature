@Login
Feature: Login

  Scenario: Login Steps
#     I setup with Chrome Browser
    Given I launch URL "https://www.linkedin.com/login"
    And I enter username "anil"
    And I enter password "admin@123"
    When I verify button "Login" is present
    Then I click on button "Login"


#    And I verify
#    Given , And, When, Then