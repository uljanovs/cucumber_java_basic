Feature: People with jobs
  Background:
    Given user is on people with jobs page

    Scenario Outline: user can perform actions
      When i click on Add person button
     Then i see a form
      When i input "<name>" in name field and "<job>" in job field
      When click Add button
      Then i see person on list
      Examples:
      |name  |job      |
      |Ingars|tester   |
      |John  |developer|