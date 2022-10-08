//2325. Decode the Message

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character>m= new HashMap<>();
        key = key.replaceAll("\\s", "");
        String result="";
        int ascii=97;
        for(char c:key.toCharArray()){
            
            if(!m.containsKey(c)){
                m.put(c,(char)ascii);
                ascii++;
            }
            
         }
        for(char c:message.toCharArray()){
            
            if(c==' ')
               result= result+c;
            else{
                result=result+m.get(c);
            }
        }
        return result;
    } 
}