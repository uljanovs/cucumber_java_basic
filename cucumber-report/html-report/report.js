$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Task2.feature");
formatter.feature({
  "line": 1,
  "name": "Testing \"List of people\" page",
  "description": "As an end user I need to be able to edit list  of people",
  "id": "testing-\"list-of-people\"-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "I add person to the list",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-add-person-to-the-list",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I press add button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I add \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "add \"\u003cjob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I confirm addition",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I check that \"\u003cname\u003e\" is correct",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I check \"\u003cjob\u003e\" is correct",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-add-person-to-the-list;",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ],
      "line": 16,
      "id": "testing-\"list-of-people\"-page;i-add-person-to-the-list;;1"
    },
    {
      "cells": [
        "Jenny",
        "nurse"
      ],
      "line": 17,
      "id": "testing-\"list-of-people\"-page;i-add-person-to-the-list;;2"
    },
    {
      "cells": [
        "Mike",
        "doctor"
      ],
      "line": 18,
      "id": "testing-\"list-of-people\"-page;i-add-person-to-the-list;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15897842600,
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
  "name": "I am on the List page",
  "keyword": "Given "
});
formatter.match({
  "location": "Task2StepDef.iAmOnTheListPage()"
});
formatter.result({
  "duration": 1072150500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "I add person to the list",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-add-person-to-the-list;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I press add button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I add \"Jenny\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "add \"nurse\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I confirm addition",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I check that \"Jenny\" is correct",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I check \"nurse\" is correct",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "Task2StepDef.iPressAddButton()"
});
formatter.result({
  "duration": 754554100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jenny",
      "offset": 7
    }
  ],
  "location": "Task2StepDef.iAdd(String)"
});
formatter.result({
  "duration": 150833400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nurse",
      "offset": 5
    }
  ],
  "location": "Task2StepDef.add(String)"
});
formatter.result({
  "duration": 147190700,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iConfirmAddition()"
});
formatter.result({
  "duration": 155416900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jenny",
      "offset": 14
    }
  ],
  "location": "Task2StepDef.iCheckThatIsCorrect(String)"
});
formatter.result({
  "duration": 115696700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nurse",
      "offset": 9
    }
  ],
  "location": "Task2StepDef.iCheckIsCorrect(String)"
});
formatter.result({
  "duration": 65275500,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iResetList()"
});
formatter.result({
  "duration": 158700300,
  "status": "passed"
});
formatter.after({
  "duration": 892064200,
  "status": "passed"
});
formatter.before({
  "duration": 15678838100,
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
  "name": "I am on the List page",
  "keyword": "Given "
});
formatter.match({
  "location": "Task2StepDef.iAmOnTheListPage()"
});
formatter.result({
  "duration": 1096010800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "I add person to the list",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-add-person-to-the-list;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I press add button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I add \"Mike\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "add \"doctor\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I confirm addition",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I check that \"Mike\" is correct",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I check \"doctor\" is correct",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "Task2StepDef.iPressAddButton()"
});
formatter.result({
  "duration": 343144500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mike",
      "offset": 7
    }
  ],
  "location": "Task2StepDef.iAdd(String)"
});
formatter.result({
  "duration": 155923700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "doctor",
      "offset": 5
    }
  ],
  "location": "Task2StepDef.add(String)"
});
formatter.result({
  "duration": 223461800,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iConfirmAddition()"
});
formatter.result({
  "duration": 422639100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mike",
      "offset": 14
    }
  ],
  "location": "Task2StepDef.iCheckThatIsCorrect(String)"
});
formatter.result({
  "duration": 213209500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "doctor",
      "offset": 9
    }
  ],
  "location": "Task2StepDef.iCheckIsCorrect(String)"
});
formatter.result({
  "duration": 109307100,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iResetList()"
});
formatter.result({
  "duration": 208005300,
  "status": "passed"
});
formatter.after({
  "duration": 1031632500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "I edit a person in a list",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-edit-a-person-in-a-list",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I press edit button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I edit \"\u003cname\u003e\" and \"\u003cjob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I confirm editing",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I check \"\u003cname\u003e\" and \"\u003cjob\u003e\" edited correctly",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-edit-a-person-in-a-list;",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ],
      "line": 27,
      "id": "testing-\"list-of-people\"-page;i-edit-a-person-in-a-list;;1"
    },
    {
      "cells": [
        "Liza",
        "janitor"
      ],
      "line": 28,
      "id": "testing-\"list-of-people\"-page;i-edit-a-person-in-a-list;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14734342800,
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
  "name": "I am on the List page",
  "keyword": "Given "
});
formatter.match({
  "location": "Task2StepDef.iAmOnTheListPage()"
});
formatter.result({
  "duration": 878176900,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "I edit a person in a list",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-edit-a-person-in-a-list;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I press edit button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I edit \"Liza\" and \"janitor\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I confirm editing",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I check \"Liza\" and \"janitor\" edited correctly",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "Task2StepDef.iPressEditButton()"
});
formatter.result({
  "duration": 365336700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Liza",
      "offset": 8
    },
    {
      "val": "janitor",
      "offset": 19
    }
  ],
  "location": "Task2StepDef.iEditAnd(String,String)"
});
formatter.result({
  "duration": 438889200,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iConfirmEditing()"
});
formatter.result({
  "duration": 348713100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Liza",
      "offset": 9
    },
    {
      "val": "janitor",
      "offset": 20
    }
  ],
  "location": "Task2StepDef.iCheckAndEditedCorrectly(String,String)"
});
formatter.result({
  "duration": 146846100,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iResetList()"
});
formatter.result({
  "duration": 186179400,
  "status": "passed"
});
formatter.after({
  "duration": 959402500,
  "status": "passed"
});
formatter.before({
  "duration": 14710298500,
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
  "name": "I am on the List page",
  "keyword": "Given "
});
formatter.match({
  "location": "Task2StepDef.iAmOnTheListPage()"
});
formatter.result({
  "duration": 957504200,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "I remove a person from list",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-remove-a-person-from-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I press Delete button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I check that person removed",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "Task2StepDef.iPressDeleteButton()"
});
formatter.result({
  "duration": 237040100,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iCheckThatPersonRemoved()"
});
formatter.result({
  "duration": 66578200,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iResetList()"
});
formatter.result({
  "duration": 191017700,
  "status": "passed"
});
formatter.after({
  "duration": 887477500,
  "status": "passed"
});
});