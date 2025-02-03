class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int []>q=new LinkedList<>();
        int res=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean [][]v=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});

                }
                if(grid[i][j]==1){
                    res++;
                }
            }
        }
        if(res==0) return 0;
        if(q.isEmpty()) return -1;
        int min=-1;
        int [][]dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size=q.size();
            min++;
            for(int i=0;i<size;i++){
                int []temp=q.poll();
                int x=temp[0];
                int y=temp[1];
                for(int []d:dir){
                    int x1=x+d[0];
                    int y1=y+d[1];
                    if(x1>=0&&x1<n&&y1>=0&&y1<m&&grid[x1][y1]==1&&!v[x1][y1]){
                        v[x1][y1]=true;
                        res--;
                        q.offer(new int[]{x1,y1});
                    }
                }
            }
        }
        if(res>0) return -1;
        return min;

    }
}