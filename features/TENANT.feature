Feature: Tenant Functionality

  Scenario: Tenant logs in to the system
    Given I am a tenant
    When I log in with valid username and password
    Then I should be logged in as my role

  Scenario: Tenant views available housing
    Given I am a tenant
    When I access the available housing listings
    Then I should see a list of available housing options

  Scenario: Tenant views housing details
    Given I am a tenant
    When I view the details of a specific housing
    Then I should be able to see the housing information, pictures, and services available

  Scenario: Tenant books accommodation
    Given I am a tenant
    And I have selected a housing unit
    When I book the accommodation
    Then the accommodation should be reserved for me

  Scenario: Tenant views personal data after booking
    Given I am a tenant
    And I have booked an accommodation
    When I access my personal data in the tenant control panel
    Then I should be able to see my personal information and the details of the housing I booked

  Scenario: Tenant advertises used furniture for sale
    Given I am a tenant
    And I have used furniture for sale
    When I access the furniture advertising section
    And I submit the furniture advertisement
    Then my furniture should be listed for sale

  Scenario: Tenant views residence owner details
    Given I am a tenant
    And I have booked an accommodation
    When I access the tenant control panel
    And I view the details of the residence owner
    Then I should see the owner name and his contact information

  Scenario: Tenant pays rent
    Given I am a tenant
    And I have booked an accommodation
    When the rent payment is due
    And I make the payment
    Then my rent payment should be recorded in the system

  Scenario: Tenant logs out of the system
    Given I am a tenant logged into the system
	  When I choose the logout choice
    Then I should be logged out of the system
    And I should be redirected to the login page