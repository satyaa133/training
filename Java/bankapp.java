package Java;
import java.util.*;

class Customer{
    String name;
    int balance=10000;
    int amount;

    void Display(){
    System.out.println("Name: "+name);
    System.out.println("Amount: "+amount);
    System.out.println("Remaining Balance: "+balance);
    }

    void Withdraw(){
        if(amount<=balance){
            System.out.println("Withdrawal Success");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void CheckBalance(){
        System.out.print("Remaining Balance: "+(balance-amount));
    }
}


public class bankapp {
    public static void main(String[] args) {
        Customer c1= new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        c1.name=sc.next();
        System.out.println("\nChoose Operation:\n1.Withdraw\n2.Check Balance");
        int op = sc.nextInt();
        System.out.println("\n-------DETAILS-------\n");
        switch (op) {
            case 1:
                System.out.print("Enter amount to withdraw: ");
                int amount=sc.nextInt();
                c1.amount=amount;
                c1.Withdraw();
            
            case 2:
                c1.CheckBalance();
                break;

            default:
                break;
        }
        sc.close();
        
    }
    
}
