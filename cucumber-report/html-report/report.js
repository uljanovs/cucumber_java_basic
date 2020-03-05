$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample4.feature");
formatter.feature({
  "line": 2,
  "name": "Introduction to cucumber part 4",
  "description": "As a test engineer\r\nI want to be able to write and execute a scenario with steps that have 1 column table",
  "id": "introduction-to-cucumber-part-4",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@part4"
    }
  ]
});
formatter.before({
  "duration": 16197501700,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on age page",
  "keyword": "Given "
});
formatter.match({
  "location": "SampleSteps.iAmOnAgePage()"
});
formatter.result({
  "duration": 1764352100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "a new scenario with 1-row table",
  "description": "",
  "id": "introduction-to-cucumber-part-4;a-new-scenario-with-1-row-table",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on action page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I clicked on checkboxes:",
  "rows": [
    {
      "cells": [
        "Option 1"
      ],
      "line": 12
    },
    {
      "cells": [
        "Option 3"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click the result checkbox button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "message for checkboxes \"You selected value(s): Option 1, Option 3\" is seen",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.iAmOnActionPage()"
});
formatter.result({
  "duration": 405369600,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iClickedOnCheckboxes(String\u003e)"
});
formatter.result({
  "duration": 10178288500,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iClickTheResultCheckboxButton()"
});
formatter.result({
  "duration": 97560800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You selected value(s): Option 1, Option 3",
      "offset": 24
    }
  ],
  "location": "SampleSteps.messageForCheckboxesIsSeen(String)"
});
formatter.result({
  "duration": 65433600,
  "status": "passed"
});
formatter.after({
  "duration": 897944900,
  "status": "passed"
});
});