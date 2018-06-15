Feature: Test Login Module

  Scenario Outline: Test Login Module with negative Scenario
    Given when i access the WebCTS Outward URL For the Canara Bank
    When I enter the Invalid "<username1>" and Invalid "<password1>"
    Then i should not able to login
    And we should able to verify the error "<messages>" on UI

    Examples: 
      | username1 | password1  | messages                                       |
      | maker     | ncrtest1   | Invalid User ID or Password. Please Try Again. |
      | checker   | ncrtest1   | Invalid User ID or Password. Please Try Again. |
      | admin     | ncrtest1   | Invalid User ID or Password. Please Try Again. |
      |  26121992 | ncrtest1   | Invalid User ID or Password. Please Try Again. |
      | pankaj    | ncrtest1   | Invalid User ID or Password. Please Try Again. |
      | vishal    | lolita@    | Invalid User ID or Password. Please Try Again. |
      | jijesh    |    1234567 | Invalid User ID or Password. Please Try Again. |
      | vinay     |     111111 | Invalid User ID or Password. Please Try Again. |
      | kunal     | capture    | Invalid User ID or Password. Please Try Again. |
      | amit      | Ncr123456^ | Invalid User ID or Password. Please Try Again. |

  Scenario Outline: Test Login Module with negative Scenario
    Given when i access the WebCTS Outward URL For the Canara Bank for valid user
    When I enter the valid "<username2>" and valid "<password2>"
    Then i should able to login

    Examples: 
      | username2 | password2 |
      | canara    | ncrtest   |
