Feature: As a user I need to calculate some values

  Background:
    Given I open a page


  @error
    Scenario Outline:As an user I input incorrect values
    And I see empty calculation field
      When I input an incorrect value "<value>"
      And I press a search button
      Then I see the error message "<result>"

      Examples:
      |value|result|
      |48  |Number is too small|
      |101|Number is too big|
      |Hi!|Please enter a number|

@correct
  Scenario: As a user I enter correct value
        When I input correct value 100
        And I press search button again
        And I see alert message with text