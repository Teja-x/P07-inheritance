package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA0001", 55000.00,8.5);
        CurrentAccount currentAccount = new CurrentAccount("CA0001",80000.00, 25000);

        savingsAccount.showBalance();
        savingsAccount.applyInterest();
        savingsAccount.showBalance();

        System.out.println("OverDraft limit is " + currentAccount.getOverDraftLimit());
        currentAccount.showBalance();
        currentAccount.withdraw(90000);
        currentAccount.showBalance();
    }
}