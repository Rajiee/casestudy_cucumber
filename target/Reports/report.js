$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/A08019DIRP_C2B.02.14/workspace/casestudy_cucumber/src/resources/java/casestudy4.feature");
formatter.feature({
  "line": 1,
  "name": "Payment",
  "description": "",
  "id": "payment",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login to TestMeApp",
  "description": "",
  "id": "payment;login-to-testmeapp",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the TestMeApp",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Login to the TestMeApp",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Inputs \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click On login button",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "payment;login-to-testmeapp;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "payment;login-to-testmeapp;;1"
    },
    {
      "cells": [
        "Lalitha",
        "Password123"
      ],
      "line": 11,
      "id": "payment;login-to-testmeapp;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login to TestMeApp",
  "description": "",
  "id": "payment;login-to-testmeapp;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the TestMeApp",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Login to the TestMeApp",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Inputs \"Lalitha\" and \"Password123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click On login button",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy4_stepdef.open_the_TestMeApp()"
});
formatter.result({
  "duration": 14145994700,
  "status": "passed"
});
formatter.match({
  "location": "casestudy4_stepdef.login_to_the_TestMeApp()"
});
formatter.result({
  "duration": 4118169000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lalitha",
      "offset": 8
    },
    {
      "val": "Password123",
      "offset": 22
    }
  ],
  "location": "casestudy4_stepdef.inputs_and(String,String)"
});
formatter.result({
  "duration": 209450000,
  "status": "passed"
});
formatter.match({
  "location": "casestudy4_stepdef.click_On_login_button()"
});
formatter.result({
  "duration": 342196300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "The one the user moves to cart without adding any item to the cart",
  "description": "",
  "id": "payment;the-one-the-user-moves-to-cart-without-adding-any-item-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Alex has registered to the TestMeApp",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Alex searches for a particular product like headphones",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "try to proceed to payment without adding to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the TestMeApp doesnot show the cart item",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy4_stepdef.alex_has_registered_to_the_TestMeApp()"
});
formatter.result({
  "duration": 220600,
  "status": "passed"
});
formatter.match({
  "location": "casestudy4_stepdef.alex_searches_for_a_particular_product_like_headphones()"
});
formatter.result({
  "duration": 1096593900,
  "status": "passed"
});
formatter.match({
  "location": "casestudy4_stepdef.try_to_proceed_to_payment_without_adding_to_the_cart()"
});
formatter.result({
  "duration": 569345200,
  "status": "passed"
});
formatter.match({
  "location": "casestudy4_stepdef.the_TestMeApp_doesnot_show_the_cart_item()"
});
formatter.result({
  "duration": 2740992600,
  "status": "passed"
});
});