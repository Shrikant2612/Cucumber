Feature: Verification of Document Search module

  Scenario Outline: Verification of Document Search module
    Given I have to verify the Document Search module
    When I clicked in Document Search Module
    Then I should able to see sorterno "<sorternoleft>" and "<sorternoright>"
    And I should able to see presentingbankno "<presentingbanknoleft>" and "<presentingbanknoright>"
    And I should able to see  sequenceno "<sequencenoleft>" and "<sequencenoright>"
    And I should able to see blockno "<blocknoleft>" and "<blocknoright>"
    And I should able to see batchno "<batchnoleft>" and "<batchnoright>"
    And I should able to see chequedate "<chequedateleft>" and "<chequedateright>"
    And After click on ok button it should display the "<itemcount>" and "<totalamount>"

    Examples: 
      | sorternoleft | sorternoright | presentingbanknoleft | presentingbanknoright | sequencenoleft | sequencenoright | blocknoleft | blocknoright | batchnoleft | batchnoright | chequedateleft | chequedateright | itemcount | totalamount  |
      |       000000 |        999999 |            000000000 |             999999999 |      000000000 |       999999999 |        0000 |         9999 |      000000 |       999999 | 31/05/2018     | 31/05/2018      |        10 | 48,00,000.00 |
