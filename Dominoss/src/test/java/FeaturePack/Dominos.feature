Feature: Open the Browser

  Scenario Outline: 
  	Given User launch the "<browser>" Browser
  	When User Launch Url
    When User click the online order
    When User select the delivery loaction
    And User add the "<peppy panner>"
    And User2 add the "<Margherita>"
    And user3 add the "<Gornment pizza >"
    And User checking the cart total
    And User4 add the "<pepsi>"
    And User5 removing the "<Margherita>" 
    And User6 removing the "<pepsi>"
    Then User checking the cart total and click the checkout
    
   Examples:

    |browser     | Veg pizza1    |count| vegPizza2   | count |  vegPizza3   |count | Beverage | count |Remove Veg Pizza| count |Remove bevarage |count|
    | Chrome     |  Gournment    |  2  |  Magaherita |  2    | Peppy panner | 2    |  pepsi   |   12  |   Magaherita   |    1  | pepsi          | 6   |
    | edge       |  Gournment    |  2  |  Magaherita |  2    | Peppy panner | 2    |  pepsi   |   12  |   Magaherita   |    1  | pepsi          | 6   |
    | FireFox    |  Gournment    |  2  |  Magaherita |  2    | Peppy panner | 2    |  pepsi   |   12  |   Magaherita   |    1  | pepsi          | 6   |
              
  
    
