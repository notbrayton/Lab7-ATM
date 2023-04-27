package com.rude.se317.lab7atm;

public class User {

    // VARIABLES
    private int ID;
    private CheckingAccount checking;
    private SavingsAccount savings;
    private UtilityAccount utilities;

    // CONSTRUCTORS
    public User() {
        checking = new CheckingAccount();
        savings = new SavingsAccount();
        utilities = new UtilityAccount();
    }

    // GETTERS & SETTERS
    public CheckingAccount getCheckingAccount() {
        return checking;
    }

    public void setCheckingAccount(CheckingAccount c) {
        checking = c;
    }

    public SavingsAccount getSavingsAccount() {
        return savings;
    }

    public void setSavingsAccount(SavingsAccount s) {
        savings = s;
    }

    public UtilityAccount getUtilityAccount() {
        return utilities;
    }

    public void setUtilityAccount(UtilityAccount u) {
        utilities = u;
    }

    // FUNCTIONS

}
