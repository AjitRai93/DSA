package linkedlist;

class NewNode{
    int data;
    NewNode prev;
    NewNode next;

    public NewNode(int data,NewNode next, NewNode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    public NewNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}
public class DoublyLinkedList {

    private static NewNode insertDoubleLinkedList(int[] arr) {
        NewNode head = new NewNode(arr[0]);
        NewNode tempHead = head;

        for (int i=1;i<arr.length;i++){
            NewNode tempNode = new NewNode(arr[i],null,tempHead);
            tempHead.next = tempNode;
            tempHead = tempNode;
        }
        return head;
    }

    private static void traverseDoublyList(NewNode head) {
        while (head!=null){
            System.out.println("Value in list: "+head.data);
            head = head.next;
        }
    }

    private static NewNode insertBeforeHeadInDLL(NewNode head, int value) {
        NewNode newHead = new NewNode(value,head,null);
        head.prev = newHead;
        return newHead;
    }

    private static NewNode insertBeforeTailInDLL(NewNode head, int value) {
        if(head.next == null){
            return insertBeforeHeadInDLL(head,value);
        }
        NewNode temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        NewNode prev = temp.prev;
        NewNode beforeTailNode = new NewNode(value,temp,prev);
        prev.next = beforeTailNode;
        temp.prev = beforeTailNode;

        return head;
    }

    private static NewNode insertBeforeKthInDLL(NewNode head, int value, int position) {
        if(position == 0){
            return insertBeforeHeadInDLL(head,value);
        }
        NewNode tempHeadNode = head;
        int count = 0;
        while (tempHeadNode.next !=null){
            count++;
            if(count == position){
                break;
            }
            tempHeadNode = tempHeadNode.next;
        }
        NewNode prevNode = tempHeadNode.prev;
        NewNode kthNode = new NewNode(value,tempHeadNode,prevNode);
        prevNode.next = kthNode;
        tempHeadNode.prev = kthNode;

        return head;
    }


    private static NewNode deleteHeadOfDoublyLinkedList(NewNode head) {
        if(head == null || head.next == null){
            return null;
        }
        NewNode tempHead = head;
        head = head.next;
        head.prev = null;
        tempHead.next = null;
        return head;
    }

    private static NewNode deleteTailOfDoublyLinkedList(NewNode head) {
        if(head == null || head.next == null){
            return null;
        }
        NewNode tempHeadNode= head;
        while (tempHeadNode.next!=null){
            tempHeadNode = tempHeadNode.next;
        }
        NewNode prev = tempHeadNode.prev;
        tempHeadNode.prev = null;
        prev.next = null;
        return head;
    }

    private static NewNode deleteKthNodeOfDoublyLinkedList(NewNode head,int position) {

        if(head==null){
            return null;
        }

        NewNode tempHeadNode = head;
        int count = 0;
        while (tempHeadNode.next !=null){
            count++;
            if(count == position){
                break;
            }
            tempHeadNode = tempHeadNode.next;
        }

        //After reaching Kth Node:
        NewNode prevNode = tempHeadNode.prev;
        NewNode nextNode = tempHeadNode.next;

        if(prevNode == null && nextNode == null){
            return null;
        }else if(prevNode == null){
            deleteHeadOfDoublyLinkedList(head);
        }else if(nextNode == null){
            deleteTailOfDoublyLinkedList(head);
        }

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        tempHeadNode.next = null;
        tempHeadNode.prev = null;
        return head;
    }

    private static void deleteAnyNodeFromDoublyLinkedList(NewNode temp) {
        NewNode prevNode = temp.prev;
        NewNode nextNode =  temp.next;

        if(nextNode == null){
            prevNode.next = null;
            temp.next = null;
            temp.prev = null;
            return;
        }
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        temp.next = null;
        temp.prev = null;
    }

    public static void main(String[] args) {
        int arr[]={20,50,30,35};
        //Insert value in DoublyLinkedList
        NewNode head = insertDoubleLinkedList(arr);
        traverseDoublyList(head);

        //Insert Node Before Head of DoublyLinkedList
        NewNode newHeadNode = insertBeforeHeadInDLL(head,99);
        System.out.println("Addition of New Node Before Head is: ");
        traverseDoublyList(newHeadNode);

        //Insert Node Before Tail of DoublyLinkedList
        NewNode newBeforeTailNode = insertBeforeTailInDLL(head,100);
        System.out.println("Addition of New Node Before Tail is: ");
        traverseDoublyList(newBeforeTailNode);

        //Insert Node Before Kth Node of DoublyLinkedList
        NewNode newBeforeKthNode = insertBeforeKthInDLL(head,88,1);
        System.out.println("Addition of New Node Before Kth Position is: ");
        traverseDoublyList(newBeforeKthNode);

        //Delete head of a DoublyLinkedList
        NewNode newHeadNode1 = deleteHeadOfDoublyLinkedList(head);
        System.out.println("After Deletion from head new List:");
        traverseDoublyList(newHeadNode1);

        //Delete Tail of a DoublyLinkedList
        NewNode newHeadNode2 = deleteTailOfDoublyLinkedList(head);
        System.out.println("After Deletion from tail new List:");
        traverseDoublyList(newHeadNode2);

        //Delete from Kth position in DoublyLinkedList
        NewNode newHeadNode3 = deleteKthNodeOfDoublyLinkedList(head,4);
        System.out.println("After Deletion from Kth Node new List:");
        traverseDoublyList(newHeadNode3);

        //Delete any Node from DoublyLinkedList
        deleteAnyNodeFromDoublyLinkedList(head.next.next);
        System.out.println("After Deletion of Any of Choice Node new List:");
        traverseDoublyList(head);

    }
}