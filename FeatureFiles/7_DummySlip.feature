Feature: Test Dummy Feature Functionality & Batch Submit

  Scenario Outline: Test Dummy Feature Functionality & Batch Submit Functionality
    Given when my batch is unbalanced
    When when i gave "<AccountNo>" and "<Amount>"
    Then i should able to insert dummy slip and balance the batch

    Examples: 
      | AccountNo    | Amount |
      | 888888888888 | 1200000 |
