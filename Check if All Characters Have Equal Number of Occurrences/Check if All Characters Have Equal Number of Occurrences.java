//1941. Check if All Characters Have Equal Number of Occurrences
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashSet<Integer> set= new HashSet<>();
        HashMap<Character,Integer> m= new HashMap<>();
        
        for(char c: s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(char c:m.keySet()){
            set.add(m.get(c));
        }
        if(set.size()==1) return true;
        else
            return false;
       
    }
}
