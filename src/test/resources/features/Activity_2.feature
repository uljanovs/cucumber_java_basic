Feature: As an end user I need a Google search feature

  @cat
  Scenario: As an end user I can search cats using the google
    Given I am on Google page
    When I Click on Search Field
    And I Enter Cat
    And I Click on Search Button
    Then I see Cats

