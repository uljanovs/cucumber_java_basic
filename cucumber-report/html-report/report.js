$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/activity.feature");
formatter.feature({
  "line": 1,
  "name": "I google stuff",
  "description": "",
  "id": "i-google-stuff",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15453501200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "As and end user I can search cats using google",
  "description": "",
  "id": "i-google-stuff;as-and-end-user-i-can-search-cats-using-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cat"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on googling page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter search phrase: \"cat\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click search",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I confirm i searched for: \"cat\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I look at cats for 10 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I go back",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I confirm im in google",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSteps.i_am_on_googling_page()"
});
formatter.result({
  "duration": 2122749300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cat",
      "offset": 24
    }
  ],
  "location": "GoogleSteps.i_enter_search_phrase(String)"
});
formatter.result({
  "duration": 218627900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.i_click_search()"
});
formatter.result({
  "duration": 1997331500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cat",
      "offset": 27
    }
  ],
  "location": "GoogleSteps.i_confirm_i_searched_for(String)"
});
formatter.result({
  "duration": 29034200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 19
    }
  ],
  "location": "GoogleSteps.i_look_at_cats_for_seconds(int)"
});
formatter.result({
  "duration": 10000360800,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.i_go_back()"
});
formatter.result({
  "duration": 261292500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.i_confirm_im_in_google()"
});
formatter.result({
  "duration": 35266300,
  "status": "passed"
});
formatter.after({
  "duration": 1175014700,
  "status": "passed"
});
});