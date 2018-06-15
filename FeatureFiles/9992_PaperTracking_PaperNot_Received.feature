Feature: Test Paper Tracking Module for paper not received status

  Scenario Outline: Test Paper Tracking Module for paper not received status
    Given i clicked on click on paper tracking module
    When I select the status for paper as "<statusforcheque>" 
    And if i clicked on ok button
    Then i should display the item "<totalitem1>" and amount "<totalamount1>"
    And able to mark the record with status as as paper received "<status1>"

    Examples: 
      | statusforcheque                                | totalitem1 | totalamount1 | status1                                   |
      | Paper Not Received                    |          4 | 12,00,000.00 | Paper Received from Presenting Branch     |
      | Paper Received from Presenting Branch |          4 | 12,00,000.00 | Paper Dispatched                          |
      | Paper Dispatched                      |          4 | 12,00,000.00 | Paper Received in Return from Drawee Bank |
