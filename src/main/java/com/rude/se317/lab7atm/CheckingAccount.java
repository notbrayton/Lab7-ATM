package com.rude.se317.lab7atm;

public class CheckingAccount {
    // CONSTANTS
    private final int DAILY_WITHDRAW_LIMIT = 500;

    // VARIABLES
    private int todaysWithdrawAmount;


    // CONSTRUCTOR
    public CheckingAccount() {
        super();
        todaysWithdrawAmount = 0;
    }

    // FUNCTIONS
    public void withdraw(int amount) {
        if (amount < 1) {
            // THROW INVALID AMOUNT EXCEPTION
        }
        if ((this.getBalance() - amount) < 0) {
            // THROW INSUFFICIENT FUNDS EXCEPTION
        }
        if ((todaysWithdrawAmount + amount) > DAILY_WITHDRAW_LIMIT) {
            // THROW EXCEEDS DAILY LIMIT EXCEPTION
        }

        // log withdraw
        todaysWithdrawAmount+=amount;
        // withdraw money
        this.setBalance(this.getBalance() - amount);
    }

    @Override
    public void transfer(int amount, BankAccount transToAcc) {
        if (amount < 1) {
            // THROW INVALID AMOUNT EXCEPTION
        }
        if ((this.getBalance() - amount) < 0) {
            // THROW INSUFFICIENT EXECEPTION
        }

        // remove funds from this account
        this.setBalance(this.getBalance() - amount);
        // send funds to other account
        transToAcc.setBalance(transToAcc.getBalance() + amount);
    }

    @Override
    public void resetDay() {
        todaysWithdrawAmount = 0;
        this.setTodaysDepositAmount(0);
    }
}
