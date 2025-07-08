class Solution {
    public int maxEvents(int[][] event) {
        Arrays.sort(event,(a,b)->Integer.compare(a[0],b[0]));
        int day=0;
        int res=0;
        int n=event.length;
        int i=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        while(!pq.isEmpty()||i<n){
            if(pq.isEmpty()){
                day=event[i][0];
            }
            while(i<n && event[i][0]<=day){
                pq.offer(event[i][1]);
                i++;
            }
            pq.poll();
            res++;
            day++;
            while(!pq.isEmpty() && day>pq.peek()){
                pq.poll();
            }
        }
        return res;

    }
}