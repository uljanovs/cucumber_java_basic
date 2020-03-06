@regression
Feature: List of People
  As a user
  I want to look through a List of People, add a person to a list, edit a person and delete a person from the List

  @debugs
  Scenario Outline: Enter Number - Negative
    Given I am on enter a Number Page
    When I click on "Please enter a number from 50 to 100" field
    And I enter : "<value>"
    And I click on Submit
    Then I see error: "<message>"
    @not_working
    Examples:
      | value | message                      |
      | 48    | Number is too small          |
      | 101   | Number is too big            |
      | Bob   | Please enter a number        |
      |       | You haven't entered anything |

  @working
  Scenario Outline: Enter Number - Positive
    Given I am on enter a Number Page
    When I click on "Please enter a number from 50 to 100" field
    And I enter : "<value>"
    And I click on Submit
    Then I see alert: "<message>"
    Examples:
      | value | message                     |
      | 50    | Square root of 50 is 7.07   |
      | 51    | Square root of 51 is 7.14   |
      | 99    | Square root of 99 is 9.95   |
      | 100   | Square root of 100 is 10.00 |

