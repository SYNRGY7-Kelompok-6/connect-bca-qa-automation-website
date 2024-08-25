Feature: View Wallet
  Background: User successfully login using valid userID and password
    Given User already in login page
    And User input userID with "user001"
    And User input password with "Password_0"
    When User click login button
    Then User is on Home Page

  @TC-VWA-001
  Scenario: Displays balance information
    Given User click eye button beside total balance
    Then User see or hear Total balance user that displayed

  @TC-VWA-002
    Scenario: Hide balance information
      Given User click eye button beside total balance
      Then User do not see or hear Total balance user that displayed

  @TC-VWA-003
    Scenario: Copy the account number
      Given User click the copy button beside account number
      Then user see or hear copyed message
