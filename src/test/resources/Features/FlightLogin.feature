Feature: Flight Login
This feature deals with the login functionality.
@SC1
Scenario: Login with correct credentials for flight login
 
    Given I navigate to flight booking page
    When I select flight type "One Way"
    And I select service class "First"
    And I clicked continue
    
@SC2   
Scenario: Login with correct credentials for flight login

    Given I navigate to flight booking page
    When I select flight type "One Way"
    And I select service class "First"
    And I clicked continue
