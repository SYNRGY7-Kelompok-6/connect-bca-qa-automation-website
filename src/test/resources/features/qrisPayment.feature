Feature: QRIS Payment
  Background: User successfully login using valid userID and password
    Given User already in login page
    And User input userID with "user001"
    And User input password with "Password_0"
    When User click login button
    Then User click Qris page
    And User already in Qris page


  @TC-QRP-001
  Scenario: QRIS transfer
    Given User already in Qris page
    Then User see or hear the QR code

  @TC-QRP-007
  Scenario: QRIS payment
    Given User click Qris Bayar Button
    And User Click lanjutkan Button
    And User fill "15000" as mata uang and nominal transfer tujuan
    And User Click Simpan Button
    And User fill 123456 as a pin
    And user click konfirmasi button
    And User see or hear the QR code payment

  @TC-QRP-009
  Scenario: QRIS payment
    Given User click Qris Bayar Button
    And User Click lanjutkan Button
    Then User fill "0" as mata uang and nominal transfer tujuan
    And User Click Simpan Button
    And User receive nominal transaction error message



