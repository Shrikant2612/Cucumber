Feature: Test Login Module

  Scenario Outline: Test Login Module with positive Scenario for maker user
    Given i clicked on click here to login button
    When I enter the valid username  "<username4>" and valid password  "<password4>"
    Then i should able to login successfully

    Examples: 
      | username4 | password4 |
      | canara    | ncrtest   |
