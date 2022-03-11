import java.util.*;
public class Reverse_Linked_List
{
    public static void main(String args[])
    {
        //The problem passes in the head of the created list
        //Test Case = [1,2,3,4,5]

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        ListNode printNext = listNode1;

        System.out.print("Before Reverse: ");
        PrintList(printNext);

        System.out.print("After Reverse: ");
        PrintList(reverseList(listNode1));





    }

    public static ListNode reverseList(ListNode head)
    {
        //Works as both a base case and an empty-List/single-node check
        if(head == null || head.next == null)
            return head;

        //passes through the linked list until the base case is met,
        //it then saves the new head of the list(*Former last node of the original list) within the "newHead" variable
        //then uses the second to last node to change the last nodes "next" assignment to itself
        //it repeats the above process with the rest of the head nodes throughout the call stack
        //the result is a reversed linked list
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
    public static void PrintList(ListNode PrintNext)
    {
        while(PrintNext != null)
        {
            System.out.print(PrintNext.val + " ");
            PrintNext = PrintNext.next;
        }
        System.out.println();

    }


}
class ListNode
{
    int val;
    ListNode next;

    ListNode(){}

    ListNode(int val)
    {
        this.val = val;
    }

    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}
