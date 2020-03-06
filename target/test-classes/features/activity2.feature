Feature: I google stuff2
   Background:
    Given I am on googling page

  @rat
  Scenario: As and end user I can search rats using google
    And I enter search phrase: "rat"
    And I click search
    Then  I confirm i searched for: "rat"
    And I go back
    Then I confirm im in google

    @animals
  Scenario Outline: I google more than 1 item
    When I enter search phrase: "<animal>"
    And I click search
    Then  I confirm i searched for: "<animal>"
    And I go back
    Then I confirm im in google
    Examples:
      | animal |
      | cat    |
      | rat    |