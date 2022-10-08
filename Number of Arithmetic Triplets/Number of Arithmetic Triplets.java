//2367. Number of Arithmetic Triplets
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> s= new HashSet<>();
        int result=0;
        for(int n:nums){
            s.add(n);
        }
        for(int n:nums){
            if(s.contains(n-diff) && s.contains(n+diff))
                result++;
        }
        return result;
    }
}