
Feature: Updatedata

Scenario: Owner updates housing details
    Given I am an owner
    When I choose to update the housing details and list of choices will appear
    Then changes should be reflected in the system
    