Feature: To Test Login Module for Checker User

  Scenario Outline: To Test Login Module for Checker User
    Given Maker user did logout
    When I clicked on click here to login button
    Then i should get SOD Pop up and after that user will enter the "<username3>" and "<password3>" then user should able to login

    Examples: 
      | username3 | password3 |
      | canara1   | ncrtest   |
