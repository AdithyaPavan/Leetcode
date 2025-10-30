class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int res=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    res++;
                    bfs(grid,i,j,r,c);
                }
            }
        }
        return res;
    }
    public void bfs(char[][] grid,int i,int j,int r,int c){
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{i,j});
        grid[i][j]='0';
        int [][]dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int p[]=q.poll();
            int x1=p[0];
            int y1=p[1];
            for(int d[]:dir){
                int nr=x1+d[0];
                int nc=y1+d[1];
                if(nr>=0&&nr<r&&nc>=0&&nc<c&&grid[nr][nc]=='1'){
                    q.add(new int[]{nr,nc});
                    grid[nr][nc]='0';
                }
            }
        }
    }
}