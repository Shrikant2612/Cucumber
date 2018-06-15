Feature: Test RR Module With Valid Scenario for second batch

  Scenario Outline: Test Reject Repair Batch Balancing Module for Valid Scenario for second batch
    Given when i navigate to second batch
    When I enter the valid chequeno for second batch "<chequeno>" and valid citycode for second batch "<citycode>"
    And valid bank code for second batch "<bankcode>" and valid branch code for second batch  "<branchcode>" and
    And valid base no for second batch "<baseno>" and valid tc for second batch "<tc>" and
    And valid amount for second batch  "<amount>" and after click on save button
    Then i should  able to save the records for second batch

    Examples: 
      | chequeno | citycode | bankcode | branchcode | baseno | tc | amount |
      |   555555 |      400 |      229 |        001 | 0000001 | 29 | 300000 |
      |   666666 |      400 |      229 |        001 | 0000002 | 29 | 300000 |
      |   777777 |      400 |      229 |        001 | 0000003 | 29 | 300000 |
     
      
      
      Scenario Outline: Test Reject Repair Batch Balancing Module for Valid Scenario for second batch last record
    Given when i navigate to second batch last record
    When I enter the valid chequeno for second batch last record  "<chequeno>" and valid citycode for second batch last record "<citycode>"
    And valid bank code for second batch last record "<bankcode>" and valid branch code for second batch last record "<branchcode>" and
    And valid base no for second batch last record "<baseno>" and valid tc for second batch last record "<tc>" and
    And valid amount for for second batch last record  "<amount>" and after click on save button
    Then i should  able to save the last  records for second batch

    Examples: 
      | chequeno | citycode | bankcode | branchcode | baseno | tc | amount |
      |   888888 |      400 |      229 |        001 | 0000004 | 29 | 300000 |
