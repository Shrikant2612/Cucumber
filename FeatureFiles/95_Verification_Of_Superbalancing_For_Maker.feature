Feature: To Test Maker/ Checker Functionality for the Superbalancing

  
  Scenario: Maker user should not do Superbalancing if the Maker user Did RR
    Given  User is in Superbalancing Module
    When I clicked on batch no in superbalancing
    Then It should give pop up by saying verification canot be done by maker user

  
  