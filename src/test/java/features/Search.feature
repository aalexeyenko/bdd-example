Feature: Search on StiboSystems.com
  Scenario: Verify search results for Energy
    Given I am on main page
    When I search for energy
    Then 12 results found