package org.studyeasy;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(){
    }

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount successfully deposited in Bank Account.");
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Amount of Rs:" + amount + " has been successfully withdrawn from Bank Account.");
    }
}
