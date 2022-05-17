$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signpage.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As user I want to login into nop commerce website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13287425101,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to signIn page successfully",
  "description": "",
  "id": "login-test;user-should-navigate-to-signin-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    },
    {
      "line": 4,
      "name": "@check"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign in link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify that \u0027AUTHENTICATION\u0027 message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SignPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 107107101,
  "status": "passed"
});
formatter.match({
  "location": "SignPageSteps.iClickOnSignInLink()"
});
formatter.result({
  "duration": 4697179200,
  "status": "passed"
});
formatter.match({
  "location": "SignPageSteps.verifyThatAUTHENTICATIONMessageIsDisplayed()"
});
formatter.result({
  "duration": 27722301,
  "status": "passed"
});
formatter.after({
  "duration": 683739900,
  "status": "passed"
});
});