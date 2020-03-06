
Feature: Task1 computing of square root
  As a test engineer
  I want to be able to input different values and check if application can correctly compute square roots
Background:
  Given I am on app page

  @incorrectcase
  Scenario Outline: negative scenario outline for square root

    When I enter value: "<input>"
    And I click submit button
    Then I see error message: "<message>"

    Examples:
      | input  | message             |
      | 36    | Number is too small  |
      | 121   | Number is too big    |
      | ololo | Please enter a number|

  @correctcase
  Scenario: positive scenario for square root

    When I enter value: "81"
    And I click submit button
    Then I see alert