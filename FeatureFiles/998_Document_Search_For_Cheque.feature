Feature: Verification of Document Search module for cheque Tab

  Scenario Outline: Verification of Document Search module for cheque Tab for all the cheque
    Given i have on cheque tab
    When I gave chequeno from "<chequenoleft>" cheque to "<chequenoright>"
    And citycode from  "<citycodeleft>" citycode to "<citycoderight>"
    And bankcode from  "<bankcodeleft>" bankcode to "<bankcoderight>"
    And branchcode from  "<branchcodeleft>" branchcode to "<branchcoderight>"
    And basecode from  "<basecodeleft>" branchcode to "<basecoderight>"
    And tc from  "<tccodeleft>" branchcode to "<tccoderight>"
    And amount from  "<amountleft>" branchcode to "<amountright>"
    And after clicked on ok button
    Then it should display the "<itemcount>" and "<totalamount>" for the cheques

    Examples: 
      | chequenoleft | chequenoright | citycodeleft | citycoderight | bankcodeleft | bankcoderight | branchcodeleft | branchcoderight | basecodeleft | basecoderight | tccodeleft | tccoderight | amountleft  | amountright  | itemcount | totalamount  |
      |       000000 |        999999 |          000 |           999 |          000 |           999 |            000 |             999 |       000000 |        999999 |         00 |          99 | 00000000000 | 999999999999 |        10 | 48,00,000.00 |
      |       111111 |        111111 |          400 |           400 |          229 |           229 |            001 |             001 |       000000 |        000000 |         10 |          10 |      300000 |       300000 |         3 |  27,00,000.00 |
