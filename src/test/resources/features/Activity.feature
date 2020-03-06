Feature: tests for performing search
  As an end user I need to use a Google search

Background:
  Given I am on google page

  Scenario Outline: As an end user I can search animolz using Google
    When I enter "<characteristic>" "<animalz>" to the search field
    And I press Search button
    Then I should see search results
    Examples:

   |characteristic |animalz|
   | cute          | cat   |
   | good          | rat   |
   | gorgeous      | wombat|



 # @rat
  #Scenario: As an end user I can search cats using Google
  #  When I enter cute rats to the search field
   # And I press Search button
    #Then I should see search results

