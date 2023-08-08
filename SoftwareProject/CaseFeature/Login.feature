Feature: login


 Background: login
    Given  Given  I have the following username and passowrd in the store
     | Username  | Password  | Role         |
     | Baraa     | T***       | tenant       |
     | Areej     | A***       | admin       |
     | Alaa      | O***          | owner|
    
     
   Scenario: Find name by username 
    When I search for name by username <"Baraa"> and by Password <"T***"> and Role<"tenant">
    Then I find 1 Tenant
  
   Scenario: Find name by username 
  When I search for name by username <"Alaa"> and by Password <"O***">and Role<"owner">
  Then I find 1 Owner
  
	Scenario: Find name by username
  When I search for name by username <"Areej"> and by Password <"A***"> and Role<"admin">
  Then I find  1 Admin
  

