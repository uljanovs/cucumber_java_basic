$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample1.feature");
formatter.feature({
  "line": 1,
  "name": "Introduction to cucumber part 1",
  "description": "As a test engineer\r\nI want to be able to write and execute a simple scenario",
  "id": "introduction-to-cucumber-part-1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9630715100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Simple scenario 2",
  "description": "",
  "id": "introduction-to-cucumber-part-1;simple-scenario-2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Given Hi MAN!"
    },
    {
      "line": 13,
      "value": "# And I should see home page description like my wife"
    }
  ],
  "line": 14,
  "name": "I should see Tamilla and Infvars",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 691125400,
  "status": "passed"
});
});