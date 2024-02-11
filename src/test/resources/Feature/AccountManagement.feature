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


  @AccountLogin
  Scenario Outline: Registered Customer to login with with user name and password
    Given I am on customer login page
    When I enter "<Username>" "<Password>"
    And I click on sign in button
    Then I should be successfully login

    Examples:
      | Username            | Password  |
      | Jamesyisa@gmail.com | James123@ |

  @DuplicateCustomerCreation
  Scenario Outline: Duplicate customer not allowed to login
    Given I open the create an account page
    When I put "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And The create an account button is click on
    Then Error message customer account already exist should be displayed

    Examples:
      | Firstname | Lastname | Email               | Password  | ConfirmPassword |
      | Peter     | Obi      | Jamesyisa@gmail.com | James123@ | James123@       |

  @UnregisteredCustomer
  Scenario Outline: Unregistered customer not allowed to login
    Given I opened the customer login page
    When I put "<Username>" "<Password>"
    And The sign in button is click on
    Then Error message customer not registered to login should be displayed

    Examples:
      | Username            | Password  |
      | Jamesyisa@gmail.com | James123@ |



