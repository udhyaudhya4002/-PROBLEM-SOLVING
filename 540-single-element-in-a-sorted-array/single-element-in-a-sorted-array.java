class Solution {
    public int singleNonDuplicate(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        // for(int i:nums){
        //      map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> et:map.entrySet()){
        //      if(et.getValue()==1){
        //         return et.getKey();
        //      }
        // }
        // return 0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}