class Solution {
    public int[] findOrder(int courses, int[][] preq) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<courses;i++){
            adj.add(new ArrayList<>());
        }
        int ind[]=new int[courses];
        for(int p[]:preq){
            adj.get(p[1]).add(p[0]);
            ind[p[0]]++;

        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<courses;i++){
            if(ind[i]==0)q.add(i);
        }
        
        int cnt=0;
        List<Integer>res=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int i:adj.get(node)){
                ind[i]--;
                if(ind[i]==0)q.add(i);
            }
                    
        }
        if(res.size()!=courses)return new int[0];
        int ans[]=new int[courses];
        for(int i=0;i<courses;i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}