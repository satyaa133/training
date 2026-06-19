import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        String grade ="0";
        if(marks>=90){
            grade="A";
        }
        else if (marks>=75){
            grade="B";
        }
        else if (marks>=60){
            grade="C";
        }
        else if(marks>=40){
            grade="D";
        }
        else{
            System.out.print("Fail");
        }
        System.out.print("Your mark is: "+grade);
    }
}
