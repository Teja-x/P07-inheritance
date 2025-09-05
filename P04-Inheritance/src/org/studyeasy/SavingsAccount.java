package org.studyeasy;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount (){

    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, double balance ,double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void applyInterest(){
        balance = balance + (balance * (interestRate/100));
        System.out.println("Interest has been successfully applied to the balance amount.");
    }

    public void showBalance(){
        System.out.println("The current balance in your Savings Account is " + balance);
    }
}
