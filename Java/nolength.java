package Java;
import java.util.*;
public class nolength {
    public static void main(String[] args) {
        int num=1234;
        int length =0;
        while(num !=0){
            num=num/10;
            length++;
        }
        System.out.println(length);
    }
    
}
