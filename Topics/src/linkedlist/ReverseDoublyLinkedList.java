package linkedlist;

import java.util.Stack;

public class ReverseDoublyLinkedList {
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

    private static NewNode reverseDllUsingStack(NewNode head) {
        NewNode temp = head;
        Stack<Integer> integerStack = new Stack<>();
        while (temp!= null){
            integerStack.push(temp.data);
            temp = temp.next;
        }
        //Reinitialising temp to starting point head
        temp = head;
        while (temp!=null){
            temp.data = integerStack.pop();
            temp = temp.next;
        }
        return head;
    }

    private static NewNode reverseDLLOptimised(NewNode head) {
        if(head == null || head.next == null){
            return  head;
        }
        NewNode prev = null;
        NewNode current = head;
        while (current !=null){
            prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            current = current.prev;
        }
            return prev.prev;
    }

    public static void main(String[] args) {
        int arr[]={20,50,30,35};
        //Insert value in DoublyLinkedList
        NewNode head = insertDoubleLinkedList(arr);
        traverseDoublyList(head);

        //Reverse DoublyLinkedList using Stack but time complexity is O(2n) and space complexity increased O(n) as using stack
        head = reverseDllUsingStack(head);
        System.out.println("After reversing Data using stack is: ");
        traverseDoublyList(head);

        head = reverseDLLOptimised(head);
        System.out.println("After reversing Data is: ");
        traverseDoublyList(head);
    }
}
