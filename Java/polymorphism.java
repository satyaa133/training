package Java;
class Calculator{
    int sample(int a, int b){
        return a+b;
    }

    int sample(int a, int b, int c){
        return a+b+c;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int r1 = c.sample(1, 2);
        System.out.println("Result of sample(1,2): " + r1);

        int r2 = c.sample(4, 5, 5);
        System.out.println("Result of sample(4,5,5): " + r2);
    }
}

