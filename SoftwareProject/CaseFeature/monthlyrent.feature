Feature: monthly service
Scenario: unit availabel
    Given unit house
    When I access unit information 
    Then I should see if monthlyrent in unit or not