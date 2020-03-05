Feature: As an end user i want to search in Google for cats

  Scenario: As a user i want to search for cats on google
    Given i am on google page
    When i type in searchbox cat and click search
    And click on first search result
    Then i see search cats on wikipedia