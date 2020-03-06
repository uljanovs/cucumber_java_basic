Feature: I test numbers
  Background:
    Given I am on numbers page


  @ecases
  Scenario Outline: I enter error cases
    When I enter number: "<number>"
    And I click submit
    Then  I confirm error message "<expected>"
       Examples:
      | number | expected              |
      | 14     | Number is too small   |
      | 777    | Number is too big     |
      | abc    | Please enter a number |


    @pcases
    Scenario: I test positive cases
      When I enter number: "64"
      And I click submit
      Then  I confirm correct alert