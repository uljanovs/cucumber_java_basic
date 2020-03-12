
@Checkout


Feature: Feature
  Background:
    Given I am on the HomePage
  @Checkout

  Scenario: Click checkout
    When I click on Checkout Button
    Then I am redirected to checkout page
    When I select Billing Details
    And I click Continue to Delivery Details
    And I select Delivery Details
      And I click Continue to Delivery Method
      And I select Delivery Method
      And click Continue to Payment Method
      And I select Cash On Delivery
      And I click Agree
      And I click Continue to Confirm Order
      And I click Confirm Order
      Then I see that My Order is placed
