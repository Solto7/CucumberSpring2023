package com.digital.stepDefinitions;

import io.cucumber.java.en.Given;

public class ScenarioOutlineSteps {
    @Given("enter the firstName {string}")
    public void enter_the_first_name(String firstName) {
        System.out.println(firstName);
        
    }
    @Given("enter the lastName {string}")
    public void enter_the_last_name(String lastName) {
        System.out.println(lastName);
        
    }
    @Given("enter the email {string}")
    public void enter_the_email(String email) {
        System.out.println(email);
    }
}
