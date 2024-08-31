class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sc=0;
        int sg=0;
        int res=0;
        int total=0;
        for(int i:gas){
            sg+=i;
        }
        for(int i:cost){
            sc+=i;
        }
        if(sc>sg){
            return -1;
        }
        for(int i=0;i<cost.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                res=i+1;
            }
        }
        return res;
    }
}