 Feature: logout
 
 Scenario: logs out of the system
    Given I am a  logged into the system
    Then I should be logged out of the system
    And I should be redirected to the login page