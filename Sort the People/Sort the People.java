2418. Sort the People

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> m= new HashMap<>();
        for(int i=0;i<heights.length;i++){
            m.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] result= new String[names.length];
        for(int i=names.length-1,j=0;i>=0 && j<names.length;i--,j++){
            
            result[j]=m.get(heights[i]);
            
        }
        return result;
    }
}