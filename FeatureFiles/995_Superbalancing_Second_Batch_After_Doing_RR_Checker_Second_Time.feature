Feature: Verification of Superbalancing module after rejecting the batch from  superbalancing module

  
  Scenario: Verification of Superbalancing module for checker user second batch after rejecting batch from superbalancing module
    Given i am in Superbalcing module for second batch
    When I open the second batch which got rejected in superbalancing module by checker
    Then i should able to save the records and then  able to submit the batch in superbalancing module

  
  