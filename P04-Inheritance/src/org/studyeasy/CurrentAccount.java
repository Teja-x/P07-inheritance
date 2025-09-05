package org.studyeasy;

public class CurrentAccount extends BankAccount{
    double overDraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(String accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit(){
        return overDraftLimit;
    }

    public void withdraw(double amount){
        if(balance + overDraftLimit >= amount){
            balance -= amount;
            System.out.println("Amount of Rs:" + amount + " has been successfully withdrawn from Current Account.");
        }else{
            System.out.println("Amount exceeds Overdraft limit!");
        }
    }

    public void showBalance(){
        System.out.println("The current balance in your Current Account is " + balance);
    }
}
