Feature: Add Cart

  @asad @add-cart
  Scenario: Add Cart Feature
    Given I login to website
    When I select items and add to cart
    When I navigate to the cart page
    Then I verify that added items are present