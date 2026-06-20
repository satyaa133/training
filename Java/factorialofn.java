package Java;
import java.util.*;
public class factorialofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int fact=5;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);
    }
    
}
