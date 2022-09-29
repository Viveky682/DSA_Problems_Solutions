Kth Largest Element in an Array using Quick Select Algorithm

class Solution {
    public int findKthLargest(int[] nums, int k) {

        return quickselect(nums, 0, nums.length-1,k);
    }
    public int quickselect(int[] nums, int left, int right, int k ){
        int pivot= left;
         for(int i=left;i<=right;i++){
             if(nums[i]<nums[right]){
                 swap(nums,pivot++,i);
             }
         }
        swap(nums,pivot,right);
        int c= right-pivot+1;
        
        if(c==k) return nums[pivot];
        else if(c>k){
            return quickselect(nums, pivot+1, right, k);
        }
        return quickselect (nums, left, pivot-1, k-c);
    }
    void swap(int[] nums, int l, int r){
        int temp= nums[l];
        nums[l]= nums[r];
        nums[r]= temp;
    }
}