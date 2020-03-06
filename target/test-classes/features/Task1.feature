Feature: As a user I want to use calculator

  Background:
  Given I am on calculator page

    Scenario Outline: check error cases
      When I enter value: "<number>"
      And I click submit
      Then I see error message: "<message>"

      Examples:
        | number | message |
        |25      |Number is too small|
        |150     |Number is too big  |
        |abc     |Please enter a number|

      Scenario: check with correct number
        When I enter numbers
        And I click submit
        Then message with correct answer is displayed