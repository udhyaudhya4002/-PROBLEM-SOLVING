class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int elm=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                elm=nums[i];
            }
            else if(elm==nums[i]) cnt++;
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
          if(nums[i]==elm){
            cnt1++;
          }
           
        }
        if(cnt1>n/2){
        return elm;}
      return -1;
    }
}