class Solution {
public:
    int countPaths(int n, vector<vector<int>>& roads) {
        vector<vector<pair<int,int>>>adj(n);
        for(auto it: roads){
            adj[it[0]].push_back({it[1],it[2]});
            adj[it[1]].push_back({it[0],it[2]});
        }
        priority_queue<pair<long long int,int>,vector<pair<long long int,int>>,greater<pair<long long int,int>>>pq;
        pq.push({0,0});
        vector<long long int>dist(n,LLONG_MAX);
        vector< int> ways_to_reach(n,0);
        ways_to_reach[0]=1;
        dist[0]=0;
        int mod=1e9+7;
        while(!pq.empty()){
            int node=pq.top().second;
            auto distance=pq.top().first;
            pq.pop();
            for(auto it: adj[node]){
                int next=it.first;
                int cost=it.second;
                if(dist[next]>cost+distance){
                    ways_to_reach[next]=ways_to_reach[node];
                    dist[next]=cost+distance;
                    pq.push({dist[next],next});
                }
                else if(dist[next]==cost+distance){
                    ways_to_reach[next]=(ways_to_reach[next]+ways_to_reach[node])%mod;
                }
            }
        }
        return ways_to_reach[n-1];

    }
};