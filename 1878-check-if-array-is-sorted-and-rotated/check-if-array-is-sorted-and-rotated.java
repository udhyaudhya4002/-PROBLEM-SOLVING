class Solution {
    public boolean check(int[] arr) {
        boolean flg=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                if(flg)
                    return false;
                else
                    flg=true;
            }
        }
           
         if(flg)
         return arr[arr.length-1]<=arr[0];
         return true;
    }
}