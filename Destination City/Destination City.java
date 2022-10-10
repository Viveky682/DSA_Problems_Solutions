//1436. Destination City
class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet <String> s= new HashSet<>();
        int size= paths.size();
        // String r= paths.get(size-1).get(1);
        for(List<String> path:paths){
            s.add(path.get(0));
        }
        for(List<String> path: paths){
            if(!s.contains(path.get(1))) return path.get(1);
        }
        return "";
      
    }
}