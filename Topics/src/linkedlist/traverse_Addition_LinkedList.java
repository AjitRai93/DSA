package linkedlist;

public class traverse_Addition_LinkedList {

    private static void traverseList(Node head) {
        Node current = head;
        while (current !=null){
            System.out.println("Data in LinkedList: " +current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        //Traversing LinkedList using Iterative Method
        traverseList(head);
    }
}
