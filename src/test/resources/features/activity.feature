Feature: I google stuff



 # Background:
  #  Given I am on googling page

@cat
  Scenario: As and end user I can search cats using google
    Given I am on googling page
    And I enter search phrase: "cat"
    And I click search
    Then  I confirm i searched for: "cat"
    And I look at cats for 10 seconds
    And I go back
    Then I confirm im in google

  @rat
  Scenario: As and end user I can search rats using google
    Given I am on googling page
    And I enter search phrase: "rat"
    And I click search
    Then  I confirm i searched for: "rat"
    And I look at cats for 10 seconds
    And I go back
    Then I confirm im in google


  Scenario Outline: I google more than 1 item
    When I enter search phrase: "<animal>"
    And I click search
    Then  I confirm i searched for: "<animal>"
    And I look at cats for 10 seconds
    And I go back
    Then I confirm im in google

    Examples:
      | animal |
      | cat    |
      | rat    |

