// Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer= new int[2];
        HashMap<Integer, Integer> m= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int search= target-nums[i];
            if(m.containsKey(search)){
                answer[0]=i;
                answer[1]=m.get(search);
                return answer;
            }
            m.put(nums[i], i);
        }
        return answer;
    }
}