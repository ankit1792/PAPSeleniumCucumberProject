$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/HooksConcept.feature");
formatter.feature({
  "name": "HooksConcept",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with valid credentails",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "View Add new Customer page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters Email as \"\u003cemail\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.step({
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin1@yourstore.com",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "View Add new Customer page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\u003e\"",
  "keyword": "Given "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "View Add new Customer page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\u003e\"",
  "keyword": "Given "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin1@yourstore.com\" and Password as \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_can_view_Dashboard()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Dashboard / nopCommerce administratio]n\u003e but was:\u003c[Your store. Logi]n\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat hookStepDefinitions.HooksBasedSteps.user_can_view_Dashboard(HooksBasedSteps.java:93)\r\n\tat ✽.User can view Dashboard(file:///C:/Users/ankittolambiya/eclipse-workspace/PAPSeleniumCucumberProject/Features/HooksConcept.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.click_on_Add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "hookStepDefinitions.HooksBasedSteps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});