Feature: As a user I need to edit a list

  Background:
    Given I open the page

  @first
  Scenario Outline: As a user I add a new person
    When I press add person button
    And  I see new page
    And I add  new name "<name>"
    And I add new job title "<job>"
    And I press add button
    And I redirect on main page
    And I see new "<name>" and new "<job>" there
    And I reset list button
    Then I don't see new person

    Examples:
      | name | job     |
      | Ivan | driver  |

  @second
  Scenario: As a user I edit a person
    When I press edit button
    And I see person page
    And I change person name
    And I change job title
    And I press new edit button
    And I am on main page
    And I check edition name "John" and title "manager"
    And I reset a page
    Then I check result name "Mike" and title "Web Designer"

@Third
  Scenario: As a user I remove a person
    When I press remove button
    And I see the result
    And I reset list
    Then I see new list

@Fourth
  Scenario: A a user I clear field with new person
    When I click to add person button
   And I open a new page
    And I input a new name "Semen"
    And I input a new job title "manager"
   And I press clear fields button
    And I see clear fields "",""
    Then I press cancel button





