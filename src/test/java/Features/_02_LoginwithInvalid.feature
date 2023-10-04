Feature: Register Function
  I want to access my account
  by logging into the Para Bank website and
  perform my bank transactions.

Background:
  Given I navigate to bank application


  Scenario: Login with Invalid username and password



    And Enter Invalid first Username
    And Enter Invalid first Password
    And Click on Login Button
    Then First Unsuccessful Input Should Be Displayed

    And Enter Invalid  Username
    And Enter Invalid first Password
    And Click on Login Button
    Then First Unsuccessful Input Should Be Displayed


    And Enter Invalid first Username
    And Enter Invalid  Password
    And Click on Login Button
    Then First Unsuccessful Input Should Be Displayed

    And Enter Invalid  Username
    And Enter Invalid  Password
    And Click on Login Button
    Then  Unsuccessful Input Should Be Displayed





