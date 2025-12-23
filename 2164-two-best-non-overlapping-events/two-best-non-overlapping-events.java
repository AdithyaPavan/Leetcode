class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        int res=0;
        int top=0;
        for(int e[]:events){
            int s=e[0];
            int en=e[1];
            int val=e[2];
            while(!pq.isEmpty()&& pq.peek()[1]<s){
                top=Math.max(top,pq.poll()[2]);
            }
            res=Math.max(res,top+val);
            pq.offer(e);
        }
        return res;

    }
}