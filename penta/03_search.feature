Feature: Search Functionality
  @Smoke @SearchPositive
  Scenario: Verify search functionality
    Given User has logged in
    When User enters a valid product name in the search box
    And User clicks on search button
    Then User should see the searched product displayed