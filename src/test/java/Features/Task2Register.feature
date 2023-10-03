
  Feature: registration step
  Scenario:  Register a new account
  Given I navigate to bank application
  Then I click on register link
  And I fill the form and I click on Register button
     |FirstName|Mark|
     |LastName|Sam|
     |Address|123 adreess ct |
     |City|Norfolk|
     |State|VA|
     |Zip|23267|
     |Phone|8035779304|
     |SSN|253662283|
     |Username |Mark321|
     |Password|Mark123|
  Then the message "Your account was created successfully" was displayed

