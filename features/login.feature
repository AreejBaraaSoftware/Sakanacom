#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LOGIN_TAG
Feature: Login

Background:
  Given the following users exist:
  Examples:
     | Username  | Password  | Role         |
     | Baraa     | tenantpas | Tenant       |
     | Areej     | ownerpas  | Owner        |
     | Admin     | adminpas  | Administrator|
@LOGIN_TAG_TENANT_1
Scenario: Tenant login with valid username and password
  When I enter my username <"Baraa"> and password <"tenantpas">
  Then I will login as a <"Tenant">
@LOGIN_TAG_TENANT_2
Scenario: Tenant login with incorrect password
  When I enter my username <"Baraa"> and password <"wrongpass">
  Then I should see an incorrect password error message 
@LOGIN_TAG_OWNER_1
Scenario: Owner login with valid username and password
  When I enter my username <"Areej"> and password <"ownerpas">
  Then I will login as an <"Owner">
@LOGIN_TAG_OWNER_2
Scenario: Owner login with incorrect password
  When I enter my username <"Areej"> and password <"wrongpass">
  Then I should see an incorrect password error message
@LOGIN_TAG_ADMIN_1
Scenario: Administrator login with valid username and password
  When I enter my username <"Admin"> and password <"adminpas">
  Then I will login as an <"Administrator">
@LOGIN_TAG_ADMIN_2
Scenario: Administrator login with incorrect password
  When I enter my username <"Admin"> and password <"wrongpass">
  Then I should see an incorrect password error message
