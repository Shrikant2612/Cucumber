Feature: To Open IE Browser and access the WEBCTS URL

  Scenario Outline: TestApplication compability with IE browser
    Given when I open the IE browser and webdriver.exe path "<Path>" is given
    When I access the WEBCTS URL "<bankurl>" for Outward
    Then i should get SOD Pop up
    And User should able to Zomm the Browser "<zoomin>" and "<zoomout>"

    Examples: 
      | Path                                                                  | bankurl                                              | zoomin | zoomout |
      | C:\\PSDOCOUMENTS\\eclipseluna\\Automation\\Driver\\IEDriverServer.exe | http://localhost/canara_mumbai_64_bit/Loginpage.aspx |     30 |     100 |
