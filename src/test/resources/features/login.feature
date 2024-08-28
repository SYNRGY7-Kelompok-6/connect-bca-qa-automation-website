Feature: Login

  @TC-LOG-001
  Scenario: User successfully login using valid userID and password
    Given User already in login page
    And User input userID with "user001"
    And User input password with "Password_0"
    When User click login button
    Then User is on Home Page

  @TC-LOG-002
  Scenario: Login using valid userID and invalid password
    Given User already in login page
    And User input userID with "user001"
    And User input password with "wrong_password"
    When User click login button
    Then User get Error message
    And user click repeat button
    And user click reset button
    And user stay in login page

  @TC-LOG-003
  Scenario: Login using invalid userID and valid password
    Given User already in login page
    And User input userID with "WrongUserID"
    And User input password with "Password_0"
    When User click login button
    Then User get Error message
    And user click repeat button
    And user click reset button
    And user stay in login page

  @TC-LOG-004
  Scenario: Login only using valid password
    Given User already in login page
    And User input password with "Password_0"
    When User click login button
    Then User get Error userID message
    And user click reset button
    And user stay in login page

  @TC-LOG-005
  Scenario: Login only using valid userID
    Given User already in login page
    And User input userID with "user001"
    When User click login button
    Then User get Error Password message
    And user click reset button
    And user stay in login page

  @TC-LOG-006
  Scenario: User successfully login using invalid userID and invalid password
    Given User already in login page
    And User input userID with "WrongUserID"
    And User input password with "wrong_password"
    When User click login button
    Then User is on Home Page
    And user click repeat button
    And user click reset button
    And user stay in login page

  @TC-LOG-006
  Scenario: User login only click login button
    Given User already in login page
    When User click login button
    Then User get Error userID message
    And User get Error Password message
    And user stay in login page
