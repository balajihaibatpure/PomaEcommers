Feature: Login Logout Action

  Background: 
    Given User is on the home pageA
    Then user click on alertB

  @tag1
  Scenario: User login and open poma his account with valid credential
    When User clicks on the login sectionA
    And User logs in with username "9730079029"
    And User enter password "BAla@123"
    Then User should be successfully logged

  @tag2
  Scenario: User login and open poma his account with invalid credential
    When User clicks on the login sectionB
    And User logs in with username1 "97300790"
    And User enter password1 "BAla@678"
    Then User should be unsuccessfully logged

  @tag3
  Scenario: User logout his account successfully
    When User clicks on the login sectionC
    And User logs in with username "9730079029"
    And User enter password "BAla@123"
    Then User should be successfully logged
    Given User click on his profile name
    And User select the logout button
