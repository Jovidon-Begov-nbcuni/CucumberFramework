@smoketest
Feature: As admin I want to login

  @login
  Scenario: Admin logins
    When admin signs in
    Then admin verifies that page subtitle is displayed



