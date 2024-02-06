package com.testing.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountManagementSteps {
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
    }

    @Then("my account page is displayed")
    public void myAccountPageIsDisplayed() {
    }
}
