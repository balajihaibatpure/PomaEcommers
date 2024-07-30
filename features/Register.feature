Feature: user want to register his on pumo E-commerss website

  Scenario: user complete his registration
    Given user on pumo home page
    And user enter on alert
    When User click on register
    And User Enter the name "raju"
    And User Enter the number "9730079029"
    And User Enter the mail "balajiahaiabatpure@gmail.com"
    And User Enter the password "BAla@123"
    And User Enter the conformpassword"BAla@123"
    And User click on submit button
    Then User complete his registration jurany successfully
