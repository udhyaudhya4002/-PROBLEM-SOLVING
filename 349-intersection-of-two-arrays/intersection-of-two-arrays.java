class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new LinkedHashSet<>();
        HashSet<Integer> set1=new LinkedHashSet<>();
        for(Integer i: nums1){
            set.add(i);
        }
           int ind=0;
      
         
         for(Integer i: nums2){
             if(set.contains(i)){
             set1.add(i);
             ind++;
              }
        }
        int[] arr=new int[set1.size()];
        int cnt=0;
        for(int i:set1){

            arr[cnt++]=i;

        }
      return arr;

    }
}