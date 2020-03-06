Feature: As an end user i want to search in Google for cats

  Scenario: As a user i want to search for cats on google
    Given i am on google page
    When i type in searchbox cat and click search
    And click on first search result
    Then i see search cats on wikipedia

    Scenario: i wnat to see cat video
      Given i am on youtube search results
      When i click on video
      Then cats are meaowing