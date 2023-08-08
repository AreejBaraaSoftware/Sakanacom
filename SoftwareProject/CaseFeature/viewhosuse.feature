
Feature: view house details
Scenario: Owner views housing in the control panel
    Given I am an owner
    When I access the owner control panel
    Then I should see my listed housing units in the control panel