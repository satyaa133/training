package Java;
class student {
    String name;
    int age;
    float marks;
    int roll;

    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No.: "+roll);
        System.out.println("Marks: "+marks);
    }

    void Gradecalculate(){
        if(marks>=90){
            System.out.println("Your Grade is A");
        }
        else if(marks>=75 && marks<90){
            System.out.println("Your Grade is B");
        }
        else if(marks<75 && marks>=60){
            System.out.println("Your Grade is C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
public class Main{
    public static void main(String[] args) {
        student s1=new student();
        s1.name="John";
        s1.age=20;
        s1.marks=60;
        s1.roll=5;
        s1.Display();
        s1.Gradecalculate();
    }
}