Feature: Add and Delete product 

@SeleniumTest
Scenario: Search for item and validate 
Given User is on Shopping page of Green cart
When user search for "Cucumber" Vegetables 
Then "Cucumber" vegetables should displayed

@SeleniumTest
Scenario: Search for item and validate 
Given User is on Shopping page of Green cart
When user search for "Brinjal" Vegetables 
Then "Brinjal" vegetables should displayed
Then increase the quantity of item 
And Add Item to cart

