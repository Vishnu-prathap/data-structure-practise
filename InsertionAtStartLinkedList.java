
class Node {

    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class InsertionAtStartLinkedList {

    public static Node insertAtFront(Node head, int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        return new_node;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        int data = 1;
        head = insertAtFront(head, data);
        printList(head);
    }
}
