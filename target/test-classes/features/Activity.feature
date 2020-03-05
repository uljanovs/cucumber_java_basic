Feature: tests for performing search
  As an end user I need to use a Google search

  @cat
  Scenario: As an end user I can search cats using Google
    Given I am on google page
    When I enter cute cats to the search field
    And I press Search button
    Then I should see search results

