Feature: Transfer Account
  Background: User successfully login using valid userID and password
    Given User already in login page
    And User input userID with "user001"
    And User input password with "Password_0"
    When User click login button
    Then User click "Transfer" page
    And User already in Transfer page

  @TC-TFA-001
  Scenario: Transfer to another account with valid credentials
    Given User choose user from "Daftar Transfer" (abilsabili)
    And User fill "15000" as mata uang and nominal transfer tujuan
    And User fill "test transfer 21 agustus" as berita acara
    Then User click "Lanjut" button
    And click "Lanjut" button
    And User fill "123456" as a pin
    And click "Unduh PDF" Button
    And click "Selesai" Button

  @TC-TFA-002
  Scenario: Transfer to another account with incorrect pin
    Given User choose user from "Daftar Transfer" (abilsabili)
    And User fill "15000" as mata uang and nominal transfer tujuan
    And User fill "test transfer 21 agustus" as berita acara
    Then User click "Lanjut" button
    And click "Lanjut" button
    And User fill "000000" as a PIN
    And User see or heard error PIN Message

  @TC-TFA-003
  Scenario: Transfer with an insufficient balance
    Given User choose user from "Daftar Transfer" (abilsabili)
    Then User fill "15000000" as mata uang and nominal transfer tujuan
    And User see or heard insufficient balance error Message

  @TC-TFA-004
  Scenario: Transfer to unregistered account
    Given User click "transfer tujuan baru" button
    And User Input "232333233"
    Then User click "Lanjut" button
    And User see or heard unregitered account error Message

  @TC-TFA-005
  Scenario: Transfer to registered account
    Given User click "transfer tujuan baru" button
    And User Input "5647282937"
    And User click "Lanjut" button
    And User fill "15000" as mata uang and nominal transfer tujuan
    And User fill "transfer" on berita form
    Then User click "Lanjut" button
    And User fill "123456" as a PIN
    And User receive proof of transfer

  @TC-TFA-007
  Scenario: Transfer cancel before it processed
    Given User click "transfer tujuan baru" button
    And User Input "5647282937"
    And User click "Lanjut" button
    And User fill "15000" as mata uang and nominal transfer tujuan
    And User fill "transfer" on berita form
    Then User click "Lanjut" button
    And User click cancel button
    And User is on confirmation page

  @TC-TFA-008
  Scenario: Transfer to user account
    Given User click "transfer tujuan baru" button
    And User Input "5647282937"
    And User click "Lanjut" button
    And User fill "15000" as mata uang and nominal transfer tujuan
    Then User click "Lanjut" button
    And User fill "123456" as a PIN
    And User receive proof of transfer

  @TC-TFA-010
  Scenario: Transactions below the specified amount
    Given User click "transfer tujuan baru" button
    And User Input "5647282937"
    And User click "Lanjut" button
    And User fill "90" as mata uang and nominal transfer tujuan
    Then User click "Lanjut" button
    And User receive minimum transfer error message











