package Java;
import java.util.*;
public class account {
    public static void main(String[] args) {
        int balance =10000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        if(amount<=balance){
            System.out.println("Transaction success");
            System.out.println("Remaining: "+(balance-amount));
        }
        else{
            System.out.println("Insufficient balance");
        }
        sc.close();
    }
}
