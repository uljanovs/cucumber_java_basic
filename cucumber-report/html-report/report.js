$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Activity_2.feature");
formatter.feature({
  "line": 1,
  "name": "As an end user I need a Google search feature for all Animals I like",
  "description": "",
  "id": "as-an-end-user-i-need-a-google-search-feature-for-all-animals-i-like",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "As an end user I can search my favorite animals using the google",
  "description": "",
  "id": "as-an-end-user-i-need-a-google-search-feature-for-all-animals-i-like;as-an-end-user-i-can-search-my-favorite-animals-using-the-google",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter: \"\u003canimal\u003e\" in search field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I search",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see results",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "as-an-end-user-i-need-a-google-search-feature-for-all-animals-i-like;as-an-end-user-i-can-search-my-favorite-animals-using-the-google;",
  "rows": [
    {
      "cells": [
        "animal"
      ],
      "line": 17,
      "id": "as-an-end-user-i-need-a-google-search-feature-for-all-animals-i-like;as-an-end-user-i-can-search-my-favorite-animals-using-the-google;;1"
    },
    {
      "cells": [
        "frog"
      ],
      "line": 18,
      "id": "as-an-end-user-i-need-a-google-search-feature-for-all-animals-i-like;as-an-end-user-i-can-search-my-favorite-animals-using-the-google;;2"
    },
    {
      "cells": [
        "pig"
      ],
      "line": 19,
      "id": "as-an-end-user-i-need-a-google-search-feature-for-all-animals-i-like;as-an-end-user-i-can-search-my-favorite-animals-using-the-google;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9734494300,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am on Google page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSteps.iAmOnActionPage()"
});
formatter.result({
  "duration": 1309207700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "As an end user I can search my favorite animals using the google",
  "description": "",
  "id": "as-an-end-user-i-need-a-google-search-feature-for-all-animals-i-like;as-an-end-user-i-can-search-my-favorite-animals-using-the-google;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter: \"frog\" in search field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I search",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see results",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "frog",
      "offset": 10
    }
  ],
  "location": "GoogleSteps.iEnterName(String)"
});
formatter.result({
  "duration": 96892800,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.iClickGoogleSearch()"
});
formatter.result({
  "duration": 1724407500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.iSeeResultIsNotEmpty()"
});
formatter.result({
  "duration": 26978600,
  "status": "passed"
});
formatter.after({
  "duration": 707936600,
  "status": "passed"
});
formatter.before({
  "duration": 9191221800,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am on Google page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSteps.iAmOnActionPage()"
});
formatter.result({
  "duration": 1227118300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "As an end user I can search my favorite animals using the google",
  "description": "",
  "id": "as-an-end-user-i-need-a-google-search-feature-for-all-animals-i-like;as-an-end-user-i-can-search-my-favorite-animals-using-the-google;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter: \"pig\" in search field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I search",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see results",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "pig",
      "offset": 10
    }
  ],
  "location": "GoogleSteps.iEnterName(String)"
});
formatter.result({
  "duration": 92978600,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.iClickGoogleSearch()"
});
formatter.result({
  "duration": 1619200400,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.iSeeResultIsNotEmpty()"
});
formatter.result({
  "duration": 22139300,
  "status": "passed"
});
formatter.after({
  "duration": 693228100,
  "status": "passed"
});
});