package com.rude.se317.lab7atm;

public class SavingsAccount {
    // CONSTANTS
    private final int DAILY_TRANSFER_LIMIT = 100;

    // VARIABLES
    private int todaysTransferAmount;

    // CONSTRUCTOR
    public SavingsAccount() {
        super();
        todaysTransferAmount = 0;
    }

    // FUNCTIONS
    @Override
    public void transfer(int amount, BankAccount transToAcc) {
        if (amount < 1) {
            // THROW INVALID AMOUNT EXECEPTION
        }
        if ((this.getBalance() - amount) < 0) {
            // THROW INSUFFICIENT EXECEPTION
        }
        if ((todaysTransferAmount + amount) > DAILY_TRANSFER_LIMIT) {
            // THROW EXCEEDS DAILY LIMIT EXCEPTION
        }

        // log the transfer
        todaysTransferAmount+=amount;
        // remove money from current account
        this.setBalance(this.getBalance() - amount);
        // put money in desired account
        transToAcc.setBalance(transToAcc.getBalance() + amount);
    }

    @Override
    public void resetDay() {
        todaysTransferAmount = 0;
        this.setTodaysDepositAmount(0);
    }
}
