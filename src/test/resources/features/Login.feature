@login
  Feature: OrangeHRM login

    Scenario: Valid Login
      Given I am on the login page
      When I enter correct username in the username field
      And I enter correct password in the password field
      And I click on login button
      Then I see the home page

    Scenario: InValid Login
      Given I am on the login page
      When I enter incorrect username in the username field
      And I enter incorrect password in the password field
      And I click on login button
      Then I see the error message on the login page