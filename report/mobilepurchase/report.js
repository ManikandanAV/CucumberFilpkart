$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/MobilePurchase.feature");
formatter.feature({
  "name": "Flipkart.iphonepurchase",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "iphonepurchase",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user login to flipkart\"\u003cusername\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user search iphone mobile\"\u003cmobile\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select the iphone",
  "keyword": "And "
});
formatter.step({
  "name": "user click addtocart",
  "keyword": "And "
});
formatter.step({
  "name": "user click placeorder",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "mobile"
      ]
    },
    {
      "cells": [
        "mani@gmail.com",
        "123456",
        "iphone"
      ]
    }
  ]
});
formatter.scenario({
  "name": "iphonepurchase",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login to flipkart\"mani@gmail.com\",\"123456\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchase.user_login_to_flipkart(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search iphone mobile\"iphone\"",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchase.user_search_iphone_mobile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the iphone",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchase.user_select_the_iphone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click addtocart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchase.user_click_addtocart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click placeorder",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchase.user_click_placeorder()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});