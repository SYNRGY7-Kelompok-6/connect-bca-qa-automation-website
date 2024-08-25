Feature: Account Information
  Background: User successfully login using valid userID and password
    Given User already in login page
    And User input userID with "user001"
    And User input password with "Password_0"
    When User click login button
    Then User click "info saldo" page
    And User already in info saldo page

  @TC-AMO-001
  Scenario: Account information balance
    Given User click eye button beside total balance on info saldo page
    Then User see or hear Total balance user that displayed on info saldo page

  @TC-AMO-003
  Scenario: Account information about balance information
    Given User click eye button beside total balance on info saldo page
    Then User do not see or hear Total balance user that displayed on info saldo page
