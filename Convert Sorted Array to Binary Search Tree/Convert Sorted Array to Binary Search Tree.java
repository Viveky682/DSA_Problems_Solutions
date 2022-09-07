class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l= nums.length;
        if(l==0) return null;
        return convert(nums,0,l-1);
        
        
        
    }
    public TreeNode convert(int[] nums, int front, int back){
        if(front>back) return null;
        
        int mid= front+(back-front)/2;
        TreeNode node= new TreeNode(nums[mid]);
        node.left= convert(nums, front, mid-1);
        node.right= convert(nums,mid+1, back);
        
        return node;
    }
}