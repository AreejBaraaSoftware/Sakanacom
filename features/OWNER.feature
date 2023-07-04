Feature: Owner Functionality

  Scenario: Owner logs in to the system
    Given I am an owner
    When I log in with valid owner credentials
    Then I should be logged in as an owner

  Scenario: Owner adds a housing unit
    Given I am an owner
    When I add a new housing unit
    Then the housing unit should be added to my listings

  Scenario: Owner updates housing details
    Given I am an owner
    And I have a housing unit listed
    When I choose to update the housing details 
    Then list of choices will appear 
    And the changes should be reflected in the system
    
  Scenario: Owner adds contact information for a private residence
    Given I am an owner
    And I have a private residence listed
    When I add contact information for the private residence
    Then the contact details should be associated with the private residence

  Scenario: Owner views housing in the control panel
    Given I am an owner
    When I access the owner control panel
    Then I should see my listed housing units in the control panel

  Scenario: Owner views tenant details for a housing unit
    Given I am an owner
    And I have tenants in a housing unit
    When I select the housing unit in the owner control panel
    Then I should see the number of tenants in the housing unit
    And I should see the details of the tenants, including means of communication

  Scenario: Owner views the number of floors in a residence
    Given I am an owner
    And I have a specific residence listed
    When I select the residence in the owner control panel
    Then I should see the number of floors in the residence

  Scenario: Owner views apartments on a specific floor
    Given I am an owner
    And I have a specific residence listed
    And I have selected a specific floor in the owner control panel
    When I view the apartments on that floor
    Then I should see the apartments of that floor in the residence

  Scenario: Owner views tenant details for a specific apartment
    Given I am an owner
    And I have tenants in a specific apartment
    And I have selected the apartment in the owner control panel
    When I view the tenant details
    Then I should see the names of the tenants
    And I should see the means of communication with the tenants
    And I should see the number of bathrooms and bedrooms in the apartment
    And I should see if the apartment has a balcony