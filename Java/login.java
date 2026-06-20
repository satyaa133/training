package Java;
import java.util.*;
public class login {
    public static void main(String[] args) {
        // String user="admin";
        // String pass="pass";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user1 = sc.next();
        System.out.print("Enter password: ");
        String pass1 = sc.next();
        if(user1=="admin" && pass1=="pass"){
            System.out.println("login Successfull");
        }
        else{
            System.out.println("Not Allowed");
        }
    }
}
