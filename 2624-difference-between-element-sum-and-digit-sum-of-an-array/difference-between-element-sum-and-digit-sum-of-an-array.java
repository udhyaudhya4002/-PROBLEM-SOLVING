class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dig=0;
        for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          if(nums[i]<=9){
            dig+=nums[i];
          }
          else{
            int temp=nums[i];
            while(temp!=0){
               int rem=temp%10;
               dig+=rem;
               temp/=10;
            }
          }
        }
        // System.out.print(sum+" "+dig);
        return sum-dig;
    }
}