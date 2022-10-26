// 1282. Group the People Given the Group Size They Belong To
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> m=  new HashMap<>();
        List<List<Integer>> output= new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            if(!m.containsKey(groupSizes[i])){
               m.put(groupSizes[i], new ArrayList<Integer>()) ;
            }
            m.get(groupSizes[i]).add(i);
        }
        for(int n : m.keySet()){
            if(!(n==m.get(n).size())){
                int x=0;
                for(int i=n;i<=m.get(n).size();i+=n){
                List<Integer> temp= new ArrayList<>(m.get(n).subList(x, i));
                    x+=n;
                    output.add(temp);
                }
            }
            else
                output.add(m.get(n));
        }
        return output;
    }
}
