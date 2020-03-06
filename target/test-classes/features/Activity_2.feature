Feature: As an user I need a Google search feature
Background:
  Given I am on google search page

  @animal
  Scenario Outline: As an user I can search cats using the google
    When I find search field
    And I enter search criteria "<criteria>"
    And I press a search button
   Then I see list with cats

    Examples:
      | criteria |
      | cat|
      | rat|




