//961. N-Repeated Element in Size 2N Array
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> m= new HashMap<>();
        int n=nums.length;
        int count=0;
        for(int x: nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        for(int x: nums){
            if(m.containsKey(x)){
                count=m.get(x);
            }
            if(count==n/2)
                return x;
        }
        // System.out.println(m);
        return 0;
    }
}