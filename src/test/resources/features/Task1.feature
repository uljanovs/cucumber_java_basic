Feature: Task1
  As a User I want to be able to see if those numbers are correct for the form

  Background:
    Given I am on Enter a number page

  @not_working
  Scenario Outline: a new scenario outline
    When I enter a value: "<value>"
    And I click submit
    Then I see error message: "<message>"
    Examples:
      | value | message               |
      | 9     | Number is too small   |
      | 150   | Number is too big     |
      | text  | Please enter a number |

  @working
  Scenario:
    Given I am on Enter a number page
    When I enter a value: "81"
    And I click submit
    Then I see alert: "Square root of 81 is 9.00"

