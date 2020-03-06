$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Activity.feature");
formatter.feature({
  "line": 1,
  "name": "tests for performing search",
  "description": "As an end user I need to use a Google search",
  "id": "tests-for-performing-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "As an end user I can search animolz using Google",
  "description": "",
  "id": "tests-for-performing-search;as-an-end-user-i-can-search-animolz-using-google",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enter \"\u003ccharacteristic\u003e\" \"\u003canimalz\u003e\" to the search field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I press Search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see search results",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "tests-for-performing-search;as-an-end-user-i-can-search-animolz-using-google;",
  "rows": [
    {
      "cells": [
        "characteristic",
        "animalz"
      ],
      "line": 13,
      "id": "tests-for-performing-search;as-an-end-user-i-can-search-animolz-using-google;;1"
    },
    {
      "cells": [
        "cute",
        "cat"
      ],
      "line": 14,
      "id": "tests-for-performing-search;as-an-end-user-i-can-search-animolz-using-google;;2"
    },
    {
      "cells": [
        "good",
        "rat"
      ],
      "line": 15,
      "id": "tests-for-performing-search;as-an-end-user-i-can-search-animolz-using-google;;3"
    },
    {
      "cells": [
        "gorgeous",
        "wombat"
      ],
      "line": 16,
      "id": "tests-for-performing-search;as-an-end-user-i-can-search-animolz-using-google;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16072566200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on google page",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.i_am_on_google_page()"
});
formatter.result({
  "duration": 2076441000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "As an end user I can search animolz using Google",
  "description": "",
  "id": "tests-for-performing-search;as-an-end-user-i-can-search-animolz-using-google;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enter \"cute\" \"cat\" to the search field",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I press Search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see search results",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "cute",
      "offset": 9
    },
    {
      "val": "cat",
      "offset": 16
    }
  ],
  "location": "ActivitySteps.iEnterToTheSearchField(String,String)"
});
formatter.result({
  "duration": 422299700,
  "status": "passed"
});
formatter.match({
  "location": "ActivitySteps.i_press_Search_button()"
});
formatter.result({
  "duration": 1674943700,
  "status": "passed"
});
formatter.match({
  "location": "ActivitySteps.i_should_see_search_results()"
});
formatter.result({
  "duration": 37747400,
  "status": "passed"
});
formatter.after({
  "duration": 841293000,
  "status": "passed"
});
formatter.before({
  "duration": 13772952200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on google page",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.i_am_on_google_page()"
});
formatter.result({
  "duration": 1797167800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "As an end user I can search animolz using Google",
  "description": "",
  "id": "tests-for-performing-search;as-an-end-user-i-can-search-animolz-using-google;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enter \"good\" \"rat\" to the search field",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I press Search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see search results",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "good",
      "offset": 9
    },
    {
      "val": "rat",
      "offset": 16
    }
  ],
  "location": "ActivitySteps.iEnterToTheSearchField(String,String)"
});
formatter.result({
  "duration": 591680600,
  "status": "passed"
});
formatter.match({
  "location": "ActivitySteps.i_press_Search_button()"
});
formatter.result({
  "duration": 2419936200,
  "status": "passed"
});
formatter.match({
  "location": "ActivitySteps.i_should_see_search_results()"
});
formatter.result({
  "duration": 44473800,
  "status": "passed"
});
formatter.after({
  "duration": 1109023600,
  "status": "passed"
});
formatter.before({
  "duration": 14123726000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on google page",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitySteps.i_am_on_google_page()"
});
formatter.result({
  "duration": 1554665600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "As an end user I can search animolz using Google",
  "description": "",
  "id": "tests-for-performing-search;as-an-end-user-i-can-search-animolz-using-google;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enter \"gorgeous\" \"wombat\" to the search field",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I press Search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see search results",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "gorgeous",
      "offset": 9
    },
    {
      "val": "wombat",
      "offset": 20
    }
  ],
  "location": "ActivitySteps.iEnterToTheSearchField(String,String)"
});
formatter.result({
  "duration": 589453500,
  "status": "passed"
});
formatter.match({
  "location": "ActivitySteps.i_press_Search_button()"
});
formatter.result({
  "duration": 2062342600,
  "status": "passed"
});
formatter.match({
  "location": "ActivitySteps.i_should_see_search_results()"
});
formatter.result({
  "duration": 33479900,
  "status": "passed"
});
formatter.after({
  "duration": 964133500,
  "status": "passed"
});
});