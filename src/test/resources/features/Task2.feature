Feature: Task2
  As a User I want to be able work with data on the page

  Background:
    Given I am on People with jobs page

  @working_1
  Scenario Outline:
    Given I am on People with jobs page
    When I click AddPerson
    And I type name: "<name>"
    And I type job: "<job>"
    And I press Add
    And I check added name: "<name>"
    And I check added job: "<job>"
    Then I press reset list

    Examples:
      | name  | job       |
      | nick  | boss      |
      | kevin | assistant |

  @working_2
  Scenario:
    When I click EditPerson
    And I edit name: "AJ"
    And I edit job: "QA"
    And I press Edit
    And I check edited name: "AJ"
    And I check edited job: "QA"
    Then I reset list

 @working_3
    Scenario:
    When I click DeletePerson
    And I check persons
    Then I push update

  @working_4
  Scenario:
    When I Add person
    And I input name: "Jennifer"
    And I input job: "Actress"
    And I click clear
    Then I check fields are clear all fields
    And I click cancel
    Then I am on home page