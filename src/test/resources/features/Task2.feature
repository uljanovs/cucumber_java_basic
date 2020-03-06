Feature: Task2
  As a User I want to be able work with data on the page

  Background:
    Given I am on People with jobs page

  @working_1
  Scenario:
    Given I am on People with jobs page
    When I click AddPerson button
    And I type name: "Jennifer"
    And I enter job: "Actress"
    And I press Add
    Then I press reset list

  @working_2
  Scenario Outline:
    When I click EditPerson button
    And I edit name: "<name>"
    And I edit job: "<job>"
    And I press Edit
    Then I reset list

    Examples:
      | name  | job       |
      | nick  | boss      |
      | kevin | assistant |

  @working_3
    When I click DeletePerson button
    And I check list
  #  Then I press reset