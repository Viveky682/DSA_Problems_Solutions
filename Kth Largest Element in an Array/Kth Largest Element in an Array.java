215. Kth Largest Element in an Array
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p= new PriorityQueue<>(k+1);
        for(int i: nums){
            p.add(i);
            if(p.size()>k){
                p.poll();
            }
                   
        }
        return p.poll();
    }
}