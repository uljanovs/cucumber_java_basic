
Feature: Task2 List of people with jobs
  As a test engineer
  I want to be able to enter web app and check if it works correctly
  Background:
    Given I am on application page

  @addperson
  Scenario Outline: Adding a person

    When I click on Add person button
    And I am on Add person page
    And I input name: "<name>"
    And I input job: "<job>"
    And I click Add button
    Then I check that new person has:  "<name>" "<job>"
    And I reset person list

    Examples:
      | name  | job      |
      | John  | Manager  |
      | Peter | Doctor   |


  @editperson
  Scenario: Editing a person

    When I click Edit sign
    And I am on Edit page
    And I edit name: "Jack"
    And I edit job: "Stylist"
    And I click Edit button
    Then I check that edited person has:  "Jack" "Stylist"
    And I reset person list

    @removeperson
    Scenario: Removing a person

      When I click Remove sign
      Then I check that the person is removed
      And I reset person list

@clearbutton
Scenario: Clear button functionality

  When I click on Add person button
  And I am on Add person page
  And I input name: "Victor"
  And I input job: "Drummer"
  And I click Clear button
  Then I check that fields are empty
  And I click Cancel
  And I am on application page