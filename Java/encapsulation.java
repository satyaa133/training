package Java;
import java.util.*;

class Bank {
    private String name;
    private int accNum;
    private int balance;
    private int reserve;

    void setCustomer(String n, int a, int b) { name = n; accNum = a; balance = b; }
    void setReserve(int r) { reserve = r; }
    int getReserve() { return reserve; }

    void deposit(int amt) { balance += amt; reserve += amt; }
    void withdraw(int amt) { balance -= amt; reserve -= amt; }

    void showCustomer() {
        System.out.println("Customer Details\nName: " + name + "\nAccount Number: " + accNum + "\nCustomer Balance: " + balance);
    }
    void showBank() {
        System.out.println("\nBank Details\nBank Reserve Balance: " + reserve);
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Bank customer = new Bank();
        customer.setCustomer("Shivam", 101, 5000);

        Bank bank = new Bank();
        bank.setReserve(100000);

        customer.deposit(2000);
        bank.setReserve(bank.getReserve() + 2000);

        customer.withdraw(1000);
        bank.setReserve(bank.getReserve() - 1000);

        customer.showCustomer();
        bank.showBank();
    }
}
