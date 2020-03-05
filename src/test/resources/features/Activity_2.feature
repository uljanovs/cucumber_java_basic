Feature: Using Google search
  As an end user engineer
  I want to be able to input my search request and perform search
  @google
  Scenario: As an end user I can search cats using google
    Given I am on page
    And I see search field
    When I input cats
    And I click search button
    Then I see request result cats in search field

