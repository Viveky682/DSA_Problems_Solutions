21. Merge Two Sorted Lists
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        
        if(list2==null)
            return list1;
        
        if(list1.val>list2.val){
            ListNode temp= list1;
            list1=list2;
            list2=temp;
            
        }
        ListNode res=list1;
        while(list1!=null && list2!=null){
            ListNode tmp=null;
        while(list1!=null && list1.val <=list2.val){
            tmp=list1;
            list1=list1.next;
        }
            tmp.next=list2;
            
             ListNode temp= list2;
            list2=list1;
            list1=temp;
        }
        return res;
    }
}