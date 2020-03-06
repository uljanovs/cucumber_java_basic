Feature: As an end user I need a Google search feature

  Background I am on Google page

  @cat @rat
  Scenario Outline: As an end user I can search cats using the google
    Given I am on Google page
    When I Click on Search Field
    And I Enter: "<searchvalue>"
    And I Click on Search Button
    Then I see: "<result>"
    Examples:
      | searchvalue | result |
      | Cat         | Cat   |
      | Rat         | Rat   |

