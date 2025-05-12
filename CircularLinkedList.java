public class CircularLinkedList {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }
    
    public void printEvenSum() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        int sum = 0;
        Node temp = head;

        do {
            if (temp.data % 2 == 0) {
                sum += temp.data;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Sum of all even numbers: " + sum);
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(15);
        list.insert(8);
        list.insert(7);
        list.insert(12);

        list.printEvenSum();
    }
}
