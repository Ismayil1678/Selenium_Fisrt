@practice
Feature: Practice for parameterization

  @doublequoteparams
  Scenario: string parameter with double quotes
    When I read parameter "value1"
    Then I read parameter "value2"
    And I read parameter "value3"
    But I read parameter "value 4 abc 123"

  @outlineexample
  Scenario Outline: scenario outline example
    When I read parameter "<values>"
    Given I login with "<usernm>" id and "<password>" password
    Given I login with <usernm> id and <password> password
    When I pass integer <numeric>
    Examples:
      | values          | usernm   | password  | numeric |
      | value1          | user1    | password1 | 1       |
      | value2          | user2    | password2 | 2       |
      | value3          | user3    | password3 | 3       |
      | value 4 abc 123 | user4    | password4 | 4       |
      | value1          | user1    | password1 | 5       |
      | asdfasfd        | asdfasdf | afsdasfd  | w1231   |

  @multiparams
  Scenario: multiple string params
    Given I login with "user1" id and "password1" password
    Given I login with "user2" id and "password3" password

  @doublequoteparam1
  Scenario: string parameter with double quotes2
    Given I signup with user name "test user 1" and email "some@1.com"

  @wordparam
  Scenario: string word parameter with continuous words and no spaces and double quotes
    Given I login with user1 id and password1 password
    Given I login with user2 id and password2 password

  @intparam
  Scenario: Int parameter sample
    When I pass integer 5678989

  @doubleparam
  Scenario: double parameter sample
    Then I pass double value 1124.63212

  @limitedparams
  Scenario: limiting parameter values
    Then I select Faster from the speed drop down


    @mapParameters
    Scenario: multi paramts
      #Given I enter first name"some FN" and last name " some last" and address line 1 "abs street building 1"
      Given I fill signup form
        | First Name    | some FirstName1 |
        | Last Name     | some LastName2  |
        | Address Line1 | 200 some street |
        | Address Line2 | Suite A1        |
        | Zip code      | 10001           |
        | City          | Ney York        |
        | State         | NY              |
      Then I fill bankApplication form
        | First Name    | some FirstName2 |
        | Last Name     | some FirstName2 |
        | Address Line1 | 200 some street |
        | Address Line2 | Suite A2        |
        | Zip code      | 10002           |
        | City          | Ney York        |
        | State         | NY              |
      Then I fill registration form
        | First Name    | some FirstName3 |
        | Last Name     | some LastName3  |
        | Address Line1 | 203 some street |
        | Address Line2 | Suite A3        |
        | Zip code      | 10003           |
        | City          | Ney York        |
        | State         | NY              |

    @dateTable1
   Scenario: DateTableExample
      Given I fill all forms
        | first name | last name | address line1   | address line2 | zip code | City       | State | Email          |
        | some fn1   | some ln1  | 200 some street | Apt A         | 10001    | New York   | NY    | some1mail@.com |
        | some fn2   | some ln2  | 201 some street | Apt B         | 00120    | Wilmington | NC    | some2mail@.com |
        | some fn3   | some ln3  | 202 some street | Apt C         | 96251    | Denver     | CO    | some3mail@.com |
        | some fn4   | some ln4  | 203 some street | Apt D         | 52689    | Nashville  | TN    | some4mail@.com |


  @dateTable2
      Scenario Outline: : DateTableExample
        Given  I fill all forms on  <Browser>
          | first name | last name | address line1   | address line2 | zip code | City       | State | Email          |
          | some fn1   | some ln1  | 200 some street | Apt A         | 10001    | New York   | NY    | some1mail@.com |
          | some fn2   | some ln2  | 201 some street | Apt B         | 00120    | Wilmington | NC    | some2mail@.com |
          | some fn3   | some ln3  | 202 some street | Apt C         | 96251    | Denver     | CO    | some3mail@.com |
          | some fn4   | some ln4  | 203 some street | Apt D         | 52689    | Nashville  | TN    | some4mail@.com |
         Examples:
       |Browser|
       |Chrome |
       |FireFox|
       |Edge   |