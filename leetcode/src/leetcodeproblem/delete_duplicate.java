package Array;

public class delete_duplicate {
	
	public ListNode deleteDuplicates(ListNode head)
    {
    if(head == null || head.next == null) return head;

      ListNode temp = head;
      while(temp != null && temp.next != null)
      {
        if(temp.val == temp.next.val)
        {
          temp.next = temp.next.next;
        }else
        {
          temp = temp.next;
        }
      }
        return head;
    }


}
