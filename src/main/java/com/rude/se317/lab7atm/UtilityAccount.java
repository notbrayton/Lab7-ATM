package com.rude.se317.lab7atm;

public class UtilityAccount {
    // CONSTANTS
    private final int PAYMENT_HISTORY_SIZE = 3;

    // VARIABLES
    private UtilityBill currentBill;
    private Queue<UtilityBill> paymentHistory;

    // CONSTRUCTOR
    public UtilityAccount() {
        currentBill = generateNextBill();
        paymentHistory = new LinkedList<>();
    }

    // GETTERS & SETTERS
    public UtilityBill getCurrentBill() {
        return currentBill;
    }

    public void setCurrentBill(UtilityBill currentBill) {
        this.currentBill = currentBill;
    }

    // FUNCTIONS
    public void payBill(CheckingAccount acc) {
        // Withdraw funds from account
        acc.withdraw(currentBill.getTotal());
        // set current bill to paid
        currentBill.setPaid(true);
        // If paymentHistory queue is full remove oldest payment
        if (paymentHistory.size() >= PAYMENT_HISTORY_SIZE) {
            // Removes oldest payment
            paymentHistory.remove();
        }
        // add current bill to payment history
        paymentHistory.add(currentBill);
        // Generate the Next Bill
        currentBill = generateNextBill();
    }

    public void printHistory() {
        System.out.println(paymentHistory);
    }

    private UtilityBill generateNextBill() {
        // Generate bill id
        int id = 1;
        // Generate random value between 50 and 150
        int total = 50;
        // Generate a random date
        LocalDate dueDate = LocalDate.of(2023, 1, 31);

        return new UtilityBill(id, total, dueDate);
    }

}
