
Feature: furniture for sale
Scenario: Tenant advertises used furniture for sale
    Given I am a tenant I have used furniture for sale
    When I access the furniture advertising section I submit the furniture advertisement
    Then my furniture should be listed for sale