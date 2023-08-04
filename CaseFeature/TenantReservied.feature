Feature: reserved house
 Scenario: Tenant books accommodation
    Given I am a tenant and i select unit
    When I book the accommodation
    Then the accommodation should be reserved for me
