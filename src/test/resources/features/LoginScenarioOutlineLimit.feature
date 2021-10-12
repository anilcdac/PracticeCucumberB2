@Loginlimit
Feature: Login

  Scenario Outline: Login Steps
#     I setup with Chrome Browser
    Given I launch URL "https://www.linkedin.com/login"
    And I enter username "<username>"
    And I enter password "<password>"
    When I verify button "Login" is present
    Then I click on button "Login"
    Examples:
      |Success  | username | password|
      | user1    |anil       | admin@123|
      | user2   |viraj       | admin@123|
#      | user3  |umesh       | admin@123|

  Scenario: Fill Form
  Given I enter name
  And I enter address
  
  Scenario: Logout and Tear down
  Given I logout
  And I teardown

#    And I verify
#    Given , And, When, Then