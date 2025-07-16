class Solution {
    public int maximumLength(int[] nums) {
        int even=0;
        int odd=0;
        int altev=0,altodd=0;
        for(int num:nums){
            int p=num%2;
            if(p==0){
                even++;
                altev=altodd+1;
            }
            else{
                odd++;
                altodd=altev+1;
            }
        }
        return Math.max(Math.max(even,odd),Math.max(altodd,altev));
       
    }
}