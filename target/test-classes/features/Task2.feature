Feature: Testing "List of people" page
  As an end user I need to be able to edit list  of people

  Background:
    Given I am on the List page

    Scenario Outline: I add person to the list
      When I press add button
      And I add "<name>"
      And add "<job>"
      And I confirm addition
      And I check that "<name>" is correct
      And I check "<job>" is correct
      Then I reset list
      Examples:
      |name |job  |
      |Jenny|nurse|
      |Mike |doctor|

      Scenario Outline: I edit a person in a list
        When I press edit button
        And I edit "<name>" and "<job>"
        And I confirm editing
        And I check "<name>" and "<job>" edited correctly
        Then I reset list
        Examples:
        |name|job    |
        |Liza|janitor|

        Scenario: I remove a person from list
          When I press Delete button
          And I check that person removed
          Then I reset list

