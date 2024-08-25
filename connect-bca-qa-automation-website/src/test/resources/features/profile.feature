Feature: Profile
  Background: User successfully login using valid userID and password
    Given User already in login page
    And User input userID with "user001"
    And User input password with "Password_0"
    When User click login button
    Then User click "Profile" page
    And User already in Profile page

  @TC-PRO-014
    Scenario: Edit profile address
    Given User click "Edit" button
    And User fill address with "Jalan merpati nomor 35"
    Then User click "Simpan" button