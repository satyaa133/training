package Java;

class SumList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public SumList() {
        this.head = null;
    }

    void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    int sum() {
        int total = 0;
        Node curr = head;
        while (curr != null) {
            total += curr.data;
            curr = curr.next;
        }
        return total;
    }

    double average() {
        int count = 0;
        int total = 0;
        Node curr = head;
        while (curr != null) {
            total += curr.data;
            count++;
            curr = curr.next;
        }
        return count == 0 ? 0 : (double) total / count;
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class sumandavgLL {
    public static void main(String[] args) {
        SumList list = new SumList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.print("Linked list: ");
        list.display();

        int total = list.sum();
        double avg = list.average();

        System.out.println("Sum = " + total);
        System.out.println("Average = " + avg);
    }
}
