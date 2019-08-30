$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Monster Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;monster-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is monster",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDef.user_already_login_page()"
});
formatter.result({
  "duration": 47811600307,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.title_of_login_page_is_monster()"
});
formatter.result({
  "duration": 154926472,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_enters_username_and_password()"
});
formatter.result({
  "duration": 4226496627,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3367902932,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 75174,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.close_the_browser()"
});
formatter.result({
  "duration": 22778914157,
  "status": "passed"
});
});