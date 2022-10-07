1512. Number of Good Pairs

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pair=0;
    HashMap<Integer, Integer>m = new HashMap<>();
        for(int i: nums){
        m.put(i, m.getOrDefault(i,0)+1);
            pair+=m.get(i)-1;
        }
        return pair;
   
    }
}