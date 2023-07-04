Feature: Admin Functionality

  Scenario: Admin logs in to the system
    Given I am an admin
    When I log in with valid username and password
    Then I should be logged in as my role 

  Scenario: Admin views housing advertisements
    Given I am an admin
    When I access the housing advertisements
    Then I should see a list of housing advertisements

  Scenario: Admin accepts housing advertisement
    Given I am an admin
    And there is a pending housing advertisement
    When I review the advertisement
    And I accept the advertisement
    Then the housing should be listed as available

  Scenario: Admin rejects housing advertisement
    Given I am an admin
    And there is a pending housing advertisement
    When I review the advertisement
    And I reject the advertisement
    Then the housing should not be listed as available

  Scenario: Admin views reservations
    Given I am an admin
    When I access the reservations
    Then I should see a list of reservations

  Scenario: Admin adds housing units
    Given I am an admin
    When I add new housing units
    Then the units should be available for listing

  Scenario: Admin modifies housing data
    Given I am an admin
    When I modify housing data
    Then the changes should be reflected in the system

  Scenario: Admin logs out of the system
    Given I am an admin logged into the system
    When I choose the logout choice
    Then I should be logged out of the system
    And I should be redirected to the login page




 


 

