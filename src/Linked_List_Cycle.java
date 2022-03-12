public class Linked_List_Cycle
{
    public static void main(String args[])
    {
        ListNode node1 = new ListNode(3);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(0);
        node1.next.next.next = new ListNode(-4);
        node1.next.next.next.next = node1.next;



        System.out.println(Cycle(node1));

    }
    public static boolean Cycle(ListNode head) //Floyd's cycle detection algorithm
    {
        if (head == null || head.next == null)
        {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
            {
                return true;
            }
        }
        return false;
    }
}

