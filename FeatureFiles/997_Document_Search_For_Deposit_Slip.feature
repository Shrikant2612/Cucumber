Feature: Verification of Document Search module for Deposit Slip Tab

  Scenario Outline: Verification of Document Search module for Deposit Slip Tab include slip
    Given i have on deposit slip tab
    When I gave from "<leftaccountno>"  to "<rightaccountno>"
    And "<leftamount>"  to "<rightamount>" i clicked on ok button
    Then it should display the "<itemcount>" and "<totalamount>"

    Examples: 
      | leftaccountno | rightaccountno | leftamount   | rightamount   | itemcount | totalamount  |
      |  000000000000 |  9999999999999 | 000000000000 | 9999999999999 |        10 | 48,00,000.00 |

  Scenario Outline: Verification of Document Search module for Deposit Slip Tab exclude slip
    Given i have on deposit slip tab without search inculding criteria
    When I exclude the account no and amount range i clicked on ok button
    Then it should displays the "<itemscount>" and "<totalsamount>"

    Examples: 
      | itemscount | totalsamount |
      |          8 | 24,00,000.00 |
