class Solution {
public:
    int countBattleships(vector<vector<char>>& board) {
        int r=board.size();
        int c=board[0].size();
        int res=0;
        vector<pair<int,int>>dir={{-1,0},{1,0},{0,-1},{0,1}};
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='X'){
                    res++;
                    queue<pair<int,int>>q;
                    q.push({i,j});
                    board[i][j]='.';
                    while(!q.empty()){
                        auto curr=q.front();
                        q.pop();
                        int x=curr.first;
                        int y=curr.second;
                        for(auto &d:dir){
                            int nx=x+d.first;
                            int ny=y+d.second;
                            if(nx>=0&&nx<r&&ny>=0&&ny<c&&board[nx][ny]=='X'){
                                q.push({nx,ny});
                                board[nx][ny]='.';
                            }
                        }

                    }

                }
            }
        }return res;
    }
};