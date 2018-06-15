Feature: Test RR Module With Valid Scenario

  
  Scenario Outline: Test Reject Repair Batch Balancing Module for Valid Scenario
    Given when i navigate to first batch
    When I enter the valid chequeno "<chequeno>" and valid citycode "<citycode>"
    And valid bank code "<bankcode>" and valid branch code  "<branchcode>" and
    And valid base no "<baseno>" and valid tc "<tc>" and
    And valid amount  "<amount>" and after click on save button
    Then i should  able to save the records

    Examples: 
      | chequeno | citycode | bankcode | branchcode | baseno | tc | amount |
      |   111111 |      400 |      229 |        001 | 000000 | 10 | 300000 |
      |   222222 |      400 |      229 |        001 | 000000 | 10 | 300000 |
      |   333333 |      400 |      229 |        001 | 000000 | 10 | 300000 |

  
  Scenario Outline: Test Reject Repair Batch Balancing Module for Valid Scenario last cheque from first batch
    Given i handle all the remaining cheque
    When I enter the valid chequeno for last cheque "<chequeno>" and valid citycode for last cheque  "<citycode>"
    And valid bank code for last cheque "<bankcode>" and valid branch code for last cheque  "<branchcode>" and
    And valid base no for last cheque "<baseno>" and valid tc for last cheque "<tc>" and
    And valid amount for last cheque  "<amount>" and after click on save button
    Then i should  able to save the records and after that i will get pop up for batch is not balanced

    Examples: 
      | chequeno | citycode | bankcode | branchcode | baseno | tc | amount |
      |   444444 |      400 |      229 |        001 | 000000 | 10 | 300000 |
