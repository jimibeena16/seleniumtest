Feature: SauceDemo login
 
 @smoke
 Scenario: Valid user logs in successfully
  Given I open the SauceDemo login page
  When I login with username "standard_user" and password "secret_sauce"
  Then the Products page should be displayed
  

  Scenario Outline: Login with different users
    Given user opens SauceDemo login page
    When user enters username "<username>" and password "<password>"
    And user clicks login button
    Then user should see the inventory page
    Examples:

      | username                 | password     |
      | standard_user            | secret_sauce |
      | problem_user             | secret_sauce |
      
     