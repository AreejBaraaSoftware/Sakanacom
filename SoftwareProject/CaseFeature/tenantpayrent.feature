
Feature: Tenant pay rent

 Scenario: Tenant pays rent
    Given I am a tenant I have booked an accommodation
    When the rent payment is due
    Then my rent payment should be recorded in the system