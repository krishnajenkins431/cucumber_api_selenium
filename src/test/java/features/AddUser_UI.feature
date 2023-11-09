@Regression
Feature: Validating Add User page fields for way2automation application

  @AddUser_Feature_Admin
  Scenario Outline:  Validating Add User page fields with role as Admin for way2automation application
    Given User should be navigated to Add User Page
    When User should be click on Add user
    And User can be able to Add users with the given details as FirstName<FirstName>, LastName<LastName>, UserName<UserName>, Password<Password>, Role<Role>, Email<Email>, Cell<Cell>
    Then User should be close the browser

    Examples:
      | FirstName | LastName | UserName | Password | Role  | Email          | Cell   |
      | FName1    | LName1   | User1    | Pass1    | Admin | admin@mail.com | 082555 |

  @AddUser_Feature_Customer
  Scenario Outline:  Validating Add User page fields with role as Customer for way2automation application
    Given User should be navigated to Add User Page
    When User should be click on Add user
    And User can be able to Add users with the given details as FirstName<FirstName>, LastName<LastName>, UserName<UserName>, Password<Password>, Role<Role>, Email<Email>, Cell<Cell>
    Then User should be close the browser
    Examples:
      | FirstName | LastName | UserName | Password | Role     | Email             | Cell   |
      | FName2    | LName2   | User2    | Pass2    | Customer | customer@mail.com | 083444 |