K Largest Elements InterviewBit
public class Solution {
    public int[] solve(int[] A, int B) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(B+1);
        for(int j:A){
            pq.add(j);
             if(pq.size()>B)
                pq.poll();
            
        }
        int[] ans= new int[B];
        for(int i=0;i<B;i++){
            ans[i]=pq.poll();
        }
        
        return ans;
    }
}
