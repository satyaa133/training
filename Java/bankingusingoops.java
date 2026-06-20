package Java;
import java.util.*;

abstract class Account {
    private long accountNumber;
    private String customerName;
    protected double balance;

    public Account(long accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public abstract void withdraw(double amount);

    public void displayDetails() {
        System.out.println("------------------------------------");
        System.out.println("Acc No: " + accountNumber + " | Name: " + customerName);
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
        System.out.println("------------------------------------");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(long accNum, String name, double bal) {
        super(accNum, name, bal);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Denied: Insufficient funds.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(long accNum, String name, double bal, double limit) {
        super(accNum, name, bal);
        this.overdraftLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Denied: Overdraft limit exceeded.");
        }
    }

    public void applyForLoan(double principal, double annualRate, int years) {
        double r = (annualRate / 12) / 100;
        int n = years * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Loan approved! Monthly EMI for $" + principal + ": $" + String.format("%.2f", emi));
    }
}

public class bankingusingoops {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(101, "Alice", 5000));
        accounts.add(new CurrentAccount(201, "Bob Corp", 2000, 5000));

        for (Account acc : accounts) {
            acc.deposit(1000);
            acc.withdraw(1500);
            
            if (acc instanceof CurrentAccount) {
                ((CurrentAccount) acc).applyForLoan(10000, 8.5, 2);
            }
            
            acc.displayDetails();
        }
    }
} 








