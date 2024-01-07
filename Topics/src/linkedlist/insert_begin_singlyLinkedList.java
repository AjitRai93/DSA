package linkedlist;

public class insert_begin_singlyLinkedList {

    static Node insertAtFirstOfLinkedList(Node head, int data) {

        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    static Node insertAtLastOfLinkedList(Node head, int data) {

        Node temp = new Node(data);
        if(head == null){
            return temp;
        }
        Node current = head;
        while(current != null){
            current = current.next;
        }
        current = temp;
        return head;
    }

    private static void traverseList(Node head) {
        Node current = head;
        while (current !=null){
            System.out.println("Data in LinkedList: " +current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtFirstOfLinkedList(head,30);
        head = insertAtFirstOfLinkedList(head, 20);
        head = insertAtFirstOfLinkedList(head, 40);


        traverseList(head);
    }
}
