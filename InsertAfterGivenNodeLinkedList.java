
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAfterGivenNodeLinkedList {

    static Node insertAfter(Node head, int key, int newData) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                break;
            }
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        Node newNode = new Node(newData);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int key = 3, newData = 6;
        head = insertAfter(head, key, newData);
        printList(head);
    }
}
