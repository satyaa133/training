import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of units consumed: ");
        int a = sc.nextInt();
        if(a<=100){
            a=a*5;
        }
        else if(a>100 && a<=200){
            a=100*5+(a-100)*7;
        }
        else if(a>200){
            a=100*5+100*7+(a-200)*10;
        }
        System.out.println("Bill is: "+a);
    }
}
