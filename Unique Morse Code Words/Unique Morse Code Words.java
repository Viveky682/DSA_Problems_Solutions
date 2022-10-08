//804. Unique Morse Code Words

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
      HashMap<Character, String> m= new HashMap<>();
        HashSet<String> word= new HashSet<>();
        int ascii=97;
        String[] s=new String[words.length];
        String character[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        
        for(int i=0;i<26;i++){
            m.put((char)ascii,character[i]);
            ascii++;
        }
        for(int i=0;i<words.length;i++){
            for(char c:words[i].toCharArray()){
                s[i]+=m.get(c);
            }
            word.add(s[i]);
        }
         // System.out.println();
        return word.size();
    }
}

