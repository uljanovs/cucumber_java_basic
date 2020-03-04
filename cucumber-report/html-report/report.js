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
  "duration": 10236008883,
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
  "duration": 1752324498,
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
  "duration": 511688684,
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
  "duration": 252094614,
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
  "duration": 192945637,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iConfirmAddition()"
});
formatter.result({
  "duration": 299297827,
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
  "duration": 189758047,
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
  "duration": 143253722,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iResetList()"
});
formatter.result({
  "duration": 297531619,
  "status": "passed"
});
formatter.after({
  "duration": 982298924,
  "status": "passed"
});
formatter.before({
  "duration": 6811618692,
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
  "duration": 2818033383,
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
  "duration": 588124125,
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
  "duration": 230005213,
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
  "duration": 330743716,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iConfirmAddition()"
});
formatter.result({
  "duration": 361763704,
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
  "duration": 163738552,
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
  "duration": 158893026,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iResetList()"
});
formatter.result({
  "duration": 308220718,
  "status": "passed"
});
formatter.after({
  "duration": 783444547,
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
  "duration": 6006316682,
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
  "duration": 2917868256,
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
  "duration": 708888202,
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
  "duration": 581695580,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iConfirmEditing()"
});
formatter.result({
  "duration": 288471722,
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
  "duration": 275724956,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iResetList()"
});
formatter.result({
  "duration": 349471574,
  "status": "passed"
});
formatter.after({
  "duration": 730319252,
  "status": "passed"
});
formatter.before({
  "duration": 6194056572,
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
  "duration": 1662061116,
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
  "duration": 587811113,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iCheckThatPersonRemoved()"
});
formatter.result({
  "duration": 111083288,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iResetList()"
});
formatter.result({
  "duration": 484934380,
  "status": "passed"
});
formatter.after({
  "duration": 1448981121,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 35,
  "name": "I click on Clear button while adding a person",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-click-on-clear-button-while-adding-a-person",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 36,
  "name": "I press add button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "I add \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "add \"\u003cjob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I check fields \"\u003cname\u003e\" and \"\u003cjob\u003e\" are filled correctly",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I press Clear button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I check that fields are empty",
  "keyword": "Then "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-click-on-clear-button-while-adding-a-person;",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ],
      "line": 43,
      "id": "testing-\"list-of-people\"-page;i-click-on-clear-button-while-adding-a-person;;1"
    },
    {
      "cells": [
        "Joe",
        "HR"
      ],
      "line": 44,
      "id": "testing-\"list-of-people\"-page;i-click-on-clear-button-while-adding-a-person;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6236106379,
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
  "duration": 1374198485,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "I click on Clear button while adding a person",
  "description": "",
  "id": "testing-\"list-of-people\"-page;i-click-on-clear-button-while-adding-a-person;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 36,
  "name": "I press add button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "I add \"Joe\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "add \"HR\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I check fields \"Joe\" and \"HR\" are filled correctly",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I press Clear button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I check that fields are empty",
  "keyword": "Then "
});
formatter.match({
  "location": "Task2StepDef.iPressAddButton()"
});
formatter.result({
  "duration": 458576730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Joe",
      "offset": 7
    }
  ],
  "location": "Task2StepDef.iAdd(String)"
});
formatter.result({
  "duration": 214805666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HR",
      "offset": 5
    }
  ],
  "location": "Task2StepDef.add(String)"
});
formatter.result({
  "duration": 181052726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Joe",
      "offset": 16
    },
    {
      "val": "HR",
      "offset": 26
    }
  ],
  "location": "Task2StepDef.iCheckFieldsAndAreFilledCorrectly(String,String)"
});
formatter.result({
  "duration": 87539665,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iPressClearButton()"
});
formatter.result({
  "duration": 281058986,
  "status": "passed"
});
formatter.match({
  "location": "Task2StepDef.iCheckThatFieldsAreEmpty()"
});
formatter.result({
  "duration": 113338512,
  "status": "passed"
});
formatter.after({
  "duration": 733418582,
  "status": "passed"
});
});