package MiniProjects;

import java.util.Scanner;
class BankAccount {
    private double balance;
    private String[] transactionHistory;
    private int transactionCount;

    public BankAccount(double initialBalance) {
        if(initialBalance > 0){
            balance = initialBalance;
        }else {
            balance = 0;
            System.out.println("Initial Balance is set to 0 due to Negative input");
        }
        transactionCount = 0;
        transactionHistory = new String[100];
    }

    private void addTransaction(String transactionDetail){
        if (transactionCount < transactionHistory.length){
            transactionHistory[transactionCount++] = transactionDetail;
        }else{
            System.out.println("Transaction limit Exceeded, tre again After {DateTime.now+24hrs}");
        }
    }

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount ;
            addTransaction("Deposit Amount: " + amount);
            System.out.println("Successfully Deposited :" + amount);
        }else {
            System.out.println("Deposit Amount should be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount<balance){
            balance -= amount;

            addTransaction("Withdraw amount" + amount);
            System.out.println("You have Successfully Withdraw "+amount+"\nCurrent Balance"+balance);
        }else if(amount > balance){
            System.out.println("Insufficient Balance");
        }else{
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void currentBalance(){
        System.out.println("Current Balance:"+balance);
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History\n");
        if(transactionCount == 0){
            System.out.println("No Transaction Found");
        } else{
            for(int i=0; i< transactionCount; i++){
                System.out.println(transactionHistory[i]);
            }
        }
    }
}

public class BankingSystem{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Initial Balance For Account: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");

            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 ->{
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                }
                case 2 -> {
                    System.out.println("Enter amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                }
                case 3 -> account.currentBalance();
                case 4 -> account.printTransactionHistory();
                case 5 -> System.out.println("Thank you for visiting,");
                default -> System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}