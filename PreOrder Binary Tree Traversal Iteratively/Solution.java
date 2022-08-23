//Approach 1

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
		 Stack<TreeNode> stack = new Stack();
		 while(!stack.isEmpty() || root!=null){
             while(root!=null){
                 result.add(root.val);
                 stack.push(root);
                 root=root.left;
             }
             root=stack.pop();
             root=root.right;
         }
        return result;
    }
}
// Approach 2
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack= new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode current= stack.pop();
            if(current!=null){
                list.add(current.val);
                stack.push(current.right);
                stack.push(current.left);
            }
            
        }
        return list;
    }
}
        
    
