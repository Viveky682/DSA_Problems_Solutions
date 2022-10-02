Profit Maximisation InterviewBit
public class Solution {
    public int solve(int[] A, int B) {
        PriorityQueue<Integer>pq =new PriorityQueue<>();
        int sum=0;
        int count=0;
        for(int i:A){
            pq.add(-i);
        }
        for(int j=0;j<B;j++){
            count=pq.peek();
            sum-=count;
            int x= pq.peek()+1;
            pq.poll();
            pq.add(x);
     
            
        }
        return sum;
    }
}

// The trick in the question is 
Java by default makes min heap but we want to use max heap so we are just putting the negation of the numbers as a result we got max heap with negative numbers. Manage the numbers accordingly after that.