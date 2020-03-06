Feature: As an end user I need a Google search feature

  Scenario: As an end user I can search cats using the google
    Given I am on Google page
    When I enter search criteria: "Cats"
    And I search
    Then I see results

  Scenario: As an end user I can search cats using the google
    Given I am on Google page
    When I enter search criteria: "Rats"
    And I search
    Then I see results