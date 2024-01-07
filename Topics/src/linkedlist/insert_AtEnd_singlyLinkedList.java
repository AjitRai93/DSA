package linkedlist;

public class insert_AtEnd_singlyLinkedList {

    static Node insertAtLast(Node head, int data){

        Node temp = new Node(data);
        if(head == null){
            return temp;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = temp;
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
        head = insertAtLast(head,20);
        head = insertAtLast(head,30);
        head = insertAtLast(head,40);

        traverseList(head);



    }
}
