Feature: Login steps
  Background:
    Given I navigate to bank application
  Scenario: Positive login

    Then  I enter "Mark321"as username and "Mark123"as password and click on login button
    And I should be Logged successfully
  Scenario: Negative login
    Then I enter"SAM123" and"Markqwe1"and click on login button
    And the "An internal error has occurred and has been logged." should display