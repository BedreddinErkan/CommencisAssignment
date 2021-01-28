$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TheLatestNews.feature");
formatter.feature({
  "name": "The Latest News",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Done"
    }
  ]
});
formatter.scenario({
  "name": "Author and Pictures",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Done"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should able access main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.assignment.step_definitions.TheLatestNewsStep_Def.user_should_able_access_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user should see \"The Latest\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.assignment.step_definitions.TheLatestNewsStep_Def.verify_user_should_see(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify each news has \"author\" and \"image\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.assignment.step_definitions.TheLatestNewsStep_Def.verify_each_news_has_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The Latest News page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Done"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should able access main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.assignment.step_definitions.TheLatestNewsStep_Def.user_should_able_access_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click one of news from \"The Latest News\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.assignment.step_definitions.TheLatestNewsStep_Def.user_click_one_of_news_from(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"news title\" and \"page title\" is same",
  "keyword": "And "
});
formatter.match({
  "location": "com.assignment.step_definitions.TheLatestNewsStep_Def.verify_and_is_same(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the \"links\" within the news content",
  "keyword": "Then "
});
formatter.match({
  "location": "com.assignment.step_definitions.TheLatestNewsStep_Def.verify_the_within_the_news_content(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});