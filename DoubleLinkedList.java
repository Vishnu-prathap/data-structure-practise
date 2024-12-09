
class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLinkedList {

    public static void forwardTraversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void backwardTraversal(Node tail) {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //Linked List 1 <-> 2 <-> 3
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Forward Traversal:");
        forwardTraversal(head);

        System.out.println("Backward Traversal:");
        backwardTraversal(third);
    }
}
