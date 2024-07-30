Feature: Home Page Actions

  Background: 
    Given User is on the home page
    Then user click on alert

  Scenario: Perform Shopping Journey
    When User searches for "Fashion Colour Studio Finish HD Powder Palette"
    And user click on searchproduct
    Then User clicks on a product photo
    When user click on cart
    When User enters mobile number "9730079029"
    And User enters password "BAla@123"
    And User clicks on the submit button

  Scenario: perfrom shopping with anoter product
    And User click on spectrumimg product
    When User click on buy
    And User fill mobile number "9730079029"
    And User fill password "BAla@123"
    And User enter on the submit button
    Then User click on a spectrumimg product photo
    And User again Click on buy
    When User click on palce order button
    Then User filled all form
    And User click on saveaddress button
    When User click on radio button
    And user click on select payment Method1
    Then User click on place order 2
