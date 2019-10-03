
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  @tag4
  Scenario: Verify the count of products is correctly displayed on search result page
  Given The User launch the GC browser with url"https://www.flipkart.com/"
  When The user enter the username "gow" and password"1234"
   And The user click the loginbutton
   And The user enter the shoes in search bar
   Then The user can see the count of products in search result page 

  @tag1
  Scenario: Verify that user can add to cart single or multiple products
    Given The User launch the GC browser with url"https://www.flipkart.com/" 
   
    When The user enter the username "gow" and password"1234"
    And The user click the loginbutton
    And The user search the vivo y95 phone
    And The user click the add to cart button
    And The user click the another vivo12 item &click  addto cart
    Then The user can view both vivoy95&vivo12 in my shopping cart
 

  @tag2
  Scenario: Verify that cash on delivery option of payment is working fine
     Given The User launch the GC browser with url"https://www.flipkart.com/" 
   
    When The user enter the username "gow" and password"1234"
    And The user click the loginbutton 
    And The user search the iphonex phone
    And The user click the Buynow button
    And The user select the cash-on delivery option
    Then The user can purchase through cash-on delivery .
  
    
    @tag3
    Scenario: verify that clicking cancel button after entering all the required fields, cancels the submit request and resets all the fields 
     Given The User launch the GC browser with url"https://www.flipkart.com/" 
   
    When The user enter the username "gow" and password"1234"
    And The user click the loginbutton 
    And The user search the RedmiNote7s
    And The user click the Buynow button    
    And The user has to Enter the all required fields in booking page
    And The user click the cancel/reset button
    Then The user can cancel submit request & reset the fields in booking page  
    
