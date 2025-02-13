class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Double>pq=new PriorityQueue<>();
        for(int i:nums)pq.add((double)i);
        int res=0;
        double x,y;
        while(pq.size()>=2){
            x=pq.poll();
            y=pq.poll();
            if(x>=k)return res;
            pq.add(2*Math.min(x,y)+Math.max(x,y));
            res++;
        }return res;
    }
}