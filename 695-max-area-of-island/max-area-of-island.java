class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean [][]v=new boolean[r][c];
        int maxi=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1&&!v[i][j]){
                    maxi=Math.max(maxi,dfs(grid,i,j,r,c,v));
                }
            }
        }return maxi;
    }
    public int dfs(int[][] grid,int i,int j,int r,int c,boolean [][]v){
        if(i<0||i>=r||j<0||j>=c||v[i][j]||grid[i][j]==0)return 0;
        v[i][j]=true;
        return 1+dfs(grid,i+1,j,r,c,v)+dfs(grid,i-1,j,r,c,v)+dfs(grid,i,j+1,r,c,v)+dfs(grid,i,j-1,r,c,v);
    }
}