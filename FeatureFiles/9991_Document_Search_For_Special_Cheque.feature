Feature: Verification of Document Search module for special cheque Tab

  Scenario Outline: Verification of Document Search module forspecial cheque Tab for all the cheque
    Given i have on special cheque tab
    When I gave chequeno for special cheque from "<chequeno1left>" cheque to "<chequeno1right>"
    And citycode  for special cheque from  "<citycode1left>" citycode to "<citycode1right>"
    And bankcode for special cheque from  "<bankcode1left>" bankcode to "<bankcode1right>"
    And branchcode for special cheque from  "<branchcode1left>" branchcode to "<branchcode1right>"
    And basecode for special cheque  from  "<basecode1left>" branchcode to "<basecode1right>"
    And tc for special cheque from  "<tccode1left>" branchcode to "<tccode1right>"
    And amount for special cheque from  "<amount1left>" branchcode to "<amount1right>"
    And after i clicked on ok button
    Then it should display special cheque the "<itemcountforspecialcheque>" and "<totalamountforspecialcheque>" for the cheques

    Examples: 
      | chequeno1left | chequeno1right | citycode1left | citycode1right | bankcode1left | bankcode1right | branchcode1left | branchcode1right | basecode1left | basecode1right | tccode1left | tccode1right | amount1left | amount1right | itemcountforspecialcheque | totalamountforspecialcheque |
      |        000000 |         999999 |           000 |            999 |           000 |            999 |             000 |              999 |        000000 |         999999 |          00 |           99 | 00000000000 | 999999999999 |                        10 |                48,00,000.00 |
      |        111111 |         111111 |           400 |            400 |           229 |            229 |             001 |              001 |       0000000 |        0000001 |          29 |           29 |      300000 |       300000 |                        10 |                48,00,000.00 |
