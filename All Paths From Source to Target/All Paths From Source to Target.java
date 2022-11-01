//797. All Paths From Source to Target

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> path= new ArrayList<>();
        path.add(0);
        dfs(graph,ans,path,0);
        return ans;
        
    }
    void dfs(int[][] graph, List<List<Integer>> ans,  List<Integer> path, int a){
        if(a==graph.length-1){
            ans.add(new ArrayList<Integer>(path));
        }
        else{
            for(int node: graph[a]){
                path.add(node);
                dfs(graph,ans,path,node);
                path.remove(path.size()-1);
            }
        }
    }
}