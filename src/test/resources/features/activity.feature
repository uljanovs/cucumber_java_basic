Feature: I google stuff



@cat
  Scenario: As and end user I can search cats using google

    Given I am on googling page
    And I enter search phrase: "cat"
    And I click search
    Then  I confirm i searched for: "cat"
    And I look at cats for 10 seconds
    And I go back
    Then I confirm im in google