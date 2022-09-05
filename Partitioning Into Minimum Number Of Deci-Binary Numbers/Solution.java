class Solution {
    public int minPartitions(String n) {
        int l=n.length();
        int maxn=0;
        for(char c: n.toCharArray()){
            int digit=c-'0';
            maxn= Math.max(digit, maxn);
        }
        return maxn;
    }
}