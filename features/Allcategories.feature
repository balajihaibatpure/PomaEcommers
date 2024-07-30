Feature: Allcategoriespage action

  Background: 
    Given User is on the home page1
    Then user click on alert1

  Scenario: User customize product and purchess
    Given User click on allcategoriespage
    And User click on makeup
    And user select lips categories product
    And user click on product
    And user click on buy button
    And User fill mobile number1 "9730079029"
    And User fill password1 "BAla@123"
    And User enter on the submit button1
    Then user create his account successesfully
    Given User click  again on aalcategoriespage
    And User click on again makeup
    And user select agian lips categories product
    And user select the product
    When User click on buy button
    And user select palceorder button
    And user filled all form
    And user select save address button
    When user select cheak box
    And user click on select payment Method
    And user click on cash on delivery
    Then user purchess the cusumize product sccessefully
    ## we work  on feature also
