class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
       int l=0,r=1;
       int res=0;
       int le=Integer.MIN_VALUE;
       int re=Integer.MAX_VALUE;
       while(l<nums.length && r<nums.length){
          if(nums[r]-nums[l]==k){
            if(!(nums[l]==le && nums[r]==re)){
                res++;
                le=nums[l];
                re=nums[r];
                
            }
            l++;
            r++;
          }
          else if(nums[r]-nums[l]<k){
            r++;
          }
          else if(nums[r]-nums[l]>k){
            l++;
          }
          if(l==r) r++;
       }
       return res;
       }
}