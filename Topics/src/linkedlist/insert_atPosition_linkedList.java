package linkedlist;

public class insert_atPosition_linkedList {

    static Node insertAtIndex(int data,int position, Node head){
        if(position < 1){
            System.out.println("Invalid Index");
            return null;
        }
        if(position == 1){
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
        }else{
            Node new_node = new Node(data);
            Node current = head;
            for(int i=0; i<position-2;i++){
                current = current.next;
            }
            new_node.next = current.next;
            current.next = new_node;
        }
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Linked List before Insertion : ");
        traverseList(head);

        //Insertion of Node at given Index
        head = insertAtIndex(25,1,head);
        System.out.println("List after insertion of 10 at 2nd Index : ");
        traverseList(head);
    }
}
