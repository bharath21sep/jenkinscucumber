$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefile/FB_login.feature");
formatter.feature({
  "name": "To validate login functionality of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FBLogin.user_should_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FBLogin.user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should maximise the window",
  "keyword": "And "
});
formatter.match({
  "location": "FBLogin.user_should_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should type the invalid username and invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "FBLogin.user_should_type_the_invalid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FBLogin.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the title of the incorrect credential page",
  "keyword": "And "
});
formatter.match({
  "location": "FBLogin.user_should_get_the_title_o_fthe_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
});