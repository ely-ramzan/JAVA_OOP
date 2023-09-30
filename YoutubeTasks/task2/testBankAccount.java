package task2;

import task2.bankAccount;
import java.util.Scanner;

public class testBankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bankAccount user1 = new bankAccount();
        System.out.println("Enter your name:");
        user1.name = input.nextLine();
        System.out.println("Enter your balance:");
        user1.balance = input.nextDouble();
        while (true) {
            System.out.println(
                    "Press 1: To Deposit an amount\nPress 2: To Withdraw an amount\nPress 3: To View the current balance\nPress 4: To Close this program");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter the amount you want to desposit in your account >");
                Double amount = input.nextDouble();
                user1.deposit(amount);
            } else if (choice == 2) {
                System.out.println("Enter the amount you want to withdraw from your account >");
                Double amount = input.nextDouble();
                user1.deposit(amount);
            } else if (choice == 3) {
                user1.printBalance();
            } else if (choice == 4) {
                endPrintDetails();
                break;
            } else {
                System.out.println("Choose a valid option");
            }
            input.close();
        }
    }
}

