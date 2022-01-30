$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Cucumber_Background_color.feature");
formatter.feature({
  "line": 1,
  "name": "Background Color Functionality Testing",
  "description": "",
  "id": "background-color-functionality-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2714069700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Sky Blue Background",
  "description": "",
  "id": "background-color-functionality-testing;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on the \"Set SkyBlue Background\" button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.Set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 3195638500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 19
    }
  ],
  "location": "LoginStepDefinition.user_click_on_the_button(String)"
});
formatter.result({
  "duration": 3064159600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 219765900,
  "status": "passed"
});
formatter.after({
  "duration": 111811500,
  "status": "passed"
});
formatter.before({
  "duration": 1964616000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "White Background Change",
  "description": "",
  "id": "background-color-functionality-testing;white-background-change",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User click on the \"Set SkyWhite Background\" button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.Set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 3092901600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyWhite Background",
      "offset": 19
    }
  ],
  "location": "LoginStepDefinition.user_click_on_the_button(String)"
});
formatter.result({
  "duration": 3056744500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 145638000,
  "status": "passed"
});
formatter.after({
  "duration": 92522200,
  "status": "passed"
});
});