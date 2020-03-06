$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Task2.feature");
formatter.feature({
  "line": 1,
  "name": "I test numbers",
  "description": "",
  "id": "i-test-numbers",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "I add a new person and reset list",
  "description": "",
  "id": "i-test-numbers;i-add-a-new-person-and-reset-list",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@addperson"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I press add person button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the name: \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter job: \"\u003cjob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I press add",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I check that person is added: \"\u003cname\u003e\" \"\u003cjob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "i-test-numbers;i-add-a-new-person-and-reset-list;",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ],
      "line": 15,
      "id": "i-test-numbers;i-add-a-new-person-and-reset-list;;1"
    },
    {
      "cells": [
        "john",
        "janitor"
      ],
      "line": 16,
      "id": "i-test-numbers;i-add-a-new-person-and-reset-list;;2"
    },
    {
      "cells": [
        "jane",
        "cleaner"
      ],
      "line": 17,
      "id": "i-test-numbers;i-add-a-new-person-and-reset-list;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17754411000,
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
  "name": "I am on People with jobs page",
  "keyword": "Given "
});
formatter.match({
  "location": "task2steps.i_am_on_People_with_jobs_page()"
});
formatter.result({
  "duration": 1458489700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "I add a new person and reset list",
  "description": "",
  "id": "i-test-numbers;i-add-a-new-person-and-reset-list;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@addperson"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I press add person button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the name: \"john\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter job: \"janitor\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I press add",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I check that person is added: \"john\" \"janitor\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "task2steps.i_press_add_person_button()"
});
formatter.result({
  "duration": 356396900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john",
      "offset": 19
    }
  ],
  "location": "task2steps.i_enter_the_name(String)"
});
formatter.result({
  "duration": 164945200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "janitor",
      "offset": 14
    }
  ],
  "location": "task2steps.i_enter_job(String)"
});
formatter.result({
  "duration": 153746200,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_press_add()"
});
formatter.result({
  "duration": 2563971300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john",
      "offset": 31
    },
    {
      "val": "janitor",
      "offset": 38
    }
  ],
  "location": "task2steps.i_check_that_person_is_added(String,String)"
});
formatter.result({
  "duration": 222347100,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_reset_list()"
});
formatter.result({
  "duration": 261725300,
  "status": "passed"
});
formatter.after({
  "duration": 1097945900,
  "status": "passed"
});
formatter.before({
  "duration": 17289385400,
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
  "name": "I am on People with jobs page",
  "keyword": "Given "
});
formatter.match({
  "location": "task2steps.i_am_on_People_with_jobs_page()"
});
formatter.result({
  "duration": 815426600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "I add a new person and reset list",
  "description": "",
  "id": "i-test-numbers;i-add-a-new-person-and-reset-list;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@addperson"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I press add person button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter the name: \"jane\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter job: \"cleaner\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I press add",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I check that person is added: \"jane\" \"cleaner\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "task2steps.i_press_add_person_button()"
});
formatter.result({
  "duration": 296253100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jane",
      "offset": 19
    }
  ],
  "location": "task2steps.i_enter_the_name(String)"
});
formatter.result({
  "duration": 140654300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cleaner",
      "offset": 14
    }
  ],
  "location": "task2steps.i_enter_job(String)"
});
formatter.result({
  "duration": 143474700,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_press_add()"
});
formatter.result({
  "duration": 153165700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jane",
      "offset": 31
    },
    {
      "val": "cleaner",
      "offset": 38
    }
  ],
  "location": "task2steps.i_check_that_person_is_added(String,String)"
});
formatter.result({
  "duration": 102408400,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_reset_list()"
});
formatter.result({
  "duration": 331886900,
  "status": "passed"
});
formatter.after({
  "duration": 1032067800,
  "status": "passed"
});
formatter.before({
  "duration": 13010740800,
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
  "name": "I am on People with jobs page",
  "keyword": "Given "
});
formatter.match({
  "location": "task2steps.i_am_on_People_with_jobs_page()"
});
formatter.result({
  "duration": 761921700,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "I edit person",
  "description": "",
  "id": "i-test-numbers;i-edit-person",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@editperson"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I press edit button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I edit name: \"NewName\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I edit job: \"NewJob\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I press edit",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I check that person is edited: \"NewName\" \"NewJob\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "task2steps.i_press_edit_button()"
});
formatter.result({
  "duration": 390481900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewName",
      "offset": 14
    }
  ],
  "location": "task2steps.i_edit_name(String)"
});
formatter.result({
  "duration": 307700100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewJob",
      "offset": 13
    }
  ],
  "location": "task2steps.i_edit_job(String)"
});
formatter.result({
  "duration": 308046500,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_press_edit()"
});
formatter.result({
  "duration": 206062000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewName",
      "offset": 32
    },
    {
      "val": "NewJob",
      "offset": 42
    }
  ],
  "location": "task2steps.i_check_that_person_is_edited(String,String)"
});
formatter.result({
  "duration": 120428900,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_reset_list()"
});
formatter.result({
  "duration": 170241800,
  "status": "passed"
});
formatter.after({
  "duration": 1124929500,
  "status": "passed"
});
formatter.before({
  "duration": 14203295100,
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
  "name": "I am on People with jobs page",
  "keyword": "Given "
});
formatter.match({
  "location": "task2steps.i_am_on_People_with_jobs_page()"
});
formatter.result({
  "duration": 738199000,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "I remove person",
  "description": "",
  "id": "i-test-numbers;i-remove-person",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@removeperson"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I press remove person",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I check that person is removed",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "task2steps.i_press_remove_person()"
});
formatter.result({
  "duration": 297198200,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_check_that_person_is_removed()"
});
formatter.result({
  "duration": 38120200,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_reset_list()"
});
formatter.result({
  "duration": 136445900,
  "status": "passed"
});
formatter.after({
  "duration": 916210500,
  "status": "passed"
});
formatter.before({
  "duration": 15600329100,
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
  "name": "I am on People with jobs page",
  "keyword": "Given "
});
formatter.match({
  "location": "task2steps.i_am_on_People_with_jobs_page()"
});
formatter.result({
  "duration": 749400500,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "I check Clear all fields button",
  "description": "",
  "id": "i-test-numbers;i-check-clear-all-fields-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@clear"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "I press add person button",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "I enter the name: \"John\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I enter job: \"Janitor\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click clear all fields",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "I check that fields are empty",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I click cancel",
  "keyword": "Then "
});
formatter.match({
  "location": "task2steps.i_press_add_person_button()"
});
formatter.result({
  "duration": 280105300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 19
    }
  ],
  "location": "task2steps.i_enter_the_name(String)"
});
formatter.result({
  "duration": 155769400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Janitor",
      "offset": 14
    }
  ],
  "location": "task2steps.i_enter_job(String)"
});
formatter.result({
  "duration": 130883600,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_click_clear_all_fields()"
});
formatter.result({
  "duration": 118777600,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_check_that_fields_are_empty()"
});
formatter.result({
  "duration": 54742800,
  "status": "passed"
});
formatter.match({
  "location": "task2steps.i_click_cancel()"
});
formatter.result({
  "duration": 131757600,
  "status": "passed"
});
formatter.after({
  "duration": 955661000,
  "status": "passed"
});
});