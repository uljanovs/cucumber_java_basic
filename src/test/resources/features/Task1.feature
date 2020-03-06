Feature: Testing "Enter the number" Web Application
  As an end user I need to calculate square roots of numbers from 50 to 100

  Background:
    Given I am on the application page

  Scenario Outline: As a user I can enter invalid values
    When I enter "<input>"
    And I press Submit button
    Then I see an "<error>"
    Examples:
    |input|error                |
    |49   |Number is too small  |
    |101  |Number is too big    |
    |Text |Please enter a number|

  Scenario:
    When I enter "100"
    And I press Submit button
    Then I see an alert