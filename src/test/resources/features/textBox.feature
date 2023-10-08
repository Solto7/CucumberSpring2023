Feature: Text Box

  @Smoke
  Scenario: Verify all needed fields and buttons are presented in the page
    Given user should open "https://demoqa.com/text-box"
    And verify Full Name text is displayed
    And verify Email text is displayed
    And Verify Current Address text displayed
    And Verify Permanent Address text displayed
    And Verify Submit button is displayed

