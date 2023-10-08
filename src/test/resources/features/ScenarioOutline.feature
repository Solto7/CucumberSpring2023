Feature: Scenario Outline example
  #DataProvider Same like
@outline
  Scenario Outline: Create new user
    Given enter the firstName "<firstName>"
    And enter the lastName "<lastName>"
    And enter the email "<email>"
    Examples:
      | firstName | lastName | email           |
      | John      | doe      | john@gmail.com  |
      | Leo       | Messi    | messi@gmail.com |
