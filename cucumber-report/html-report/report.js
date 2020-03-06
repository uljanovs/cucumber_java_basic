$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Task1.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to use calculator",
  "description": "",
  "id": "as-a-user-i-want-to-use-calculator",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "check error cases",
  "description": "",
  "id": "as-a-user-i-want-to-use-calculator;check-error-cases",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter value: \"\u003cnumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see error message: \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-use-calculator;check-error-cases;",
  "rows": [
    {
      "cells": [
        "number",
        "message"
      ],
      "line": 12,
      "id": "as-a-user-i-want-to-use-calculator;check-error-cases;;1"
    },
    {
      "cells": [
        "25",
        "Number is too small"
      ],
      "line": 13,
      "id": "as-a-user-i-want-to-use-calculator;check-error-cases;;2"
    },
    {
      "cells": [
        "150",
        "Number is too big"
      ],
      "line": 14,
      "id": "as-a-user-i-want-to-use-calculator;check-error-cases;;3"
    },
    {
      "cells": [
        "abc",
        "Please enter a number"
      ],
      "line": 15,
      "id": "as-a-user-i-want-to-use-calculator;check-error-cases;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14230567300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "Task_1Steps.iAmOnCalculatorPage()"
});
formatter.result({
  "duration": 958684000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "check error cases",
  "description": "",
  "id": "as-a-user-i-want-to-use-calculator;check-error-cases;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter value: \"25\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see error message: \"Number is too small\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 16
    }
  ],
  "location": "Task_1Steps.iEnterValue(String)"
});
formatter.result({
  "duration": 130142600,
  "status": "passed"
});
formatter.match({
  "location": "Task_1Steps.iClickSubmit()"
});
formatter.result({
  "duration": 254685100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number is too small",
      "offset": 22
    }
  ],
  "location": "Task_1Steps.iSeeMessage(String)"
});
formatter.result({
  "duration": 55864700,
  "status": "passed"
});
formatter.after({
  "duration": 952902000,
  "status": "passed"
});
formatter.before({
  "duration": 14160542600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "Task_1Steps.iAmOnCalculatorPage()"
});
formatter.result({
  "duration": 818476100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "check error cases",
  "description": "",
  "id": "as-a-user-i-want-to-use-calculator;check-error-cases;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter value: \"150\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see error message: \"Number is too big\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "150",
      "offset": 16
    }
  ],
  "location": "Task_1Steps.iEnterValue(String)"
});
formatter.result({
  "duration": 147262200,
  "status": "passed"
});
formatter.match({
  "location": "Task_1Steps.iClickSubmit()"
});
formatter.result({
  "duration": 111018900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number is too big",
      "offset": 22
    }
  ],
  "location": "Task_1Steps.iSeeMessage(String)"
});
formatter.result({
  "duration": 134170400,
  "status": "passed"
});
formatter.after({
  "duration": 868423500,
  "status": "passed"
});
formatter.before({
  "duration": 13024886800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "Task_1Steps.iAmOnCalculatorPage()"
});
formatter.result({
  "duration": 749585300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "check error cases",
  "description": "",
  "id": "as-a-user-i-want-to-use-calculator;check-error-cases;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter value: \"abc\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see error message: \"Please enter a number\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "Task_1Steps.iEnterValue(String)"
});
formatter.result({
  "duration": 153655700,
  "status": "passed"
});
formatter.match({
  "location": "Task_1Steps.iClickSubmit()"
});
formatter.result({
  "duration": 107450900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please enter a number",
      "offset": 22
    }
  ],
  "location": "Task_1Steps.iSeeMessage(String)"
});
formatter.result({
  "duration": 71754800,
  "status": "passed"
});
formatter.after({
  "duration": 822222800,
  "status": "passed"
});
formatter.before({
  "duration": 13118956800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "Task_1Steps.iAmOnCalculatorPage()"
});
formatter.result({
  "duration": 844528100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "check with correct number",
  "description": "",
  "id": "as-a-user-i-want-to-use-calculator;check-with-correct-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I enter numbers",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "message with correct answer is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_1Steps.iEnterNumbers()"
});
formatter.result({
  "duration": 159310700,
  "status": "passed"
});
formatter.match({
  "location": "Task_1Steps.iClickSubmit()"
});
formatter.result({
  "duration": 140778900,
  "status": "passed"
});
formatter.match({
  "location": "Task_1Steps.messageWithCorrectAnswerIsDisplayed()"
});
formatter.result({
  "duration": 106969600,
  "status": "passed"
});
formatter.after({
  "duration": 902366400,
  "status": "passed"
});
});