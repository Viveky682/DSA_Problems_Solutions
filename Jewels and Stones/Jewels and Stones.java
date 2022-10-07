771. Jewels and Stones
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>m = new HashMap<>();
        int count=0;
        for(char c:stones.toCharArray())
            m.put(c,m.getOrDefault(c,0)+1);
        
      //  System.out.println(m);
        
        for(int i=0;i<jewels.length();i++)
        {
            if(m.containsKey(jewels.charAt(i)))
            {
                count+=m.get(jewels.charAt(i));
            }
            
        }
        
        return count;
    }
}