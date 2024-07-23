class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        for(int i:bills){
            if(i==5){
                f++;
            }else if(i==10){
                if(f>=1){
                    f--;
                    t++;
                }else{
                    return false;
                }
            }else{
                if(f>=1 && t>=1){
                    f--;
                    t--;
                }else if(f>=3){
                    f--;
                    f--;
                    f--;

                }else{
                    return false;
                }
            }
        }
        return true;
    }
}