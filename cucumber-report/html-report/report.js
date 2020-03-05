$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Activity_2.feature");
formatter.feature({
  "line": 1,
  "name": "As an end user I need a Google search feature",
  "description": "",
  "id": "as-an-end-user-i-need-a-google-search-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26195814400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As an end user I can search cats using the google",
  "description": "",
  "id": "as-an-end-user-i-need-a-google-search-feature;as-an-end-user-i-can-search-cats-using-the-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@cat"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on Google page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSteps.iAmOnActionPage()"
});
formatter.result({
  "duration": 1775296000,
  "status": "passed"
});
formatter.after({
  "duration": 1080699300,
  "status": "passed"
});
formatter.uri("Sample1.feature");
formatter.feature({
  "line": 1,
  "name": "Introduction to cucumber part 1",
  "description": "As a test engineer\r\nI want to be able to write and execute a simple scenario",
  "id": "introduction-to-cucumber-part-1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20680359500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Simple scenario",
  "description": "",
  "id": "introduction-to-cucumber-part-1;simple-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@cat"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see home page header",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should see home page description",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see menu",
  "keyword": "And "
});
formatter.match({
  "location": "SampleSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 1702014500,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iShouldSeeHomePageHeader()"
});
formatter.result({
  "duration": 321758700,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iShouldSeeHomePageDescription()"
});
formatter.result({
  "duration": 124154300,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iShouldSeeMenu()"
});
formatter.result({
  "duration": 107350600,
  "status": "passed"
});
formatter.after({
  "duration": 1918041900,
  "status": "passed"
});
});