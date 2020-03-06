@regression
Feature: List of People_
  As a user
  I want to look through a List of People, add a person to a list, edit a person and delete a person from the List

  @add
  Scenario Outline: Add Person
    Given I am on People List Page
    When I click on Add Button
    And I fill Name: "<Name>"
    And I fill Surname: "<Surname>"
    And I fill Job: "<Job>"
    And I fill Birth: "<Birth>"
    And I fill Languages
    And I fill Gender
    And I fill Employee Status
    And I click Add
    Then I see Person Added
    And Others are untouched
    And I reset List
    Examples:
      | Name    | Surname | Job           | Birth      |
      | William | Smith   | iOS Developer | 25/03/1987 |
      | Helga   | Scott   | Product Owner | 04/08/1991 |

  @edit
  Scenario: Edit Person
    Given I am on People List Page
    When I click on Edit Button
    And I Clear All Fields
    And I fill Name
    And I click Edit
    Then I see Mike is William
    And Others are untouched
    And I reset List

  @edit @cancel
  Scenario: Cancel Editing Person
    Given I am on People List Page
    When I click on Edit Button
    And I Clear All Fields
    And I fill Name
    And I click Cancel
    Then I see no changes
    And I reset List

  @delete @deleteone
  Scenario: Delete Person
    Given I am on People List Page
    When I click on Delete Mike
    Then I see Mike is Deleted
    And Others are untouched
    And I reset List

  @delete @deleteall
  Scenario: Delete All People
    Given I am on People List Page
    When I click on Delete Mike
    And I click on Delete Jill
    And I click on Delete Jane
    Then I see No List
    And I reset List