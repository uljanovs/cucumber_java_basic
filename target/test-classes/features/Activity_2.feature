Feature: As an end user I need a Google Search feature

  Background:
    Given I am on Google page;

  Scenario Outline: As an end user  I can search animals using Google
    When I enter word : "<animal_value>"
    And I click Search button
    Then <result> is displayed

    Examples:
      | animal_value|
      |cats |
      |rats |



