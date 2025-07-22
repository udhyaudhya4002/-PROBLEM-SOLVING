class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int s=0,cursum=0,maxsum=0;
        boolean[] isin=new boolean[10001];
        for(int e=0;e<nums.length;e++){
            while(isin[nums[e]]){
                isin[nums[s]]=false;
                cursum-=nums[s];
                s++;
            }
            isin[nums[e]]=true;
            cursum+=nums[e];
            maxsum=Math.max(maxsum,cursum);
        }
        return maxsum;
    }
}