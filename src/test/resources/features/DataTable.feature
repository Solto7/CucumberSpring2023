Feature: Data Table Example
@table
  Scenario: Registration functionality
    Given user is on registration page
    And fill up the form with following data
      | john doe | leo messi | lebron james |
      | cr7      | benzema   | kante        |