package Java;
import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.println("Choose Operation: ");
        System.out.println("1.Adddition\n2.Substraction\n3.Division\n4.Multiplication");
        int op = sc.nextInt();

        switch ((op)) {
            case 1:
                System.out.println("Addition is: "+(a+b));
                break;
            case 2:
                System.out.println("Substraction is: "+(a-b));
                break;
        
            default:
                break;
        }


        
    }
}
