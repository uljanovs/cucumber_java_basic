
@TaskTwo

Feature:
  As a test engineer
  I want to be able to write and execute a simple scenario

  Background:
    Given I am going to the page "People with jobs"


  Scenario Outline: Edit and add new person
    When I click Edit button
    Then I am redirected to "edit person" page
    When I will enter new <name>
    And I enter <job>
    And click on Edit
    Then I am redirected to home page
    And new <name> is seen on home page
    And new <job> is displayed

    When button reset is clicked
    Then original page items are shown


    When I click on Add button
    Then "add new person" page opens
    When I add firstname: <name>
    And I add jobtitle: <job>
    And I press Add
    Then I am at home page again
    And I see that new person <name> is added
    And new person <job> is seen

    When I am resetting a list
    Then original person list is displayed

    Examples:
      | name    | job          |
      | John    | developer    |
      | Andrew  | web designer |
      | Alexa   | student      |
      | Antonio | boss         |
      | Esther  | employee     |


  Scenario: Remove person
    When I remove person
    Then This employee is not visible

    When list was reset
    Then homepage is shown


  Scenario: Clear all fields
    When I will add person
    And I will add name "Victoria"
    And I will press Clear all fields button
    Then field will be cleared


