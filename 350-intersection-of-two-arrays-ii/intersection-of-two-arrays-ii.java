class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
          int j=0,i=0,k=0;
          Arrays.sort(nums1);
          Arrays.sort(nums2);
          int l1=nums1.length,l2=nums2.length;
          while(i<l1 && j<l2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                nums1[k++]=nums1[i++];
                j++;
            }
          }
          return Arrays.copyOfRange(nums1,0,k);
        
    }
}