Feature: Account Management

  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then my account page is displayed

    Examples:
      | Firstname | Lastname | Email               | Password | ConfirmPassword |
      | Ada       | Yisa     | Jamesyisa@gmail.com | Demo123@ | Demo123@        |