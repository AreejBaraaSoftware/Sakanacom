
Feature: accept reject housing

 Scenario: Admin accepts or reject housing advertisement
    Given I am an admin
    When I accept the advertisement
    Then the housing should be listed as available