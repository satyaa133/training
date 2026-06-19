import java.util.Scanner;

class CircularQ {
    int front;
    int rear;
    int size;
    int count;
    int[] queue;

    CircularQ(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        this.count = 0;
    }

    void enqueue(int value) {
        if (count == size) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            queue[rear] = value;
            count++;
        }
    }

    void dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " Removed from queue");
            if (count == 1) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            count--;
        }
    }

    void peek() {
        if (count == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " peeked from queue");
        }
    }

    void display() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements:");

        int i = front;
        for (int j = 0; j < count; j++) {
            System.out.println(queue[i]);
            i = (i + 1) % size;
        }
    }
}

public class circularqueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Enter the size of the queue");
        int size = sc.nextInt();

        CircularQ q = new CircularQ(size);

        System.out.println("Please enter a element");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            q.enqueue(value);
        }

        System.out.println("All values are added");

        while (isRunning) {

            System.out.println("\n--- Circular Queue Operations ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.println("Choose what to perform");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter element to insert");
                    int element = sc.nextInt();
                    q.enqueue(element);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        }

        sc.close();
    }
}