Feature: Creating a new checking account

  Scenario: Create a standard individual checking account
    Given the user logged in as "elonmask@gmail.com" "ElonMask123$$"
    When the user creates a new checking account with the following data
      | checkingAccountType | accountOwnership | accountName               | initialDepositAmount |
      | Standard Checking   | Individual       | Elon Mask Second Checking |100000.0              |
    Then the user should see the green "Successfully created new Standard Checking account named Elon Mask Second Checking" message
    And the user should see newly added account card
      | accountName               | accountType       | ownership  | accountNumber | interestRate | balance   |
      | Elon Mask Second Checking | Standard Checking | Individual | 486132905     | 0.0%         | 100000.00 |
    And the user should see the following transactions
      | date             | category | description               | amount    | balance   |
      | 2023-10-17 00:28 | Income   | 845323920 (DPT) - Deposit | 100000.00 | 100000.00 |
