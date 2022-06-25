class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        int swap1 = 0;
        int count1 = 1;
        ListNode temp1 = head;
        while(temp1 != null)
        {
            if(count1 == k)
            {
                swap1 = temp1.val;
            }
            count1++;
            temp1 = temp1.next;
        }
        int swap2 = 0;
        int count2 = 1;
        ListNode temp2 = head;
        while(temp2 != null)
        {
            if(count2 == count-k+1)
            {
                swap2 = temp2.val;
            }
            count2++;
            temp2 = temp2.next;
        }
        ListNode temp3 = head;
        int count3 = 1;
        while(temp3 != null)
        {
            if(count3 == k)
            {
                temp3.val = swap2;
            }
            if(count3 == count-k+1)
            {
                temp3.val = swap1;
            }
            count3++;
            temp3 = temp3.next;
        }
        return head;
    }
}