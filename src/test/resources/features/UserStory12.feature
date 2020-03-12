@UserStory12
Feature:
  As a user i want to be able see information about product:
  name,
  image,
  description,
  specification,
  review,
  price,
  available options
  and buttons ‘Compare’, “Add to Cart”, “Add to Wish list”

  As a user i want to be able:
  to open product page and add product to cart,
  to write review for product after purchase,
  to add product to compare list

  Scenario: User is able to open product page
    Given I am on the HomePage
    And I click on Components tab
    And I select Monitors
    When I click on Apple Cinema name
    Then I am redirected to Apple Cinema page
    When I click on Apple Cinema image
    Then I am redirected to Apple Cinema page

    Scenario: User is able to see information about product
      When I am redirected to Apple Cinema page
      Then I am able to see product name
      And I am able to see product image
      And I am able to see product price
      And I am able to see available options
      And I am able to see description
      And I am able to see specification
      And I am able to see review
      And I am able to see Compare button
      And I am able to see Add to Wish list button
      And I am able to see Add to Cart button

  @AddToCart
    Scenario:
      When I am on the IPhonePage
      And I click on Add to Cart Button
      Then IPhone is added to Cart










