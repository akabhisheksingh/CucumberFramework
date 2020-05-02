$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddAndDeleteItem.feature");
formatter.feature({
  "line": 1,
  "name": "Add and Delete product",
  "description": "",
  "id": "add-and-delete-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 510062,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search for item and validate",
  "description": "",
  "id": "add-and-delete-product;search-for-item-and-validate",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Shopping page of Green cart",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user search for \"Cucumber\" Vegetables",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" vegetables should displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchITemDefintion.user_is_on_shopping_page_of_green_cart()"
});
formatter.result({
  "duration": 87860894272,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 17
    }
  ],
  "location": "SearchITemDefintion.user_search_for_Vegetables(String)"
});
formatter.result({
  "duration": 7631907526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "SearchITemDefintion.something_vegetables_should_displayed(String)"
});
formatter.result({
  "duration": 1445428570,
  "status": "passed"
});
formatter.after({
  "duration": 43230041229,
  "status": "passed"
});
formatter.before({
  "duration": 122719,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Search for item and validate",
  "description": "",
  "id": "add-and-delete-product;search-for-item-and-validate",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User is on Shopping page of Green cart",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user search for \"Brinjal\" Vegetables",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "\"Brinjal\" vegetables should displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "increase the quantity of item",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Add Item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SearchITemDefintion.user_is_on_shopping_page_of_green_cart()"
});
formatter.result({
  "duration": 16008154287,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 17
    }
  ],
  "location": "SearchITemDefintion.user_search_for_Vegetables(String)"
});
formatter.result({
  "duration": 5811652157,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 1
    }
  ],
  "location": "SearchITemDefintion.something_vegetables_should_displayed(String)"
});
formatter.result({
  "duration": 35220561,
  "status": "passed"
});
formatter.match({
  "location": "SearchITemDefintion.increase_the_quantity_of_item()"
});
formatter.result({
  "duration": 1376029885,
  "status": "passed"
});
formatter.match({
  "location": "SearchITemDefintion.add_item_to_cart()"
});
formatter.result({
  "duration": 4379368711,
  "status": "passed"
});
formatter.after({
  "duration": 36355280250,
  "status": "passed"
});
formatter.uri("PlaceOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Place order",
  "description": "",
  "id": "place-order",
  "keyword": "Feature"
});
formatter.before({
  "duration": 104868,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Search for item and validate and place order",
  "description": "",
  "id": "place-order;search-for-item-and-validate-and-place-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Shopping page of Green cart",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user search for \"Capsicum\" Vegetables",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "\"Capsicum\" vegetables should displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "increase the quantity of item",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Add Item to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be able to tap on cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user should be able to proceed or place for place the order",
  "keyword": "And "
});
formatter.match({
  "location": "SearchITemDefintion.user_is_on_shopping_page_of_green_cart()"
});
formatter.result({
  "duration": 14596944898,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Capsicum",
      "offset": 17
    }
  ],
  "location": "SearchITemDefintion.user_search_for_Vegetables(String)"
});
formatter.result({
  "duration": 5294988592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Capsicum",
      "offset": 1
    }
  ],
  "location": "SearchITemDefintion.something_vegetables_should_displayed(String)"
});
formatter.result({
  "duration": 69156373,
  "status": "passed"
});
formatter.match({
  "location": "SearchITemDefintion.increase_the_quantity_of_item()"
});
formatter.result({
  "duration": 378597594,
  "status": "passed"
});
formatter.match({
  "location": "SearchITemDefintion.add_item_to_cart()"
});
formatter.result({
  "duration": 2134564263,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepDefinition.user_should_be_able_to_tap_on_cart_icon()"
});
formatter.result({
  "duration": 382451837,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepDefinition.user_should_be_able_to_proceed_or_place_for_place_the_order()"
});
formatter.result({
  "duration": 4082360847,
  "status": "passed"
});
formatter.after({
  "duration": 35490746381,
  "status": "passed"
});
});