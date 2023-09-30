package task2;

public class bankAccount {
    String name;
    Double balance;
    int count_deposits = 0;
    int count_withdraws = 0;

    void deposit(Double amount) {
        balance += amount;
        count_deposits++;
    }

    void withdraw(Double amount) {
        balance -= amount;
        count_withdraws++;
    }

    void printBalance() {
        System.out.println("Your current balance is:" + balance);
    }

    void endPrintDetails() {
        System.out.println("Account title = " + name);
        System.out.println("Total number of transactions = " + (count_withdraws + count_deposits));
        System.out.println("Total deposits = " + count_deposits);
        System.out.println("Total withdrawl = " + count_withdraws);
        System.out.println("Your balance = " + balance);
    }

}