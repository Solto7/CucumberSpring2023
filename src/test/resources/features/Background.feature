@backGround
Feature: How to use Background
# Чтобы не дублировать Шаги,

  Background: Open amazon and click search button
    Given user open amazon.com
    And user click search button

  Scenario: Background: test
    Then Hello

  Scenario: Background: test
    Then hi

  Scenario: Background: test
    Then bye

