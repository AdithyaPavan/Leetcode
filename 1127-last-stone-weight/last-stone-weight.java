class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a); 
       for(int i:stones){
        pq.offer(i);
       }
       while(!pq.isEmpty()){
            int maxi=pq.poll();
            if(pq.isEmpty())return maxi;
            int secmaxi=pq.poll();
            int val=maxi-secmaxi;
            if(val>0)pq.offer(val);


       }
       return 0;
    }
}