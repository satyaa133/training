import java.util.*;

class Guest{
    String name;
    int aadhar;
    int days;

    void Display(){
    System.out.println("Name: "+name);
    System.out.println("Aadhar: "+aadhar);
    System.out.println("Duration(in days): "+days);
    }

    void Amount(){
        System.out.println("Your Bill is: "+(days*1000));
    }
}


public class hotelcheckin {
    public static void main(String[] args) {
        Guest g1= new Guest();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        g1.name=sc.next();
        System.out.print("Aadhar No.: ");
        g1.aadhar=sc.nextInt();
        System.out.print("Enter duration(in days): ");
        g1.days=sc.nextInt();
        System.out.println("\n-------BILL DETAILS-------\n");
        g1.Display();
        g1.Amount();
        
    }
    
}
