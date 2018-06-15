Feature: Test Batch Submit Functionality & Dont Want To Load Next Batch Functionality for second batch

  Scenario: Test Batch Submit Functionality & Dont Want To Load Next Batch Functionality
    Given when my second batch is balanced 
    When i clicked on submit batch button for second batch
    Then it should asked pop up for batch submit and next batch load pop up and it should go to main menu

   