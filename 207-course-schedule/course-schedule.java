class Solution {
    public boolean canFinish(int courses, int[][] preq) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<courses;i++){
            adj.add(new ArrayList<>());
        }
        for(int []p:preq){
            adj.get(p[1]).add(p[0]);
        }
        boolean [] vis=new boolean[courses];
        boolean [] path=new boolean[courses];
        for(int i=0;i<courses;i++){
            if(!vis[i]&&dfs(i,adj,vis,path))return false;
        }
        return true;
    }
    public boolean dfs(int node,List<List<Integer>>adj,boolean[] vis,boolean[] path){
        vis[node]=path[node]=true;
        for (int next : adj.get(node))
            if (!vis[next] && dfs(next, adj, vis, path)) return true;
            else if (path[next]) return true;
            
        path[node] = false;
        return false;
    }
}