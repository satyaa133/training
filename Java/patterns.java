package Java;
import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        // for (int i=1;i<=num;i++){
        //     for (int j=1;j<=num;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for(int i =1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
