@Done
Feature: The Latest News

  Scenario: Author and Pictures
    Given user should able access main page
    And verify user should see "The Latest"
    Then verify each news has "author" and "image"


    @wip
    Scenario:The Latest News page
      Given user should able access main page
      When user click one of news from "The Latest News"
      And verify "news title" and "page title" is same
      Then verify the "links" within the news content

