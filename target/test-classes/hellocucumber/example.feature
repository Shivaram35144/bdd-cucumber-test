  

Feature: Generic Name
  Scenario: First example   
    Given my name is Shivaram
    When I ask if it is Shivaram
    Then Success
  Scenario: generic example
    Given my name is "Shivaram"
    When I ask if it is "cookieman"
    Then Failure