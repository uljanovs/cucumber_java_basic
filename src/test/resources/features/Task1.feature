
@TaskOne
Feature:
  As a test engineer
  I want to be able to write and execute a simple scenario

  Background:
    Given I am on the page "Enter a number"

  Scenario Outline:
    When I enter too small number: <too small number>
    And I press Submit button
    Then Error is shown: "Number is too small"
    When I enter too big number: <too big number>
    And I press Submit button again
    Then I see error for too long numbers: "Number is too big"
    When I enter text: <text>
    And I press Submit button one more time
    Then I see error: "Please enter a number"

    Examples:
      |too small number|too big number| text        |
      | 4              |101           |number       |
      | 45             |1000          |abracadabra  |
      | 30             |1200          |spring       |
      | 15             |340           |Bootcamp     |

    Scenario:
    When I enter number: 68
    And I press Submit
    Then Square root for this number is shown
    And I click Ok
