//1832. Check if the Sentence Is Pangram
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> s= new HashSet<>();
        sentence=sentence.trim();
        for(char c: sentence.toCharArray()){
            s.add(c);
        }
        System.out.println(s);
        if(s.size()==26)
        return true;
        else 
            return false;
    }
}