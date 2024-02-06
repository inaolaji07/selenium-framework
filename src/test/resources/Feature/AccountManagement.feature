@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then my account page is displayed

    Examples:
      | Firstname | Lastname | Email               | Password  | ConfirmPassword |
      | Peter     | Obi      | Jamesyisa@gmail.com | James123@ | James123@       |