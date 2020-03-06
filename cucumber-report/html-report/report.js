$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Task1.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I need to calculate some values",
  "description": "",
  "id": "as-a-user-i-need-to-calculate-some-values",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "As an user I input incorrect values",
  "description": "",
  "id": "as-a-user-i-need-to-calculate-some-values;as-an-user-i-input-incorrect-values",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@error"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I see empty calculation field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I input an incorrect value \"\u003cvalue\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I press a search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see the error message \"\u003cresult\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "as-a-user-i-need-to-calculate-some-values;as-an-user-i-input-incorrect-values;",
  "rows": [
    {
      "cells": [
        "value",
        "result"
      ],
      "line": 15,
      "id": "as-a-user-i-need-to-calculate-some-values;as-an-user-i-input-incorrect-values;;1"
    },
    {
      "cells": [
        "48",
        "Number is too small"
      ],
      "line": 16,
      "id": "as-a-user-i-need-to-calculate-some-values;as-an-user-i-input-incorrect-values;;2"
    },
    {
      "cells": [
        "101",
        "Number is too big"
      ],
      "line": 17,
      "id": "as-a-user-i-need-to-calculate-some-values;as-an-user-i-input-incorrect-values;;3"
    },
    {
      "cells": [
        "Hi!",
        "Please enter a number"
      ],
      "line": 18,
      "id": "as-a-user-i-need-to-calculate-some-values;as-an-user-i-input-incorrect-values;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 30161276600,
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
  "name": "I open a page",
  "keyword": "Given "
});
formatter.match({
  "location": "TaskOneSteps.iOpenPage()"
});
formatter.result({
  "duration": 1435711900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "As an user I input incorrect values",
  "description": "",
  "id": "as-a-user-i-need-to-calculate-some-values;as-an-user-i-input-incorrect-values;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@error"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I see empty calculation field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I input an incorrect value \"48\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I press a search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see the error message \"Number is too small\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TaskOneSteps.emptyField()"
});
formatter.result({
  "duration": 184710500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "48",
      "offset": 28
    }
  ],
  "location": "TaskOneSteps.iInputAnIncorrectValue(String)"
});
formatter.result({
  "duration": 182989600,
  "status": "passed"
});
formatter.match({
  "location": "TaskOneSteps.iPressButton()"
});
formatter.result({
  "duration": 164689400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number is too small",
      "offset": 25
    }
  ],
  "location": "TaskOneSteps.seeTheErrorMessage(String)"
});
formatter.result({
  "duration": 75788800,
  "status": "passed"
});
formatter.after({
  "duration": 2184719400,
  "status": "passed"
});
formatter.before({
  "duration": 27636547000,
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
  "name": "I open a page",
  "keyword": "Given "
});
formatter.match({
  "location": "TaskOneSteps.iOpenPage()"
});
formatter.result({
  "duration": 1657430200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "As an user I input incorrect values",
  "description": "",
  "id": "as-a-user-i-need-to-calculate-some-values;as-an-user-i-input-incorrect-values;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@error"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I see empty calculation field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I input an incorrect value \"101\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I press a search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see the error message \"Number is too big\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TaskOneSteps.emptyField()"
});
formatter.result({
  "duration": 304619500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "101",
      "offset": 28
    }
  ],
  "location": "TaskOneSteps.iInputAnIncorrectValue(String)"
});
formatter.result({
  "duration": 286458900,
  "status": "passed"
});
formatter.match({
  "location": "TaskOneSteps.iPressButton()"
});
formatter.result({
  "duration": 138056300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number is too big",
      "offset": 25
    }
  ],
  "location": "TaskOneSteps.seeTheErrorMessage(String)"
});
formatter.result({
  "duration": 71562900,
  "status": "passed"
});
formatter.after({
  "duration": 1432190000,
  "status": "passed"
});
formatter.before({
  "duration": 23429665200,
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
  "name": "I open a page",
  "keyword": "Given "
});
formatter.match({
  "location": "TaskOneSteps.iOpenPage()"
});
formatter.result({
  "duration": 9374176500,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "As an user I input incorrect values",
  "description": "",
  "id": "as-a-user-i-need-to-calculate-some-values;as-an-user-i-input-incorrect-values;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@error"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I see empty calculation field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I input an incorrect value \"Hi!\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I press a search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see the error message \"Please enter a number\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TaskOneSteps.emptyField()"
});
formatter.result({
  "duration": 111448700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hi!",
      "offset": 28
    }
  ],
  "location": "TaskOneSteps.iInputAnIncorrectValue(String)"
});
formatter.result({
  "duration": 122192400,
  "status": "passed"
});
formatter.match({
  "location": "TaskOneSteps.iPressButton()"
});
formatter.result({
  "duration": 91476200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please enter a number",
      "offset": 25
    }
  ],
  "location": "TaskOneSteps.seeTheErrorMessage(String)"
});
formatter.result({
  "duration": 48370300,
  "status": "passed"
});
formatter.after({
  "duration": 948789300,
  "status": "passed"
});
formatter.before({
  "duration": 21261910100,
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
  "name": "I open a page",
  "keyword": "Given "
});
formatter.match({
  "location": "TaskOneSteps.iOpenPage()"
});
formatter.result({
  "duration": 1456508300,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "As a user I enter correct value",
  "description": "",
  "id": "as-a-user-i-need-to-calculate-some-values;as-a-user-i-enter-correct-value",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@correct"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I input correct value 100",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I press search button again",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I see alert message with text",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 22
    }
  ],
  "location": "TaskOneSteps.iInputCorrectValue()"
});
formatter.result({
  "duration": 469100,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027stepDefinitions.TaskOneSteps.iInputCorrectValue() in file:/C:/workspace/cucumber_java_basic/target/test-classes/\u0027 with pattern [^I input correct value (\\d+)$] is declared with 0 parameters. However, the gherkin step has 1 arguments [100]. \nStep: When I input correct value 100\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TaskOneSteps.iPressSearchButtonAgain()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaskOneSteps.iSeeAlertMessageWithText()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://uljanovs.github.io/site/tasks/enter_a_number");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2938240100,
  "status": "passed"
});
});