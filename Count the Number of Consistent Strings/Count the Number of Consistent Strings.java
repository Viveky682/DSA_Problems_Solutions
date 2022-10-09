//1684. Count the Number of Consistent Strings
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>s= new HashSet<>();
        int count=0;
        boolean flag= false;
         for(char c:allowed.toCharArray()){
             s.add(c);
             
         }
        
        for(int i=0;i<words.length;i++){
        for(char c:words[i].toCharArray()){
            if(!s.contains(c)){
                flag=false;
                break;
            }
            else
                flag=true;
            
        }
            if(flag==true)
                count++;
            
        }
        return count;
    }
}