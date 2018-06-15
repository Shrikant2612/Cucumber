Feature: Test RR Module

  
  Scenario Outline: Test Reject Repair Batch Balancing Module
    Given when i enter to RR module and after selecting the batch
    When I enter the Invalid chequeno "<chequeno>" and Invalid citycode "<citycode>"
    And Invalid bank code "<bankcode>" and Invalid branch code  "<branchcode>" and
    And Invalid base no "<baseno>" and Invalid tc "<tc>" and
    And Invalid amount  "<amount>" and after click on save button
    Then i should not able to save the records

    Examples: 
      | chequeno | citycode | bankcode | branchcode | baseno | tc | amount   |
      |   000000 |      000 |      000 |        000 | 000000 | 00 |  0000000 |
      |   123456 |      000 |      000 |        000 | 000000 | 00 |  0000000 |
      |   123456 |      400 |      000 |        000 | 000000 | 00 |  0000000 |
      |   123456 |      400 |      229 |        000 | 000000 | 00 |  0000000 |
      |   123456 |      400 |      229 |        001 | 000000 | 00 |  0000000 |
      |   123456 |      400 |      229 |        001 | 000000 | 00 |  0000000 |
      |   123456 |      400 |      229 |        001 | 000000 | 00 |  0000000 |
      |   123456 |      400 |      229 |        001 | 000000 | 10 |  0000000 |
      |   123456 |      400 |      229 |        001 | 000000 | 10 |  0000000 |
      | abcdef   | abc      | abc      | abc        | abcdef | ab | abcdefgh |
      | ~~~~~~   | ~~~      | ~~~      | ~~~        | ~~~~~~ | ~~ | ~~~~~~   |
      | @@@@@@   | @@@      | @@@      | @@@        | @@@@@@ | @@ | @@@@@@@  |
      | ######   | ###      | ###      | ###        | ###### | ## | #######  |
      | $$$$$$   | $$$      | $$$      | $$$        | $$$$$$ | $$ | $$$$$$   |
      | %%%%%%   | %%%      | %%%      | %%%        | %%%%%% | %% | %%%%%%   |
      | &&&&&&   | &&&      | &&&      | &&&        | &&&&&& | && | &&&&&&   |
      | ******   | ***      | ***      | ***        | ****** | ** | ******   |
