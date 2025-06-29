class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int mod = 1_000_000_007;
        int[] pow2 = new int[n];
        pow2[0]=1;
        for(int i =1; i<n;i++){
            pow2[i]= (pow2[i-1]*2)%mod;
        }
        int left =0; 
        int right = nums.length-1;
        int ans =0;
        while(left<=right){
            if(nums[left]+nums[right]>target) right--;
            else {
                ans= (ans+pow2[right-left])%mod;
                left++;
            }
        }
        return ans; 
    }
}