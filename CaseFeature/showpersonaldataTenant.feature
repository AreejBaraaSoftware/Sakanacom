Feature: personal Data Tenant

 Scenario: Tenant views personal data after booking
    Given I am a tenant I have booked an accommodation
    When I access my personal data in the tenant control panel
    Then I should be able to see my personal information and the details of the housing I booked
    