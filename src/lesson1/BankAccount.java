// Did the actual logic stuff myself but messed around with genval some more 

package lesson1;

import java.util.Random;

/**
 * Operations: deposit money, withdraw money, get current balance
 * Instance variables (what makes a bank account, it's properties):
 * account number, balance, interest rate, bank, owner
 */

public class BankAccount {

    private String accountNumber;
    private double balance;
    private double interestRate;
    private String bank;
    private String owner;

    // constructors must have same name as class
    public BankAccount() {
        this(0, "");
    }

    // overloaded constructor
    public BankAccount(double initialBalance) {
        this(initialBalance, "");
    }

    // new constructor with name and initial balance
    public BankAccount(double initialBalance, String name) {
        this.balance = initialBalance;
        this.owner = name;
        this.accountNumber = generateAccountNumber();
    }

    // generate random 8 digit account number
    private String generateAccountNumber() {
        Random rand = new Random();
        return String.format("%08d", rand.nextInt(100000000));
    }

    // setters (mutators)

    /**
     * Deposits a specified amount of money into the
     * account
     * @param amount amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    // method to change account owner
    public void changeOwner(String newOwner) {
        this.owner = newOwner;
    }

    // method to change/set interest rate
    public void setInterestRate(double newRate) {
        this.interestRate = newRate;
    }

    // method to add interest to the balance
    public void addInterest() {
        balance += balance * (interestRate / 100);
    }

    // getter (accessor)
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Account Number: %s, Owner: %s, Balance: $%.2f, Interest Rate: %.2f%%",
                accountNumber, owner, balance, interestRate);
    }
}
