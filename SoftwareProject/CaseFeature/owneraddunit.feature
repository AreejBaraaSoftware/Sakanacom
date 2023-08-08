Feature: owner add unit

Scenario: Owner adds a housing unit
    Given I am an owner
    When I add a new housing unit
    Then the housing unit should be added to my listings