package Java;
import java.util.*;
public class agecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age<13){
            System.out.println("child");
        }
        else if (age>=13 && age<=19){
            System.out.println("Teenager");
        }
        else if (age>=20 && age <=59){
            System.out.println("Adult");
        }
        else if(age>=60){
            System.out.println("Senior Citizen");
        }
        else{
            System.out.print("Not Specified");
        }
        sc.close();
    }
    
}
