package Java;
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("sum is: "+sum);
        sc.close();
    }
}
