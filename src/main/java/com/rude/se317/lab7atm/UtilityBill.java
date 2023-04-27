package com.rude.se317.lab7atm;

import java.time.LocalDate;

public class UtilityBill {
    // VARIABLES
    private int billID;
    private int total;
    private boolean paid;
    private LocalDate dueDate;

    // CONSTRUCTOR
    public UtilityBill(int ID, int amount, LocalDate dateDue) {
        if (amount < 0) { /* THROW INVALID AMOUNT EXCEPTION */ }

        this.billID = ID;
        this.total = amount;
        this.paid = false;
        this.dueDate = dateDue;
    }

    // GETTERS & SETTERS
    public int getTotal() {
        return total;
    }

    public void setTotal(int amount) {
        if (amount < 0) { /* THROW INVALID AMOUNT EXCEPTION */ }
        this.total = amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String toString() {
        return "Bill " + billID + "\n" + " - Amount Due: $" + total + "\n - Due Date: " + dueDate + "\n";
    }
}
