Feature: As an end user I need a Google search feature for all Animals I like
  Background:
    Given I am on Google page


  Scenario Outline: As an end user I can search my favorite animals using the google
    When I enter: "<animal>" in search field
    And I search
    Then I see results
    @smoke_cat
    Examples:
      | animal |
      | cat    |
      | rat    |
    @regression_cat
    Examples:
      | animal |
      | frog   |
      | pig    |
