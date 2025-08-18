class Solution {
    public int findLHS(int[] nums) {
        int l=0,r=1;
        int res=0;
        Arrays.sort(nums);
        while(r<nums.length){
            int diff=nums[r]-nums[l];
            if(diff==1) res=Math.max(res,r-l+1);
            if(diff<=1)r++;
            else l++;
        }
        return res;
    }
}