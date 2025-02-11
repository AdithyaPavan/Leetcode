class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int res=0;
        int n=fruits.length;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(fruits[i],mp.getOrDefault(fruits[i],0)+1);
            while(mp.size()>2){
                mp.put(fruits[l],mp.get(fruits[l])-1);
                if(mp.get(fruits[l])==0)mp.remove(fruits[l]);
                l++;
            }
            res=Math.max(res,i-l+1);
        }
        return res;

    }
}