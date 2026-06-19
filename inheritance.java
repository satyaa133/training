// class Student {
//     String name;
//     int age;
//     int rollNo;

//     void setStudentDetails(String name, int age, int rollNo) {
//         this.name = name;
//         this.age = age;
//         this.rollNo = rollNo;
//     }

//     void displayStudentDetails() {
//         System.out.println("Student Details:");
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Roll No.: " + rollNo);
//     }
// }

// class Bank extends Student {
//     long accountNumber;
//     String bankName;
//     float balance;

//     void setBankDetails(long accountNumber, String bankName, float balance) {
//         this.accountNumber = accountNumber;
//         this.bankName = bankName;
//         this.balance = balance;
//     }

//     void displayBankDetails() {
//         System.out.println("Bank Details:");
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Bank Name: " + bankName);
//         System.out.println("Balance: " + balance);
//     }

//     void deposit(float amount) {
//         balance += amount;
//         System.out.println(amount + " deposited successfully.");
//     }

//     void withdraw(float amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println(amount + " withdrawn successfully.");
//         } else {
//             System.out.println("Insufficient balance to withdraw " + amount);
//         }
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {
//         Bank bankStudent = new Bank();
//         bankStudent.setStudentDetails("Rohit", 20, 15);
//         bankStudent.setBankDetails(9876543210L, "City Bank", 2500);

//         bankStudent.displayStudentDetails();
//         bankStudent.displayBankDetails();

//         bankStudent.deposit(1500);
//         bankStudent.withdraw(1000);
//         bankStudent.displayBankDetails();
//     }
// }

class Animals {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animals {
    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Dog {
    void play() {
        System.out.println("Playing");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Animals a1 = new Animals();
        a1.eat();

        Dog d1 = new Dog();
        d1.eat();
        d1.bark();

        Cat c1 = new Cat();
        c1.eat();
        c1.bark();
        c1.play();
    }
}