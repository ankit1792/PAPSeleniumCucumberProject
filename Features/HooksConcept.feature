Feature: HooksConcept


Scenario: Successful Login with valid credentails
    Given User opens URL "http://admin-demo.nopcommerce.com/login"
    When User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"


Scenario Outline: View Add new Customer page
    Given User opens URL "http://admin-demo.nopcommerce.com/login>"
    When User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then User can view Dashboard
    When User click on customers Menu
    And click on customers Menu Item
    And click on Add new button
    Then User can view Add new customer page
    
    Examples:
    | email | password |
    | admin@yourstore.com | admin |
    |admin1@yourstore.com | admin123 |
    