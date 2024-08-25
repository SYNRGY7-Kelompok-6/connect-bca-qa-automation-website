Feature: Account Transactions
  Background: User successfully login using valid userID and password
    Given User already in login page
    And User input userID with "user001"
    And User input password with "Password_0"
    When User click login button
    Then User click "Mutasi Rekening" page
    And User already in Mutasi Rekening page

  @TC-ACT-001
  Scenario: Check one month account transaction history
    Given  User choose "1 Bulan yang lalu" as the period
    Then User Click "Cari" button
    And User see or hear the latest month's account transactions


  @TC-ACT-002
  Scenario: Check three weeks account transaction history
    Given  User choose "3 Minggu yang lalu" as the period
    Then User Click "Cari" button
    And User see or hear the latest 3 weeks of account transactions

  @TC-ACT-003
  Scenario: Check two weeks account transaction history
    Given  User choose "2 Minggu yang lalu" as the period
    Then User Click "Cari" button
    And User see or hear the latest 2 weeks of account transactions

  @TC-ACT-004
  Scenario: Check one week account transaction history
    Given  User choose "1 Minggu yang lalu" as the period
    Then User Click "Cari" button
    And User see or hear the latest 1 week of account transactions

  @TC-ACT-005
  Scenario: Check specific period account transaction history
    Given User click radar button "Tanggal Awal (dd/mm/yy)"
    And User select spesific start date "02/08/24"
    And User select spesific end date "23/08/24"
    And User click "Pilih" Button
    Then User Click "Cari" button
    And User see or hear the account transactions based on specific date that selected
