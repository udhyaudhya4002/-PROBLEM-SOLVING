class Solution {
   static {
    for(int i=0;i<500;i++){
    }
   }
    public int minimumDifference(int[] arr, int k) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        int j=k-1;
        for(int i=0;i<=arr.length-k;i++){
           min=Math.min(min,arr[i+k-1]-arr[i]);
           System.out.print(min);
        }
        return min;
    }
}