package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.AccountHomePagePO;
import com.testing.pageObject.AccountLoginPagePO;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("my account page is displayed")
    public void myAccountPageIsDisplayed() {
    }

    @Given("I open the create an account page")
    public void iOpenTheCreateAnAccountPage() {
    }

    @When("I put {string} {string} {string} {string} {string}")
    public void iPut(String Firstname, String Lastname, String Email, String Password, String ConfirmPassword) {
    }

    @And("The create an account button is click on")
    public void theCreateAnAccountButtonIsClickOn() {
    }

    @Then("Error message customer account already exist should be displayed")
    public void errorMessageCustomerAccountAlreadyExistShouldBeDisplayed() {
    }

    @Given("I opened the customer login page")
    public void iOpenedTheCustomerLoginPage() {
    }

    @When("I put {string} {string}")
    public void iPut(String Username, String Password) {
    }

    @And("The sign in button is click on")
    public void theSignInButtonIsClickOn() {
    }

    @Then("Error message customer not registered to login should be displayed")
    public void errorMessageCustomerNotRegisteredToLoginShouldBeDisplayed() {
    }


    public class AccountLoginSteps {
    WebDriver driver = Hooks.driver;

    @Given("I am on customer login page")
    public void iAmOnCustomerLoginPage() {
        AccountHomePagePO accountHomePagePO = new AccountHomePagePO(driver);
        accountHomePagePO.clickSignInLink();
    }

    @When("I enter {string} {string}")
    public void iEnter(String UserName, String Password) {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.enterUserName(UserName);
        accountLoginPagePO.enterPassword(Password);
    }

    @And("I click on sign in button")
    public void iClickOnSignInButton() {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.clickSignInButton();
    }

    @Then("I should be successfully login")
    public void iShouldBeSuccessfullyLogin() {
    }
}
