class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),i);
        }
        List<Integer>arr=new ArrayList<>();
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            r=Math.max(r,mp.get(s.charAt(i)));
            if(i==r){
                arr.add(r-l+1);
                l=r+1;
            }
        }return arr;
    }
}