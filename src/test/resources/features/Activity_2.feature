Feature: As an user I need a Google search feature

  @activity
  Scenario: As an user I can search cats using the google
    Given I am on google search page
    When I find search field
    And I enter word cat
    And I press search button
    And I see list with cats
    And I see pictures
    Then I found a cat



