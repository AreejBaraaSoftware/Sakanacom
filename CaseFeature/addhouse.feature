Feature: Add house
Scenario: Admin adds housing 
    Given I am an admin
    When I add new housing 
    Then the housing should be available for listing
