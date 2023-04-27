package com.rude.se317.lab7atm;

public abstract class BankAccount {
    // CONSTANT
    private final int DAILY_DEPOSIT_LIMIT = 5000;

    // VARIABLES
    private int balance;
    private int todaysDepositAmount;

    //CONSTRUCTOR
    public BankAccount() {
        balance = 0;
        todaysDepositAmount = 0;
    }

    // GETTERS
    public int getBalance() {
        return balance;
    }

    public int getTodaysDepositAmount() {
        return todaysDepositAmount;
    }

    // SETTERS
    public void setBalance(int value) {
        if (value < 0) { /* THROW INVALID VALUE EXCEPTION */ }
        balance = value;
    }

    public void setTodaysDepositAmount(int value) {
        if (value < 0) { /* THROW INVALID VALUE EXCEPTION */ }
        todaysDepositAmount = value;
    }

    // FUNCTIONS
    public void deposit(int amount) {
        if (amount < 1) {
            // THROW INVALID AMOUNT EXCEPTION
        }
        if ((todaysDepositAmount + amount) > DAILY_DEPOSIT_LIMIT) {
            // THROW EXCEEDS DAILY LIMIT EXCEPTION
        }

        // log the deposit
        todaysDepositAmount+=amount;
        // Increase balance by desired amount
        balance += amount;
    }

    public abstract void transfer(int amount, BankAccount transToAcc);

    public abstract void resetDay();
}
