$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Activity.feature");
formatter.feature({
  "line": 1,
  "name": "tests for performing search",
  "description": "As an end user I need to use a Google search",
  "id": "tests-for-performing-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16057686700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "As an end user I can search cats using Google",
  "description": "",
  "id": "tests-for-performing-search;as-an-end-user-i-can-search-cats-using-google",
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
  "name": "I am on google page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter cute cats to the search field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I press Search button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see search results",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivitySteps.i_am_on_google_page()"
});
formatter.result({
  "duration": 2125590000,
  "status": "passed"
});
formatter.match({
  "location": "ActivitySteps.i_enter_cute_cats_to_the_search_field()"
});
formatter.result({
  "duration": 297458400,
  "status": "passed"
});
formatter.match({
  "location": "ActivitySteps.i_press_Search_button()"
});
formatter.result({
  "duration": 2083791400,
  "status": "passed"
});
formatter.match({
  "location": "ActivitySteps.i_should_see_search_results()"
});
formatter.result({
  "duration": 50817100,
  "status": "passed"
});
formatter.after({
  "duration": 1244265400,
  "status": "passed"
});
});