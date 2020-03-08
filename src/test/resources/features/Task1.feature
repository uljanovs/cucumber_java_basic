Feature: Testing "Enter the number" Web Application
        As an end user I need to calculate square roots of numbers from 50 to 100
        Background:
        Given I am on the application page
        Scenario Outline: As a user I can enter invalid values
        When I enter "<input>"
        And I press Submit button
        Then I see an "<error>"
        Examples:
        |input|error                |
        |47   |Number is too small  |
        |38   |Number is too small  |
        |121  |Number is too big    |
        |Text |Please enter a number|