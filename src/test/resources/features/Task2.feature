@Task2
Feature:
  As a test engineer
  I want to be able to write and execute a simple scenario

  Background:
    Given I am on the page "People with jobs"

  Scenario: Edit new person
    When I click Edit button
    Then I am redirected to "edit person" page
    When I enter new name
    And I enter new job
    And click on Edit
    Then I am redirected to home page
    And new name and job is seen on home page

  Scenario: Add new person
    When I click on Add button
    Then I am redirected to "add new person" page
    When I enter name "Victoria"
    And I enter job "student"
    And I press Add
    Then I am redirected to home page again
    And I see that new person is added

  Scenario: Remove person
    When I click on remove symbol
    Then Removed person is not seen on home page

  Scenario: Reset list
    When I click on Reset List button
    Then original persons are seen on home page



