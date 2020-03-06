Feature: I test numbers

  Background:
    Given I am on People with jobs page


  @addperson
  Scenario Outline: I add a new person and reset list
    When I press add person button
    And I enter the name: "<name>"
    And I enter job: "<job>"
    Then  I press add
    And I check that person is added: "<name>" "<job>"
    Then I reset list
    Examples:
      | name | job     |
      | john | janitor |
      | jane | cleaner |

  @editperson
  Scenario: I edit person
    When I press edit button
    And I edit name: "NewName"
    And I edit job: "NewJob"
    Then I press edit
    And I check that person is edited: "NewName" "NewJob"
    Then I reset list

  @removeperson

  Scenario: I remove person
    When I press remove person
    And I check that person is removed
    Then I reset list

  @clear

  Scenario: I check Clear all fields button
    When I press add person button
    And I enter the name: "John"
    And I enter job: "Janitor"
    Then I click clear all fields
    And I check that fields are empty
    Then I click cancel
