Feature: square root of number

  Background:
    Given user is on the number page

  Scenario Outline: User enters invalid inputs
    When i enter"<invalid_value>"
    And i click submit
    Then i see error message "<error>"
    Examples:
      | invalid_value | error                 |
      | 10            | Number is too small   |
      | 110           | Number is too big     |
      | abc           | Please enter a number |

  Scenario: user enters valid input
    When i enter valid value: "64"
    And i click submit
    Then i see result: "Square root of 64 is 8.00"