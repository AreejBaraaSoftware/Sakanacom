Feature: tenantavailablehouse
Scenario: Tenant views available housing
    Given I am a tenant
    When I access the available housing listings
    Then I should see a list of available housing options