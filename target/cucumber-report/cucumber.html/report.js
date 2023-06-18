$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "User Login",
  "description": "As a registered user I want to log into the website\r\nso that I can access my account",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6233516200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should not login with Invalid Credentials",
  "description": "",
  "id": "user-login;user-should-not-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the Login icon from top bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter Invalid credentials for \u0027\u003cEmail\u003e\u0027 and \u0027\u003cPassword\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should not be logged in successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should see the error message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 86637900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnTheLoginIconFromTopBar()"
});
formatter.result({
  "duration": 3713621100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterInvalidCredentialsForEmailAndPassword()"
});
formatter.result({
  "duration": 2232178100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickOnTheLoginButton()"
});
formatter.result({
  "duration": 432322700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldNotBeLoggedInSuccessfully()"
});
formatter.result({
  "duration": 54900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTheErrorMessage()"
});
formatter.result({
  "duration": 3767392600,
  "status": "passed"
});
formatter.after({
  "duration": 982486900,
  "status": "passed"
});
});