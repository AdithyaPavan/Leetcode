
class Solution{
    public long putMarbles(int[] arr,int k){
        if(k==1)return 0;
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)res.add(arr[i]+arr[i+1]);
        Collections.sort(res);
        long mini=0,maxi=0;
        for(int i=0;i<k-1;i++){
            mini+=res.get(i);
            maxi+=res.get(res.size()-1-i);
        }
        return maxi-mini;
    }
}