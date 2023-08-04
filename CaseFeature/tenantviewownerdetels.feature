Feature: Tenant view Owner detals
 Scenario: Tenant views residence owner details
    Given I am a tenant
    When I access the tenant control panel
    Then I should see the owner name and his contact information