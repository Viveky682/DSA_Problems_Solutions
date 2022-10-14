//1748. Sum of Unique Elements
class Solution {
    public int sumOfUnique(int[] nums) {
      HashMap<Integer,Integer> m= new HashMap<>();
        int sum=0;
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
            
        } 
        for(int n:nums){
           if(m.get(n)==1){
               sum+=n;
           }
            
        }
        // System.out.println(m);
        return sum;
    }
}