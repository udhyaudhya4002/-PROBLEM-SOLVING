class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod=10000_0000_7;
        int arr[]=new int[nums.length];
        int ans=0;
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
             arr[i]=(arr[i-1]*2)%mod;
        }
        int l=0,r=nums.length-1;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                ans=(ans+arr[r-l])%mod;
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    } 
}