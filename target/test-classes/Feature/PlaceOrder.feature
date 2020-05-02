 Feature: Place order 


@SeleniumTest
Scenario: Search for item and validate and place order
Given User is on Shopping page of Green cart
When user search for "Capsicum" Vegetables 
Then "Capsicum" vegetables should displayed
Then increase the quantity of item 
And Add Item to cart
Then user should be able to tap on cart icon
And user should be able to proceed or place for place the order