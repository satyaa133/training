class queuee {
    int rear = -1;
    int front = 0;
    int queue[] = new int[5];

    void enqueue(int num) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
        } else {
            rear++;
            queue[rear] = num;
            System.out.println("Inserted Successfully");
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements are: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front of queue is: " + queue[front]);
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue[front] + " is deleted from queue");
            front++;
            if (front > rear) {
                front = 0;
                rear = -1;
            }
        }
    }
}

public class queue {
    public static void main(String[] args) {
        queuee q = new queuee();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.display();
        q.peek();
    }

}
